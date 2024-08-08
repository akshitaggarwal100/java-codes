import java.io.*;

class io {
    public static void main(String[] args) {
        // handle IOException using streams
        try {
            // BufferedReader is input char stream which reads from stream given as input
            // System.in is already available input byte stream reading from keyboard
            // InputStreamReader is bridge from byte to char stream
            // ISR reads from byte stream and encodes it to char
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

            // PrintWriter is char output stream which writes to stream given as input
            // PW writes formatted text
            // System.out is already available output byte stream to monitor
            PrintWriter writer = new PrintWriter(System.out);

            // readLine() reads a line from stream and returns String
            String name = reader.readLine();

            // read() reads single character from stream
            // read() return int unicode value of char read
            // it can be casted into char
            int ch = (char) reader.read();

            // println() writes to stream
            writer.println(name);
            writer.println(ch);

            // BufferedOutputStream/OutputStream(System.out) is byte output stream
            // it writes to stream given as input
            // it has write(int) to write single byte, it takes unicode

            // BufferedInputStream/InputStream(System.in) is byte stream
            // reads from stream given as input
            // it has read() to read single byte, it return unicode int
            

            // all streams needs to be closed
            reader.close();
            writer.close();
        } catch (IOException e) {

        }
    }
}