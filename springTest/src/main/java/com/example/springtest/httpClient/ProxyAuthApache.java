package com.example.springtest.httpClient;

import org.apache.http.HttpEntity;
import org.apache.http.HttpHost;
import org.apache.http.HttpResponse;
import org.apache.http.auth.AuthScope;
import org.apache.http.auth.UsernamePasswordCredentials;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.*;
import org.apache.http.util.EntityUtils;

public class ProxyAuthApache {

    public static void main(String[] args) throws Exception {
        DefaultHttpClient httpclient = new DefaultHttpClient();
        try {
            // 设置代理认证信息
            httpclient.getCredentialsProvider().setCredentials(
                    new AuthScope("localhost", 8888),  // 代理的主机和端口
                    new UsernamePasswordCredentials("admin", "admin")  // 代理的用户名和密码
            );
            // 设置代理认证策略
            httpclient.setProxyAuthenticationStrategy(ProxyAuthenticationStrategy.INSTANCE);
            // 设置代理
            HttpHost proxy = new HttpHost("localhost", 8888);  // 代理的主机和端口
            httpclient.getParams().setParameter(org.apache.http.conn.params.ConnRoutePNames.DEFAULT_PROXY, proxy);
            // 创建请求
            HttpPost httpget = new HttpPost("http://echo.apifox.com/post");
            System.out.println("executing request: " + httpget.getRequestLine());
            System.out.println("to target: ");
            // 发送请求
            HttpResponse response = httpclient.execute(httpget);
            HttpEntity entity = response.getEntity();
            // 打印响应信息
            System.out.println("----------------------------------------");
            System.out.println(response.getStatusLine());
            if (entity != null) {
                System.out.println("Response content length: " + entity.getContentLength());
            }
            EntityUtils.consume(entity);
        } finally {
            // 关闭连接管理器
            httpclient.getConnectionManager().shutdown();
        }
    }

}
