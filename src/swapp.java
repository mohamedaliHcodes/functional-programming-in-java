import java.util.Scanner;

public class swapp {
    public static void main(String[] args) {

        String name="mizee boss";
        naam("ringo");
    }
public static void swapp(){
    System.out.println("enter numbers to swap");
    Scanner in =new Scanner(System.in);
    int num1= in.nextInt();
    int num2= in.nextInt();
    // display before swapping
    System.out.println("before swapping num1 : " +num1);
    System.out.println("before swapping num2 : "+num2);

    int temp=num2;
    num2=num1;
    num1=temp;
    System.out.println("after the swapp num1 : "+num1);
    System.out.println("after the swapp num2 : "+num2);
}
public static String naam(String name){
    return name;
}
}
