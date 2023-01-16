package oop1;

public class Cat extends Animals{
    private int ears;

    public Cat (int ears){
    this.ears=ears;}

    public void printEarsMethod (){
        Cat cat = new Cat(2);
        System.out.print("And I also have " + cat.ears + " ears!");
    }

    public static void main (String[] args) {
        Cat cat = new Cat(2);
        cat.tile= 22;
        cat.name = "Cat";

        System.out.println("Hi, I'm an " + cat.name + "!" + " I have a tile which has loneliness of "+ cat.tile+ " cm! I have " + cat.legs+ " legs." );
        cat.printEarsMethod();
    }
}
