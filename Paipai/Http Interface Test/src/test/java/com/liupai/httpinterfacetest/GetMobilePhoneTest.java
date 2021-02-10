package com.liupai.httpinterfacetest;
//tesgng集成httpclient get请求自动化用例
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

public class GetMobilePhoneTest {
    private CloseableHttpClient client;
    private CloseableHttpResponse response;

    @BeforeClass
    public void init(){
        client = HttpClients.createDefault();
    }

    @Test
    public void testCase1(){
        Assert.assertEquals("",sendHttpGetRequest(client,""));
    }
    @Test
    public void testCase2(){Assert.assertEquals("123",sendHttpGetRequest(client,""));}
    @AfterClass
    public void clear(){
        try {
            response.close();
            client.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    private String sendHttpGetRequest(CloseableHttpClient client,String model){
        String result = null;
        URI uri = null;
        try {
            uri = new URIBuilder().setScheme("http").setHost("localhost").setPort(8080).setPath("/mobilePhone").setParameter("model",model).build();
            response = client.execute(new HttpGet(uri));
            result = EntityUtils.toString(response.getEntity());
        } catch (Exception e) {
            e.printStackTrace();
        }
    return result;
    }
}
