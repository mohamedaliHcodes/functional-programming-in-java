import java.util.Arrays;

public class mult {
    public static void main(String[] args) {
multi(7,7,"zak","sam","ric","sow");
    }
    static void multi(int a,int b,String...v){

        System.out.println(a);
        System.out.println(b);
        System.out.println(Arrays.toString(v));
    }
}
