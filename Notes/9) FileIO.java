import java.io.*;

class FileIO {
    public static void main(String[] args) {

        try {
            // BufferedReader() can also take FileReader as input
            // FileReader() is char stream for file
            BufferedReader reader = new BufferedReader(new FileReader("test.txt"));

            String line = reader.readLine();
            char ch = (char) reader.read();

            // FileInputStream() is byte stream for file
            FileInputStream reader2 = new FileInputStream("test.txt");
            char ch2 = (char) reader2.read(); // returns unicode int

            // BufferedWriter() can also take FileWriter as input
            // FileWriter() is char stream for file
            // PrintWriter() can be used to write formatted text
            PrintWriter writer = new PrintWriter(new BufferedWriter(new FileWriter("test2.txt")));

            // FileOutputStream() is byte stream for file
            FileOutputStream writer2 = new FileOutputStream("test2.txt");
            // it has write(). it takes int unicode/char
            writer2.write(ch2);

            writer.println(line);
            writer.println(ch);


            reader.close();
            reader2.close();
            writer.close();
            writer2.close();
        } catch (IOException e) {

        }
    }
}
