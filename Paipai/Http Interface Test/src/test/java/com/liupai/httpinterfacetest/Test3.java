package com.liupai.httpinterfacetest;

import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;

//处理服务器响应
public class Test3 {
    public static void main(String[] args) {
        CloseableHttpClient client = HttpClients.createDefault();
        HttpGet httpGet = new HttpGet("http://localhost:8080/mobilePhone?model=iPhone+6s");
        CloseableHttpResponse response=null;
        try {
            response = client.execute(httpGet);
            System.out.println(response.getProtocolVersion());//HTTP/1.1
            System.out.println(response.getStatusLine().toString());//HTTP/1.1 200
            System.out.println(response.getStatusLine().getStatusCode());//200
            HttpEntity httpEntity = response.getEntity();
            System.out.println(httpEntity.getContentType());
            response.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
