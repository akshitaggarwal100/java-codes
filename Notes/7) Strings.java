class Strings {
    public static void main(String[] args) {
        // String is immutable
        // StringBuffer is mutable

        String name;
        name = "Akshit";
        name = "Akshit Agg";
        name += "arwal";
        // once a String object is created, it cannot be modified
        // we can re assign and add to string
        // but all that is done by creating a new string object on low level
        // and pointing to new this string object

        int length = name.length(); // to get length including '\0'
        // '\0' is null terminator

        char initial = name.charAt(0); // to access a char at index from String

        int index = name.indexOf("ar"); // to get index of char/substring in index

        index = name.lastIndexOf("a"); // to get last index of char/substring in index

        // name.toLowerCase() returns new LowerCase string
        // name.toUpperCase() returns new UpperCase string
        // name.trim() returns new string with spaces removed
        // name.replace(old, new) returns new string after replacing substring/char
        // name.equals(str) checks equality of strings

        // StringBuffer are of dynamic size

        StringBuffer n = new StringBuffer(20); // with length
        n = new StringBuffer("name"); // with String
        
        n.reverse(); // to reverse the string

        n.append(":Akshit"); // to add at the end of StringBuffer
        n.insert(2, "index"); // to insert from an index
        n.delete(0, 4); // to delete from StringBuffer last index is not incl.
        n = new StringBuffer("akal567");
        n.replace(0, 4, "at"); // to replace from 0 to 3(last not incl.) with a substring
        // n.toString() returns String object of StringBuffer
        // length, indexOf, lastIndexOf and charAt also available in StringBuffer

        System.out.println(n);
    }
}