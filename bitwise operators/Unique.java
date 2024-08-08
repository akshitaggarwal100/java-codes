public class Unique {
    public static void main(String[] args) {
        int[] arr = {2, 2, 3, 4, 4};
        System.out.println(findUnique(arr));
    }

    static int findUnique(int[] arr) {
        int unique = 0;
        for (int i : arr) {
            unique ^= i;
            // System.out.println(unique);
        }
        return unique;
    }
}