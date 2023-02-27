import java.util.Arrays;

public class varArgs {
    public static void main(String[] args) {
var(2,3,4,34,45,445);
    }
    static void var(int...v){
        System.out.println(Arrays.toString(v));
    }
}
