package BundleTest;

import java.util.ResourceBundle;

public class Test01 {
    public static void main(String[] args) throws Exception{
        ResourceBundle bundle = ResourceBundle.getBundle("classinfo");
        //D:\Git\Sisters-coding\Paipai\ThreadTest\src\classinfo.properties
        String classname = bundle.getString("classname");
        Class c1 = Class.forName(classname);
        System.out.println(c1);
        System.out.println(classname);
    }
}
