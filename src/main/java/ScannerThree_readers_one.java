import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ScannerThree_readers_one {
    public static void main(String[] args) throws IOException {
        BufferedReader readerFromConsole = new BufferedReader(new InputStreamReader(System.in));
        String one = readerFromConsole.readLine().toUpperCase();
        System.out.println("Now I can read the line from the console:");
        System.out.println(one);


    }
}
