package assignment_functions;

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("enter first number: ");
        int a = in.nextInt();
        System.out.print("enter second number: ");
        int b = in.nextInt();
        System.out.println(sum(a, b));
        in.close();
    }

    static int sum(int a, int b){
        return a + b;
    }
}
