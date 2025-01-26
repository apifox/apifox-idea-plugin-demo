package com.example.springtest.httpClient;

import okhttp3.*;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.security.cert.X509Certificate;
import java.util.Base64;

public class ProxyAuthOKhttp {

    public static void main(String[] args) throws IOException {

        System.out.println(System.getenv("HTTP_PROXY"));
        System.out.println(System.getenv("HTTPS_PROXY"));


        // 创建代理对象
        Proxy proxy = new Proxy(Proxy.Type.HTTP, new InetSocketAddress("127.0.0.1", 8090));
        // 创建 OkHttpClient，设置代理和认证
        OkHttpClient client = new OkHttpClient.Builder()
                .proxy(proxy)  // 设置代理
                .proxyAuthenticator((route, response) -> {
                    // 添加代理认证
                    String credentials = "admin1:admin";  // 用户名和密码
                    String encodedCredentials = Base64.getEncoder().encodeToString(credentials.getBytes());
                    return response.request().newBuilder()
                            .header("Proxy-Authorization", "Basic " + encodedCredentials)
//                            .header("Proxy-Connection", "Keep-Alive")
                            .build();
                })
//                .proxyAuthenticator(JavaNetAuthenticator())
//                .authenticator(Authenticator.JAVA_NET_AUTHENTICATOR)
                .sslSocketFactory(getTrustAllSSLSocketFactory(), getTrustAllTrustManager())
                .hostnameVerifier((hostname, session) -> true)  // 不校验主机名
                .build();

        // 创建请求
        Request request = new Request.Builder()
//                .header("Proxy-Authorization", "Basic YWRtaW46YWRtaW4=")  // 添加 Authorization 头
                .url("http://httpbin.org/get")
                .build();

        try (Response response = client.newCall(request).execute()) {
            if (!response.isSuccessful()) {
                System.out.println("请求失败，状态码: " + response.code());
                return;
            }

            // 获取响应头
            Headers headers = response.headers();
            for (int i = 0; i < headers.size(); i++) {
                System.out.println(headers.name(i) + ": " + headers.value(i));
            }

            // 获取响应体
            String responseBody = response.body().string();
            System.out.println("响应体内容：");
            System.out.println(responseBody);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // 添加以下方法
    private static SSLSocketFactory getTrustAllSSLSocketFactory() {
        try {
            SSLContext sslContext = SSLContext.getInstance("SSL");
            sslContext.init(null, new TrustManager[]{getTrustAllTrustManager()}, new java.security.SecureRandom());
            return sslContext.getSocketFactory();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    private static X509TrustManager getTrustAllTrustManager() {
        return new X509TrustManager() {
            @Override
            public void checkClientTrusted(X509Certificate[] chain, String authType) {
            }

            @Override
            public void checkServerTrusted(X509Certificate[] chain, String authType) {
            }

            @Override
            public X509Certificate[] getAcceptedIssuers() {
                return new X509Certificate[0];
            }
        };
    }

}
