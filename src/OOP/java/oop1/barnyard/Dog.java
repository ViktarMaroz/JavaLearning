package oop1.barnyard;

public class Dog extends Animals{
    public Dog(){
        super(false);
    }

    public void character() {
        Animals dog = new Animals(false);
        dog.name = "Dog";
        dog.tile = 33;
        dog.legs = 5;
        dog.like = "sweetty bonesies";

        System.out.print("Hi, I'm a %s! I like %s!%s%d cm! I have %d legs.".formatted(dog.name, dog.like, dog.lazyText, dog.tile, dog.legs));
        Cat cat = new Cat(2);
        cat.printEarsMethod();


    }
}
