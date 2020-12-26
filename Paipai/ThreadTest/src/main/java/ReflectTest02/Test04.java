package ReflectTest02;

import java.lang.reflect.Constructor;

public class Test04 {
    public static void main(String[] args) throws Exception{
        Class classname = Class.forName("ReflectTest02.Student");
       // Object obj = classname.newInstance();
        Constructor con = classname.getDeclaredConstructor(int.class,String.class);
        Object newobj = con.newInstance(10,"abs");
        System.out.println(newobj);

        Constructor con2 = classname.getDeclaredConstructor();
        Object newobj2 = con2.newInstance();
        System.out.println(newobj2);
    }
}
