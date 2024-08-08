import java.util.Arrays;

public class Twosum {
    public static void main(String[] args) {
        int[] arr = {2, 5, 5, 11};
        System.out.println(Arrays.toString(twoSum(arr, 10)));
    }

    static int[] twoSum(int[] arr, int target) {
        int[] ans = {-1, -1};
        for (int start = 0; start < arr.length - 1; start++) {
            for (int end = start + 1; end < arr.length; end++) {
                if (arr[start] + arr[end] == target) {
                    ans[0] = start;
                    ans[1] = end;
                }
            }
        }
        return ans;
    }
}