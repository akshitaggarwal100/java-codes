package assignment_functions;

import java.util.Scanner;

public class Q6 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        float rad = in.nextFloat();
        System.out.println("area is: " + area(rad));
        System.out.println("circumference is: " + circ(rad));
        in.close();

    }

    static float area(float rad){
        float area = 3.14f * rad * rad;
        return area;
    }

    static float circ(float rad){
        float circ = 2 * 3.14f * rad;
        return circ;
    }
}