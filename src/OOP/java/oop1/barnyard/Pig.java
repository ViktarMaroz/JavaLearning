package oop1.barnyard;

public class Pig extends Animals{
    public Pig(){
        super(false);
    }
    public void character() {
        Animals pig = new Animals(false);

        pig.name = "Pig";
        pig.tile = 5;
        pig.like = "to eat everethibng I can find";

        System.out.println("Hi, I'm a " + pig.name + "!" +" I like "+ pig.like+"!"+ pig.lazyText + pig.tile+ " cm! I have " + pig.legs+ " legs.");
    }
}
