public class Recursion {
    public static void main(String[] args){
        int s=0;
        s=result(4);
        System.out.println(s);

    }//求和
    public static int sum(int x){

        if (x==1) {
            return 1;
        }
        int s=x+sum(x-1);
        return s;
    }
    // 递归
     public static int result(int x){
        if (x==1){
            return 1;
        }
        int s=x*result(x-1);
        return s;
     }
}
