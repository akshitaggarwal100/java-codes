package assignment_functions;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        System.out.println(even(a));
        in.close();
    }

    // even or odd function
    static String even(int n){
        if(n % 2 == 0){
            return "even";
        }
        else{
            return "odd";
        }
    }

}
