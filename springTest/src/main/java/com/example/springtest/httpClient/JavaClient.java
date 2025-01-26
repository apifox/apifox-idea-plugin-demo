package com.example.springtest.httpClient;

import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Authenticator;
import java.net.InetSocketAddress;
import java.net.PasswordAuthentication;
import java.net.Proxy;
import java.net.URL;
import java.net.HttpURLConnection;
import java.security.cert.X509Certificate;
import java.util.Base64;

public class JavaClient {

    public static void main(String[] args) throws IOException {
        // 忽略证书验证
        trustAllCertificates();

        // 设置代理
        Proxy proxy = new Proxy(Proxy.Type.HTTP, new InetSocketAddress("admin:admin@192.168.10.162", 7890));

        // 设置代理认证
        Authenticator.setDefault(new Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication("admin", "admin".toCharArray());
            }
        });

        // 目标 URL
        URL url = new URL("https://baidu.com");

        // 打开连接
        HttpURLConnection connection = (HttpURLConnection) url.openConnection(proxy);

        // 设置请求方法
        connection.setRequestMethod("GET");

        // 添加代理认证头
        String credentials = "admin:admin";
        String encodedCredentials = Base64.getEncoder().encodeToString(credentials.getBytes());
        connection.setRequestProperty("Proxy-Authorization", "Basic " + encodedCredentials);

        // 发起请求
        connection.connect();

        // 获取响应码
        int responseCode = connection.getResponseCode();
        System.out.println("响应码: " + responseCode);

        // 读取响应体
        if (responseCode == HttpURLConnection.HTTP_OK) {
            BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            String inputLine;
            StringBuilder response = new StringBuilder();

            while ((inputLine = in.readLine()) != null) {
                response.append(inputLine);
            }
            in.close();

            // 打印响应体
            System.out.println("响应体内容：");
            System.out.println(response.toString());
        } else {
            System.out.println("请求失败，响应码: " + responseCode);
        }

        // 关闭连接
        connection.disconnect();
    }

    // 忽略所有证书验证
    private static void trustAllCertificates() {
        try {
            // 创建信任所有证书的 TrustManager
            TrustManager[] trustAllCerts = new TrustManager[]{
                    new X509TrustManager() {
                        public X509Certificate[] getAcceptedIssuers() {
                            return new X509Certificate[0];
                        }
                        public void checkClientTrusted(X509Certificate[] certs, String authType) {
                        }
                        public void checkServerTrusted(X509Certificate[] certs, String authType) {
                        }
                    }
            };

            // 初始化 SSLContext
            SSLContext sslContext = SSLContext.getInstance("SSL");
            sslContext.init(null, trustAllCerts, new java.security.SecureRandom());
            HttpsURLConnection.setDefaultSSLSocketFactory(sslContext.getSocketFactory());

            // 忽略主机名验证
            HttpsURLConnection.setDefaultHostnameVerifier((hostname, session) -> true);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
