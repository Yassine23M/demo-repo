import java.util.*;
public class Calculator {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.print("the result are: ");
        int result = add(a,b);
        System.out.print(result);
    }

    public static int add(int a, int b){
        return a+b;
    }
}
