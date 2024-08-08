package assignment_functions;

public class Q13 {
    public static void main(String[] args){
        primeseries(2, 13);
    }

    // method to print prime numbers between range
    static void primeseries(int a, int b){
        if(a == 2){
            System.out.print(2 + " ");
            for (int i = a + 1;i <= b;i += 2){
                if(isprime(i)){
                    System.out.print(i + " ");
                }
            }
        }

        else if(a % 2 == 0){
            for (int i = a + 1;i <= b;i += 2){
                if(isprime(i)){
                    System.out.print(i + " ");
                }
            }
        }
        
        else{
            for(int i = a; i <= b; i +=2){
                if(isprime(i)){
                    System.out.print(i + " ");
                }
            }
        }
    }

    // method to check prime number
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
