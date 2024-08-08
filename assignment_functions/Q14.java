package assignment_functions;

public class Q14 {
    public static void main(String[] args){
        System.out.println(sumn(6));
    }

    // method to return sum of n natural numbers
    static int sumn(int n){
        int ans = (n * (n+1)) / 2;
        return ans;
    }
}
