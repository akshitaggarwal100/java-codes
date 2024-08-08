import java.util.Arrays;

public class MissingNumber {
    public static void main(String[] args) {
        int[] arr = {3, 0, 2, 1, 4};
        System.out.println(find(arr));;
        System.out.println(Arrays.toString(cSort(arr)));
    }

    static int find(int[] arr) {
        int[] sArr = cSort(arr);
        for (int j = 0; j < sArr.length; j++) {
            if (j != sArr[j]) {
                return j;
            }
        }
        return sArr.length;
    }

    static int[] cSort(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i];
            if (arr[i] < arr.length && arr[i] != arr[correct]) {
                int temp = arr[i];
                arr[i] = arr[correct];
                arr[correct] = temp;
            }
            else {
                i++;
            }
        }
        return arr;
    }
}
