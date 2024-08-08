import java.util.Arrays;

public class arrays{
    public static void main(String[] main){
        int[] rn;
        rn = new int[3];
        rn[0] = 1;
        rn[1] = 2;
        rn[2] = 3;
        System.out.println(Arrays.toString(rn));
        change(rn);
        System.out.println(Arrays.toString(rn));
    }

    static void change(int[] a){
        a[0] = 99;
    }
}