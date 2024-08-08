public class CheckSorted {
    public static void main(String[] args) {
        int[] arr = {2, 5, 6, 9};
        System.out.println(check2(arr));
    }

    static boolean check(int[] array) {
        for(int i = 1; i < array.length; i++) {
            if (array[i - 1] > array[i]) {
                return false;
            }
        }
        return true;
    }

    static boolean check2(int[] array) {
        return helper(array, 1);
    }

    static boolean helper(int[] array, int pointer) {
        if (pointer == array.length) {
            return true;
        }

        if (array[pointer - 1] > array[pointer]) {
            return false;
        }

        return helper(array, ++pointer);
    }
}
