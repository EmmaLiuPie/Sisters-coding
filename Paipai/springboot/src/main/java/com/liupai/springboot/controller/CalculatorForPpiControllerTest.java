package com.liupai.springboot.controller;

import com.liupai.springboot.Application;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

@SpringBootTest(classes = {Application.class})
public class CalculatorForPpiControllerTest extends AbstractTestNGSpringContextTests {
    @Autowired
    private CalculatorForPpiController controller;
    private MockMvc mock;
    private RequestBuilder request;
    private String a;
    private String b;
    private String c;

    @BeforeClass
    public void init(){
        mock= MockMvcBuilders.standaloneSetup(controller).build();
        a="10";
        b="10";
        c="5";
    }

    @Test
    public void testCase1(){
        senRequest(a,b,c,"1000");
    }
    private void senRequest(String a,String b,String c,String excepted){
        request= MockMvcRequestBuilders.post("/calculate").param("a",a).param("b",b).param("c",c);
        try {
            mock.perform(request).andExpect(MockMvcResultMatchers.jsonPath("PPI").value(excepted));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
