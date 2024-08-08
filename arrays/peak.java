public class peak {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 2, 1};
        System.out.println(max(arr));;
    }

    static int max(int[] arr){
        int start = 0;
        int end = arr.length - 1;
        while(start <= end){
            int mid = start + (end - start) / 2;
            if(arr[mid - 1] > arr[mid]){
                end = mid - 1;
            }
            else if(arr[mid - 1] < arr[mid]){
                start = mid + 1;
            }
        }
        return arr[end];
    }
}
