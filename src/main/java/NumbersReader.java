import java.util.Scanner;

public class NumbersReader {
    public static void main(String[] args){
        String numbers = ("5020202 120202000 1215202");
        Scanner reader= new Scanner(numbers);

        int a = reader.nextInt();
        int b = reader.nextInt();
        int c = reader.nextInt();

        int average = ((a+b+c)/3);

        System.out.println(average);

    }
}
