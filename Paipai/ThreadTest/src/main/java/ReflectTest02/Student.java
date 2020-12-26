package ReflectTest02;

public class Student {
    public Student(int no, String name) {
        this.no = no;
        this.name = name;
    }

    public Student() {

    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public int no;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String name;

    public String doSome(String s){
        System.out.println(s);
        return s;
    }

}
