public class FirstMissingPositive {
    public static void main(String[] args) {
        
    }

    static int findMissing(int[] arr) {
        cSort(arr);
        for (int index = 0; index < arr.length; index++) {
            if (arr[index] != index + 1) {
                return index + 1;
            }
        }
        return arr.length + 1;
    }

    static void cSort(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i] - 1;

            if (arr[i] > 0 && arr[i] <= arr.length && arr[i] != arr[correct]) {
                int temp = arr[i];
                arr[i] = arr[correct];
                arr[correct] = temp;
            }

            else {
                i++;
            }
        }
    }
}
