package ReflectTest02;

import java.lang.reflect.Field;

public class Test01 {
    public static void main(String[] args) throws Exception{
        Class classname = Class.forName("ReflectTest02.Student");
        Field[] fileds = classname.getFields();
        System.out.println(fileds.length);
        for( Field field:fileds){

            System.out.println(field);
            String f = field.getName();
            System.out.println(f);
            Class fieldType = field.getType();
            System.out.println(fieldType);
        }



    }
}
