package assignment_functions;

public class Q12 {
    public static void main(String[] args){
        System.out.println(triplet(12, 13, 5));
    }

    // max function
    static int max(int p, int q, int r){
        int max = p;
        if (q > max && q > r) {
            return q;
        }
        else if (r > max && r > q){
            return r;
        }
        else{
            return max;
        }
    }

    // method to check triplet
    static boolean triplet(int p, int q, int r){
        int max = max(p, q, r);
            if (max == p) {
                
                    return p*p == (q*q) + (r*r);
                
            }
            if (max == q) {
                
                    return q*q == (p*p) + (r*r);
                
            }
            if (max == r) {
                
                    return r*r == (p*p) + (q*q);
                
            }
        return false;
    }
}