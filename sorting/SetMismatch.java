public class SetMismatch {
    public static void main(String[] args) {
        
    }

    static int[] findErrorNums(int[] arr) {
        cSort(arr);
        int[] ans = {-1, -1};
        for (int index = 0; index < arr.length; index++) {
            if (arr[index] != index + 1) {
                ans[0] = arr[index];
                ans[1] = index + 1;
                return ans;
            }
        }
        return ans;
    }

    static void cSort(int[] arr) {
        int i = 0;

        while (i < arr.length) {
            int correct = arr[i] - 1;

            if (arr[i] != arr[correct]) {
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