package oop1;

public class Second extends Example {

    public static void main(String[] args){
        Example example = new Example();

        example.printCreds();
        example.altitude(200);
        System.out.println(example.name);
        example.name = "sdfasdfasdf";
        System.out.println(example.name);
    }
}
