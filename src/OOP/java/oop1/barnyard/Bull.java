package oop1.barnyard;

public class Bull extends Animals{
    public Bull(){
        super(true);
        this.name=name;
        this.tile=tile;
        this.like=like;
    }

    public void character() {
        Animals bull = new Animals(true);
        bull.name = "Bull";
        bull.tile = 12;
        bull.like = "fresh greenny grossy";

        System.out.println("Hi, I'm a " + bull.name + "!" +" I like "+bull.like+"!"+ bull.lazyText +bull.tile+ " cm! I have " + bull.legs+ " legs." + bull.horns_answer );

    }
}
