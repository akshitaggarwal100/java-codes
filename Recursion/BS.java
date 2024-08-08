public class BS {
    public static void main(String[] args) {
        int[] arr = {1, 3, 6, 8, 20};
        System.out.println(search(arr, 3, 0, arr.length -1));
    }

    static int search(int[] arr, int target, int start, int end) {
        if (start > end) {
            return -1;
        }

        int mid = start + (end - start) / 2;

        if (arr[mid] == target) {
            return mid;
        }

        else if (arr[mid] < target) {
            return search(arr, target, mid + 1, end);
        }

        return search(arr, target, start, mid - 1);
    }
}
