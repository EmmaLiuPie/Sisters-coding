public class Test02 {

    public static void main(String[] args){
        int i=10;
        int j=20;
        int result1,result2;
        result1 =sumInt(i,j);
        result2=divideInt(i,j);

    }


    public static int sumInt(int i, int j) {
        int r=i+j;
        System.out.println(r);
        return r;

    }
    public static int divideInt(int i, int j) {
        int r=i/j;
        System.out.println(r);
        return r;

    }

}
