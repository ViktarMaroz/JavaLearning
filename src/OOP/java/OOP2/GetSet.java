package OOP2;

public class GetSet {
    private int tile, legs;
    private String name;

    public GetSet(int tile,int legs, String name) {
        this.tile = tile;
        this.legs = legs;
        this.name = name;
    }

    public int getLegs() {
        return legs;
    }
    public void setLegs() {
        this.legs = legs;
    }

    public int getTile() {
        return tile;
    }
    public void setTile() {
        this.tile = tile;
    }

    public String getName() {
        return name;
    }
    public void setName() {
        this.name = name;
    }

    public static void main(String[] args){
        GetSet animal = new GetSet(11, 4, "animals" );
        String name1 = animal.getName();
        int tile1 = animal.getTile();
        int legs1 = animal.getLegs();
        System.out.println(animal.getLegs());

        System.out.println("Hi, I'm an " + name1 + "!" + " I have a tile which has loneliness of "+tile1+ " cm! I have " + legs1+ " legs.");
    }

}
