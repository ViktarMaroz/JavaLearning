import java.util.Scanner;

public class ScannerOne {
    public static void main (String[] args){

        Scanner enter = new Scanner("Once, upon a time...\n" + "Far, far away...\n");
        String one = enter.nextLine();
        System.out.println(one);
        one = enter.nextLine();
        System.out.println(one + "\n" + "********************");
    }
}
