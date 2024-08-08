package assignment_functions;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int age = in.nextInt();
        if(eligible(age)){
            System.out.println("eligible to vote");
        }
        else{
            System.out.println("not eligible to vote");
        }
        in.close();

    }

    static boolean eligible(int age){
        if (age >= 18){
            return true;
        }
        else{
            return false;
        }
    }
}
