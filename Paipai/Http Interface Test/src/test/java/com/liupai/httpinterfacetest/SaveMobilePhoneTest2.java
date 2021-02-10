package com.liupai.httpinterfacetest;
//解析json字符串
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.json.JSONObject;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.io.IOException;

//testng集成httpclient post请求
public class SaveMobilePhoneTest2 {
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
    private JSONObject sendHttpPostRequest(CloseableHttpClient client,String stringEntity){
        JSONObject result = null;
        try{
            HttpPost httpPost = new HttpPost("http://localhost:8080/mobilePhone");
            httpPost.setEntity(new StringEntity(stringEntity,ContentType.APPLICATION_JSON));
            response = client.execute(httpPost);
            //解析字符串
            result = new JSONObject(EntityUtils.toString(response.getEntity()));
        }catch (Exception e){
            e.printStackTrace();
        }
        return result;
    }
//    private String sendHttpPostRequest(CloseableHttpClient client,String stringEntity){
//        String result = null;
//        HttpPost httpPost = new HttpPost("http://localhost:8080/mobilePhone");
//        httpPost.setEntity(new StringEntity(stringEntity, ContentType.APPLICATION_JSON));
//        try {
//            response = client.execute(httpPost);
//            result = EntityUtils.toString(response.getEntity());
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        return result;
//    }
}

