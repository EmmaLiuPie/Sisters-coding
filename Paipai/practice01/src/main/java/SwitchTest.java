public class SwitchTest {

    public static void main(String[] args) {
        java.util.Scanner s1 = new java.util.Scanner(System.in);
        System.out.print("please input the first number:");
        int num1=s1.nextInt();

        java.util.Scanner op = new java.util.Scanner(System.in);
        System.out.print("please input the oper:");
        String oper=op.next();

        java.util.Scanner s2 = new java.util.Scanner(System.in);
        System.out.print("please input the second number:");
        int num2=s2.nextInt();

        switch(oper){
            case "+":System.out.println(num1+"+"+num2+"="+num1+num2);break;
            case "-":System.out.println(num1+"-"+num2+"="+(num1-num2));break;
            case "*":System.out.println(num1+"*"+num2+"="+num1*num2);break;
            case "//":System.out.println(num1+"/"+num2+"="+num1/num2);break;
        }

    }


}
