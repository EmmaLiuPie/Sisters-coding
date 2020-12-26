package ReflectTest01;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
public class Test03 {
    public static void main(String[] args) throws IOException, ClassNotFoundException, IllegalAccessException, InstantiationException {
        FileReader filereader = new FileReader("src/classinfo.properties");
        Properties pro = new Properties();
        pro.load(filereader);
        filereader.close();
        String classname = pro.getProperty("classname");

        Class c1 = Class.forName(classname);

        Object obj1 = c1.newInstance();
        System.out.println(obj1);
        System.out.println("文件获取类名，反射机制创建实例对象");

    }
}
