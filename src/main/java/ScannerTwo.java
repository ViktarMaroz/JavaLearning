import java.util.Scanner;

public class ScannerTwo {
    public static void main(String[] args) {
        Scanner scan = new Scanner("Come As you are, " +
                "As you were, As I want you to be, As a friend, As a friend, As an old enemy").useDelimiter(",");
        //or scan.useDelimiter(",");

        while (scan.hasNext()) {
            System.out.println(scan.next());
        }
        scan.close();
    }

}
