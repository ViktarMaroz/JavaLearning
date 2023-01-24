package oop1.barnyard;

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
    Bull bull = new Bull();
    bull.character();
    Pig pig = new Pig();
    pig.character();
    }
}
