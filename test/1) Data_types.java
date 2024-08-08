class Data_types {
    public static void main(String[] args) {
        byte a = 9; // 1 byte
        short b = 2; // 2 byte
        int c = 3; // 4 byte
        long d = 3L; // 8 byte

        float e = 2.3f; // 4 byte
        double f = 4.3; // 8 byte
        // If two values or variables of different types are used in an expression
        // then the variable of type of smaller size will be converted to larger size type
        // in that expression and then the result will be computed
        // smaller type will be implicitly casted to larger type
        long balance = a + c;

        // smaller type value can be stored in larger type variable
        double temp = 22.3f;

        char g = 'a'; // 2 byte

        // if Unicode value of a character is assigned to char variable
        // then it will store the character at that numeric value
        char section = 65;

        // if character is assigned to any numeric datatype(byte, int etc.)
        // then it stores its Unicode value
        int category = 'M';

        boolean flag = true; // 1 bit
    }
}