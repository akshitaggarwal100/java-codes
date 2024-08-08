class Characters {
    public static void main(String[] args) {
        // Character, String, StringBuffer are not primitive datatypes
        // these are classes

        Character a = 'a';
        char b = a.charValue(); // returns primitive char
        a.toString(); // returns String

        a.equals(b); // checks equality of chars returns boolean

        a.compareTo(b); // returns a-b unicode value
    }
}