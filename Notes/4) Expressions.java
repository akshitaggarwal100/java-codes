class Expressions {
    public static void main(String[] args) {
        // statement ends with ';'
        // it is an unit of execution
        // it may or may not return a value
        int n = 4;

        boolean isEven = n % 2 == 0;
        // n % 2 == 0 is an exp and will return a bool
        // complete line is statement where memory and value will be assigned
        // to flag variable

        System.out.println(isEven ? "Even" : "Odd");
        // ternary op is an expression which return "Even" if isEven is true
        // else return "Odd"
        
        // expression ending with ';' is a statment
        // but every exp can't be used alone it's returned value must be used
        // n%2==0;
        // above can't be written alone

        // following expressions can be written as statements
        // 1) assignment expression
        // 2) ++ and --
        // 3) method calls
    }
}