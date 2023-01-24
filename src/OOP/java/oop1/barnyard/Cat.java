package oop1.barnyard;

public class Cat extends Animals{
    private int ears;

    public Cat (int ears){
        super(false);
        this.ears=ears;}

    public void printEarsMethod (){
        Cat cat = new Cat(2);
        System.out.println(" And I also have " + cat.ears + " ears!");
    }
    public void character(){
        Animals cat = new Animals(false);
        cat.tile = 22;
        cat.name = "Cat";
        cat.like = "milk!";
        System.out.print("Hi, I'm a " + cat.name + "!" +" I like "+cat.like + " I have a tile which has length of "+cat.tile+ " cm! I have " + cat.legs+ " legs.");
    }

}
