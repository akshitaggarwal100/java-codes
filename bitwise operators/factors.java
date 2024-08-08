import java.util.ArrayList;

public class factors {
    public static void main(String[] args) {
        fact2(24);
    }

    static void fact(int number) {
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                System.out.println(i);
            }
        }
    }

    static void fact2(int number) {
        ArrayList<Integer> nums = new ArrayList<>();
        for (int i = 1; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                if (number / i == i) {
                    System.out.println(i);
                }

                else {
                    System.out.println(i);
                    nums.add(number / i);
                }
            }
        }

        for(int j = nums.size() - 1; j >= 0; j--) {
            System.out.println(nums.get(j));
        }
    }
}