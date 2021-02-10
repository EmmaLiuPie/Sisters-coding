package com.liupai.httpinterfacetest;

import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;

//post请求
public class Test2 {
    public static void main(String[] args) {
        CloseableHttpClient client = HttpClients.createDefault();
        //构建和发送RESTful post请求
        HttpPost rest = new HttpPost("http://localhost:8080/mobilePhone");
        StringEntity stringEntity = new StringEntity("{\"brand\":\"Motorla\",\"mobile\":\"moto Z Play\",\"os\":\"Android\"}", ContentType.APPLICATION_JSON);
        rest.setEntity(stringEntity);
        CloseableHttpResponse response = null;
        try {
            response = client.execute(rest);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
