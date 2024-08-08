import java.io.*;

public class fibonacci {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            int num = (int) reader.read();
            int fib1 = 0;
            int fib2 = 1;
            int fib3;
            for (int i = 0; i < num; i++) {
                fib3 = fib1 + fib2;
                
                System.out.println(num);
                fib1 = fib2;
                fib2 = fib3;

            }
        } catch (Exception e) {

        }
    }
}
