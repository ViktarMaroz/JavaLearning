package OOP1;

public class Animals {
    //class constructor
    //in first, create the class' attributes
    int tile, legs;
    String name;
    //then create a class constructor itself (name=class name)
    public Animals() {
        tile = 11;
        legs = 4;
        name = "animal";
    }
    public void description(){
        System.out.println("Let's talk about animals!");
    }
    //then just use the created attributes
    public void character(){
        Animals x = new Animals();
        System.out.println("Hi, I'm an " + x.name + "!" + " I have a tile which has loneliness of "+x.tile+ " cm! I have " + x.legs+ " legs.");
    }
}
