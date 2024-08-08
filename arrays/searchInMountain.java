public class searchInMountain {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 3, 1};
        int max = peak(arr);
        int target = 3;
        int fTry = bs(arr, target, 0, max, true);
        if(fTry == -1){
            int sTry = bs(arr, target, max + 1, arr.length - 1, false);
            System.out.println(sTry);
        }
        System.out.println(fTry);
    }

    static int peak(int[]arr){
        int start = 0;
        int end = arr.length - 1;
        while(start < end){
            int mid = start + (end - start) / 2;
            if(arr[mid] < arr[mid + 1]){
                start = mid + 1;
            }
            else{
                end = mid;
            }
        }
        return start;
    }

    static int bs(int[] arr, int target, int start, int end, boolean ascending){
        while(start <= end){
            int mid = start + (end - start) / 2;
            if(target < arr[mid]){
                if(ascending){
                    end = mid - 1;
                }
                else{
                    start = mid + 1;
                }
            }
            else if(target > arr[mid]){
                if(ascending){
                    start = mid + 1;
                }
                else{
                    end = mid - 1;
                }
            }
            else if(target == arr[mid]){
                return mid;
            }
        }
        return -1;
    }
}
