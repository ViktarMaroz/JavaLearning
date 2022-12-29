import java.util.Scanner;

public class WhatIsYourName1 {
    public static void main (String[] args){
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please enter your name:");


        if (!keyboard.hasNextInt()){
            String name = keyboard.nextLine();
            String nameUp = name.toUpperCase();
            System.out.println("Nice to meet you, "+ nameUp);
        }
        else {
            System.out.println("It looks as if You are entering numbers. Please enter letters");
            String name = keyboard.nextLine();
        }
        //need to record the variable nameUP for the next iteration
        //String name = keyboard.nextLine();
        //String nameUp = name.toUpperCase();



        System.out.println("Please enter your surname:");
        if (!keyboard.hasNextInt()){
            String surname = keyboard.nextLine();
            String surnameUp = surname.toUpperCase();
            System.out.println("Now we've got a bit closer, " + " " + surnameUp);
        }
        else {
            String surname = keyboard.nextLine();
            System.out.println("It looks as if You are entering numbers. Please enter letters");
            System.out.println("Please enter your surname:");
        }
        keyboard.close();
    }
}



