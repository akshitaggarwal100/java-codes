class rotatedArray {
    public static void main(String[] args) {
        // int[] arr = {4,5,6,7,0,1,2};
        // int[] arr = {2,2,7,2,2};
        int[] arr = {1, 2, 3, 4};
        System.out.println(pivotdup(arr) + 1 + " times");
        
    }

    static int pivot(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while(start < end) {
            int mid = start + (end - start) / 2;
            if(mid < arr.length - 1 && arr[mid] > arr[mid + 1]) {
                return mid;
            }
            else if(mid > 0 && arr[mid - 1] > arr[mid]) {
                return mid - 1;
            }
            else if(arr[mid] >= arr[start]) {
                start = mid + 1;
            }
            else {
                end = mid - 1;
            }
        }
        return -1;
    }

    static int pivotdup(int[] nums) {
        int start = 0;
        int end = nums.length - 1;
        while(start < end) {
            int mid = start + (end - start) / 2;

            if(mid < nums.length - 1 && nums[mid] > nums[mid + 1]) {
                return mid;
            }

            else if(mid > 0 && nums[mid - 1] > nums[mid]) {
                return mid - 1;
            }

            else if (nums[start] == nums[mid] && nums[end] == nums[mid]) {
                if (nums[start] > nums[start + 1]) {
                    return start;
                }
                start++;
                
                if (nums[end] < nums[end - 1]) {
                    return end - 1;
                }
                end--;
            }

            else if (nums[start] <= nums[mid]) {
                start = mid + 1;
            }

            else {
                end = mid - 1;
            }
        }
        return -1;
    }

    static int search(int[] nums, int target) {
        int pivot = pivot(nums);
        if(pivot == -1) {
            return binarysearch(nums, target, 0, nums.length - 1);
        }
        else if(nums[pivot] == target) {
            return pivot;
        }
        else if(target < nums[0]) {
            return binarysearch(nums, target, pivot + 1, nums.length - 1);
        }
        else if(target >= nums[0]) {
            return binarysearch(nums, target, 0, pivot - 1);
        }
        return -1;
    }

    static int binarysearch(int[] arr, int target, int start, int end) {
        while(start <= end) {
            int mid = start + (end - start) / 2;
            if(target < arr[mid]) {
                end = mid - 1;
            }
            else if(target > arr[mid]) {
                start = mid + 1;
            }
            else {
                return mid;
            }
        }
        return -1;
    }
}