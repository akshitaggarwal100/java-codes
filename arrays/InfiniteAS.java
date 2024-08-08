// import java.util.Scanner;

public class InfiniteAS {
    public static void main(String[] args) {
        // Scanner in = new Scanner(System.in);
        int[] arr = {1, 2, 5, 7, 9, 11, 15, 27, 29, 31, 45, 68, 87, 99, 102, 110, 111, 112, 113, 114, 115, 116, 234, 235, 236, 237, 239};
        int start = 0;
        int end = 1;
        int target = 87;
        while(target > arr[end]){
            int Nstart = end + 1;
            end = end + 2 * (end - start + 1);
            start = Nstart;
        }
        System.out.println(search(arr, target, start, end));

    }

    static int search(int[] arr, int target, int start, int end){
        while(start <= end){
            int mid = start + (end - start) / 2;
            if(target < arr[mid]){
                end = mid - 1;
            }
            else if(target > arr[mid]){
                start = mid + 1;
            }
            else if(target == arr[mid]){
                return mid;
            }
        }
        return -1;
    }
}
