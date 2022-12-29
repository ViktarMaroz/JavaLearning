import java.util.Scanner;

public class WhatIsYourName2 {
        public static void main (String[] args){

            System.out.println("Please enter your name:");
            Scanner keyboard = new Scanner(System.in);
            String nameUp = null;
            String surnameUp = null;
            int age;

            //Name************************************************************************
            if (!keyboard.hasNextInt()){
                nameUp = keyboard.nextLine().toUpperCase();
                System.out.println("Nice to meet you, "+ nameUp + "!");
            }
            else {
                System.out.println("It looks as if You are entering numbers. Please enter letters");
                nameUp = keyboard.nextLine().toUpperCase();
            }

            //Surname************************************************************************
            System.out.println("Please enter your surname:");
            if (!keyboard.hasNextInt()){
                surnameUp = keyboard.next().toUpperCase();
                System.out.println("Now we've got a bit closer, " + nameUp + " " + surnameUp +"!");

            }
            else {
                String surname = keyboard.nextLine();
                System.out.println("It looks as if You are entering numbers. Please enter letters");
                System.out.println("Please enter your surname:");
                age = keyboard.nextInt();
            }
            //Age************************************************************************
            System.out.println("And how old are you (if it is not a secret)?");
            if (keyboard.hasNextInt()){
                age = keyboard.nextInt();
                System.out.println("How it is, "+ nameUp + " " + surnameUp +", to leave so long time? It seams it's not a joke" +
                        " to spend "+ age + " years on the Earth!");
            }
            else{
                System.out.println("It looks as if You are entering letters. Please use numbers. So what's your age?");
            }

           keyboard.close();
        }
    }





