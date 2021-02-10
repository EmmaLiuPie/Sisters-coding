package com.liupai.httpinterfacetest;
//post接口自动化测试用例编写
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.io.IOException;

//testng集成httpclient post请求
public class SaveMobilePhoneTest {
    private CloseableHttpClient client;
    private CloseableHttpResponse response;

    @BeforeClass
    public void init(){
        client = HttpClients.createDefault();
    }
    @Test
    public void testCase1(){
        Assert.assertEquals("{\"code\":0,\"message\":\"保存成功！\"}",sendHttpPostRequest(client,"{\"brand\":\"Motorola\",\"model\":\"moto Z Play\",\"os\":\"ANDROID\"}"));
    }
    @AfterClass
    public void clear(){
        try {
            response.close();
            client.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    private String sendHttpPostRequest(CloseableHttpClient client,String stringEntity){
       String result = null;
       HttpPost httpPost = new HttpPost("http://localhost:8080/mobilePhone");
       httpPost.setEntity(new StringEntity(stringEntity, ContentType.APPLICATION_JSON));
        try {
            response = client.execute(httpPost);

        result = EntityUtils.toString(response.getEntity());
            System.out.println(result);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }
}

