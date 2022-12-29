import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.FileInputStream;

public class ScannerThree_readers_two {
    public static void main(String[] args) throws IOException{
    BufferedReader filereader = new BufferedReader(new InputStreamReader(new FileInputStream("C:\\Users\\mudes\\IdeaProjects\\1. JavaRush\\Level2\\3. Lev2_Scanner+System.in\\Scanner_and_System_in\\filesource.txt")));
    System.out.println("Here you can read the data is stored to the file filesource.txt \n");
        System.out.println(filereader.readLine());
        System.out.println(filereader.readLine());
        System.out.println(filereader.readLine());
        System.out.println(filereader.readLine());
        System.out.println(filereader.readLine());
        System.out.println(filereader.readLine());
        System.out.println(filereader.readLine());
        System.out.println(filereader.readLine());
        System.out.println(filereader.readLine());
        System.out.println(filereader.readLine());
        System.out.println(filereader.readLine());
        System.out.println(filereader.readLine());

        filereader.close();
    }
}
