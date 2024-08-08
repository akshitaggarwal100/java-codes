// import java.util.Arrays;

public class ceil {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 9};
        System.out.println(ceiling(arr, 0, 0));
    }

    static int ceiling(int[] arr, int target, int c){
        if(c == 0 && target < arr[0] || c != 0 && target > arr[arr.length - 1]){
            return -1;
        }
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
        if(c == 0){
            return arr[end];
        }
        else{
            return arr[start];
        }   
    }
}
