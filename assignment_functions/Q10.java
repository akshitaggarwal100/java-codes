package assignment_functions;

public class Q10 {
    public static void main(String[] args){
        System.out.println(pal(11611));
    }

    // method to check pallindrome
    static boolean pal(int n){
        int org = n;
        int rev = 0;
        while(n>0){
            int rem = n % 10;
            rev = (rev * 10) + rem;
            n /= 10;
        }
        return org == rev;
    }
}
