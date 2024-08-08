public class LinearS {
    public static void main(String[] args) {
        int[] arr = {2, 8, 6, 10, 3, 1};
        System.out.println(find(arr, 8, 0));
    }

    static int find(int[] arr, int target, int index) {
        if (index == arr.length) {
            return -1;
        }

        if (arr[index] == target) {
            return index;
        }

        return find(arr, target, ++index);
    }
}
