public class Integers {
    public static void main(String[] args){
        int a = 5/2;
        int b = 20/3;
        int c;
        c=6/5;
        System.out.println(a+" "+b+" "+c);
        a=5%2;
        b=20%3;
        c=6%5;
        a=++a;
        a=--a;
        System.out.println(a+" "+b+" "+c);
        //check (a % 2) == 0
        if ((a % 2) == 0){
        System.out.println("even");
        }
        else {
            System.out.println("odd");
        }
        int number = 3211321;
        int lastDigit = number%10;
        System.out.println("last digit is--> "+lastDigit);
        int lastButOne = (number%100)/10;
        System.out.println("and last but one is--> "+lastButOne);
        int six=6;

        six=++six;
        six=++six;
        six=++six;
        System.out.println(six);
        six=--six;
        six=--six;
        six=--six;
        System.out.println(six);

        System.out.println("***************************");
        //prefix operation
        int ss = 5;
        System.out.println(ss);
        int check = ++ss;
        System.out.println(check);
        System.out.println(ss);

        System.out.println("----");

        //postfix operation
        //left to right ------>>>> operations
        int sd = 5;
        System.out.println(sd);
        int check1 = sd++;
        System.out.println(check1);
        System.out.println(sd);



    }
}
