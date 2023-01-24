package oop1;

import java.sql.SQLOutput;

public class Cat extends Animals{
    private int ears;

    public Cat (int ears){
        super(true);
        this.ears=ears;}

    public void printEarsMethod (){
        Cat cat = new Cat(2);
        System.out.println(" And I also have " + cat.ears + " ears!");
    }
    public void character(){
        Animals cat = new Animals(true);
        cat.tile = 22;
        cat.name = "Cat";
        System.out.print("Hi, I'm a " + cat.name + "!" + " I have a tile which has length of "+cat.tile+ " cm! I have " + cat.legs+ " legs.");
    }

}
