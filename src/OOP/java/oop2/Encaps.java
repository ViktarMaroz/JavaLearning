package oop2;

public class Encaps {
    private String name;
    private int age;
    private boolean bool;

    public String getName(){return name;}
    public void setName(String newName){this.name=newName;}

    public int getAge(){return age;}
    public void setAge(int newAge){
        if (age >= 0) {this.age = newAge;}
        else {System.out.println("Error. The age can't be  negative!");}
    }

    public boolean getBool(){return bool;}
    public void setBool(boolean newBool){this.bool=newBool;}

    public void printAge(){
        Encaps encaps1 = new Encaps();
        encaps1.setName("John");
        encaps1.setAge(20);
        encaps1.setBool(true);
        System.out.println("Hi! My name's " + encaps1.getName()
                + " and I am "+encaps1.getAge()+ " years old.");

    }
}
