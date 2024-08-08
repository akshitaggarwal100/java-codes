import java.util.ArrayList;
import java.util.List;

public class AllMissingNum {
    public static void main(String[] args) {
        int[] arr = {1, 3, 2, 3, 4};
        System.out.println(findDisappearedNumbers(arr));
    }

    static List<Integer> findDisappearedNumbers(int[] arr) {
        List<Integer> ans = new ArrayList<Integer>();
        cSort(arr);
        for (int index = 0; index < arr.length; index++) {
            if (arr[index] != index + 1) {
                ans.add(index + 1);
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
