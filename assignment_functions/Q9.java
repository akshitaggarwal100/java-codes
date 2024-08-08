package assignment_functions;

public class Q9 {
    public static void main(String[] args){
        System.out.println(factorial(10));
    }

    // method for factorial
    static int factorial(int n){
        if (n == 0){
            return 1;
        }
        else{
            int ans = 1;
        while (n > 0) {
            ans *= n;
            n--;
        }
        return ans;
        }
    }
}
