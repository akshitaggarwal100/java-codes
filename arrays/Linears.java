public class Linears {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        int ansd = search(arr, 3);
        System.out.println(ansd);
    }

    static int search(int[] arr,int target){
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == target){
                return i;
            }
        }
        return -1;
    }
}
