package com.liupai.httpinterfacetest;
//设置请求头
import org.apache.http.Header;
import org.apache.http.client.methods.HttpPost;

public class Test4 {
    public static void main(String[] args) {
        HttpPost httpPost = new HttpPost("hppt:ip:port/uri");
        httpPost.addHeader("Cookie","key1=value1;kay2=value2");
        httpPost.addHeader("User-Agent","My User Agent");
        for(Header header:httpPost.getAllHeaders()){
            System.out.println(header);
        }
    }
}
