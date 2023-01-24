package oop1;

public class AnimlsTogether{

    public static void main(String[] args){
    Animals animals = new Animals(true);
    animals.description();
    animals.character();
    Cat cat = new Cat(2);
    cat.character();
    cat.printEarsMethod();
    Dog dog = new Dog();
    dog.character();
    Bull bull = new Bull(true);
    bull.character();
    Pig pig = new Pig();
    pig.character();
    }
}
