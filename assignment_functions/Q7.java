package assignment_functions;

import java.util.Scanner;

public class Q7 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(isprime(n));
        in.close();
    }

    static boolean isprime(int n){
        if (n <= 1){
            return false;
        }
        else{
            int c = 2;
            while (c * c <= n){
            if (n % c == 0){
                return false;
                }
            c++;
            }
        return true;
        }
    }
}
