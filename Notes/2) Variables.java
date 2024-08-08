class Variables {
    public static void main(String args[]) {
        // below is age variable declared
        // no value is assigned to it and no memory is allocated
        int age;

        // now it is initialized
        // value assigned and memory allocated
        age = 19;

        // declaration and initialisation can be done together
        // long - data type
        // balance - identifier
        // identifier is the name of var,func,class,obj
        // 200000 is value assigned it is of type int
        // but it is implicitly casted to larger type long
        // and stored in long variable
        long balance = 20000;

        // var should be declared before it is used

        // a var's value can be changed
        balance = 30000;

        // to declare a var which cant be changed
        // use 'final' keyword
        // final var must be initialised
        final int g;
        // g=10;
        System.out.println(g);

        // multiple assignment can also be done together
        int a;
        int b;
        a = b = 20;
    }
}