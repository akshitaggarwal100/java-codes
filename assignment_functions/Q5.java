package assignment_functions;
import java.util.Scanner;;
public class Q5 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("enter first number: ");
        int a = in.nextInt();
        System.out.print("enter second number: ");
        int b = in.nextInt();
        System.out.println(product(a, b));
        in.close();
    }

    static int product(int a, int b){
        return a * b;
    }
}
