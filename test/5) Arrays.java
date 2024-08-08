class Arrays {
    public static void main(String[] args) {
        int[] marks = { 99, 98, 99, 99, 97 };
        // "datatype[]" denotes it is an array of datatype
        // array can be initialised like this with declaration not after that

        String[] names; // array declaration
        names = new String[3];
        // this creates empty array of type String of size 3 and allocates memory

        // accessing array element
        System.out.println(marks[3]);
        names[0] = "Akshit";

        // getting length of array
        System.out.println(marks.length);
    }
}