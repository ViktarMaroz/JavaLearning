package oop1;

public class Bull extends Animals{
    public void character() {
        String name = "OOP1.Bull";
        int tile = 12;
        int legs = 4;
        boolean horns = true;
        String horns_answer = null;
        if (horns == true) horns_answer = "fortunately have";
        else horns_answer = "unfortunately have";
        System.out.println("Hi, I'm a " + name + "!" + " I have a tile which has loneliness of "+tile+ " cm! I have " + legs + " legs."
        + "\n And I " + horns_answer + " my perfect strong HORNS!" ) ;
    }
}
