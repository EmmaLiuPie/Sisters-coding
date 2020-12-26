package ReflectTest02;

import java.lang.reflect.Field;

public class Test02 {
    public static void main(String[] args) throws Exception{
        Class classname = Class.forName("ReflectTest02.Student");
        Object obj = classname.newInstance();
        Field nameField = classname.getDeclaredField("name");
        nameField.set(obj,"abc");

        System.out.println(nameField.get(obj));



    }
}
