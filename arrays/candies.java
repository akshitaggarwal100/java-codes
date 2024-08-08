public class candies {
    public static void main(String[] args) {
        
    }

    static int sum(int[] arr) {
        int sum = 0;
        for (int i : arr) {
            sum += i;
        }
        return sum;
    }

    static int bs(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        while(start <= end){
            int mid = (start + end) / 2;
            if(target > arr[mid]){
                start = mid + 1;
            }
            else if(target < arr[mid]){
                end = mid - 1;
            }
            else if(target == arr[mid]){
                return arr[mid];
            }
        }
        return -1;
    }
}
