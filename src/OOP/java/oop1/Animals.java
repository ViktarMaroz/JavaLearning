package oop1;

import java.io.PrintStream;

public class Animals {
    //class constructor
    //in first, create the class' attributes
    public int tile, legs;
    String name;
    String like;
    String lazyText;
    boolean horns;
    String horns_answer;

    //then create a class constructor itself (name=class name)
    public Animals(boolean horns) {
        tile = 11;
        legs = 4;
        name = "animal";
        like = "milk";
        lazyText = " I have a tile which has length of ";
        this.horns = true;
        this.horns_answer = "\nAnd I fortunately have my perfect strong HORNS!";
    }
    public void description(){
        System.out.println("Let's talk about animals!");
    }
    //then just use the created attributes
    public void character(){
        Animals x = new Animals(true);

        String print = "Hi, I'm an " + x.name + "!" +" I like "+x.like+"!"+ x.lazyText +x.tile+ " cm! I have " + x.legs+ " legs.";

        if (x.horns == true) System.out.println(print + x.horns_answer);
        else  System.out.println(print);
    }
}
