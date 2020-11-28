package cn.lp;

import junit.framework.TestCase;
import org.testng.annotations.AfterClass;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class Test01Test extends TestCase {
    @BeforeMethod
    public void setUp() throws Exception {
        super.setUp();
        System.out.println("Test is ready!");
    }
    @AfterClass
    public void tearDown() throws Exception {
        System.out.println("Test is finish!");
    }
    @Test
    public void testSum() {
        System.out.println("Testing...");
    }
    @Test
    public void testfun(){
        System.out.println("test fun!");
    }





}