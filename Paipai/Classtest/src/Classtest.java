
public class Classtest {
    public static void main(String[] args) {

        Student pp = getStudent();

        Address myAddress = new Address();
        myAddress.Province1 = "Liaoning";
        pp.add = myAddress;

        pp.add.City1 = "jinzhou";
        pp.add.Street1 = "chengdujie";

//        System.out.println(pp.age +" "+ pp.no+"  " +pp.name+pp.add.Province1+pp.add.City1+pp.add.Street1);
    }

    private Student getStudent() {
        Student pp = new Student();
        pp.age = 18 ;
        pp.no = 1;
        pp.name = "pp";
        if (pp.add.m == null) {
            System.out.println("null");
        }
        return pp;
    }

}

class Student {
    String name;
    int age;
    int no;
    Address add;
//     = new Address();
}

class Address {
    String Province1;
    String City1;
    String Street1;
    APK m = new APK();
}

class APK {

    int t;
}
