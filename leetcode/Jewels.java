import java.util.ArrayList;

public class Jewels {
    public static void main(String[] args) {
        String a = "aAAbbbb";
        System.err.println(numJewelsInStones("aA", a));
    }

    static int numJewelsInStones(String jewels, String stones) {
        int cnt = 0;

        ArrayList<Character> arr = new ArrayList<Character>();
        for (int j = 0; j < jewels.length(); j++) {
            arr.add(jewels.charAt(j));
        }
        
        for (int i = 0; i < stones.length(); i++) {
            if (arr.contains(stones.charAt(i))) {
                cnt++;
            }
        }
        
        return cnt;
    }
}
