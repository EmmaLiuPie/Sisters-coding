package ReflectTest02;

import java.lang.reflect.Method;

public class Test03 {
    public static void main(String[] args) throws Exception{
        Class classname = Class.forName("ReflectTest02.Student");
        Object obj = classname.newInstance();
        Method m = classname.getDeclaredMethod("doSome", String.class);
        Object ret = m.invoke(obj,"abs");
        System.out.println(ret);


    }
}
