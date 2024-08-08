package assignment_functions;
import java.util.Scanner;

public class Q1 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        System.out.print("enter first number: ");
        int a = in.nextInt();
        System.out.print("enter second number: ");
        int b = in.nextInt();
        System.out.print("enter third number: ");
        int c = in.nextInt();

        System.out.println("the max number is : " + max(a,b,c));
        System.out.println("the min number is : " + min(a,b,c));

        in.close();

    }

    // max function
    static int max(int p, int q, int r){
        int max = p;
        if (q > max && q > r) {
            return q;
        }
        else if (r > max && r > q){
            return r;
        }
        else{
            return max;
        }
    }

    // min function
    static int min(int p, int q, int r){
        int min = p;
        if (q < min && q < r){
            return q;
        }
        else if (r < min && r <q) {
            return r;
        }
        else{
            return min;
        }
    }

}
