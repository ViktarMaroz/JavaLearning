package oop2;

public class GetSet {
    private int tile, legs;
    private String name;

    public GetSet(String name, int tile, int legs){
        this.name = name;
        this.tile = tile;
        this.legs = legs;
    }

    public String getName(){return name;}
    public void setName(String name){this.name=name;}

    public int getTile(){return tile;}
    public void setTile(int tile){this.tile=tile;}

    public int getLegs(){return legs;}
    public void setLegs(int legs){this.legs=legs;}

    public static void main(String[] args) {
        GetSet aaa = new GetSet("Cat", 22, 4);
        System.out.println("Hello! I'm a " + aaa.getName() + " and I have " + aaa.getLegs()
                + " legs. Also I have my long tile of " + aaa.getTile() + "cm!");

        Encaps encaps = new Encaps();
        System.out.println("Hi! My name's " + encaps.getName()
                + " and I am "+encaps.getAge()+ " years old.");

        encaps.printAge();

        encaps.setName("Benjamin");
        encaps.setAge(44);
        System.out.println("Hi! My name's " + encaps.getName()
                + " and I am "+encaps.getAge()+ " years old.");




    }

}
