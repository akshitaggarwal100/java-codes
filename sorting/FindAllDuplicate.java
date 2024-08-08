// import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

public class FindAllDuplicate {
    public static void main(String[] args) {
        int[] arr = {2, 4, 1, 3, 2, 3};
        cSort(arr);
        System.out.println(findDuplicates(arr));
    }

    static List<Integer> findDuplicates(int[] arr) {
        List<Integer> ans = new ArrayList<Integer>();

        for (int index = 0; index < arr.length; index++) {

            if (arr[index] != index + 1) {
                ans.add(arr[index]);
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