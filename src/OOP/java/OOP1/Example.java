package OOP1;

public class Example {
    static int x;
    final int y = 7;
    final String s = "World";
    String name = "John";
    String surn = "Doe";

    static void printTrash() {
        Example objOne = new Example();
        Example objTwo = new Example();
        objOne.x = 25;
        Example objThree = new Example();

        System.out.println(objOne.x);
        System.out.println(objTwo.y);
        System.out.println(objThree.s);
    }
    public void altitude(int altitudeMax){
        System.out.println("And I can jump for "+ altitudeMax+"cm!");
    }
    public void printCreds(){
        Example objFour = new Example();
        objFour.x=25;
        System.out.println("Hi! My name is " + objFour.name.toUpperCase() + ". And my surname is " + objFour.surn.toUpperCase()
                + ". I have " + objFour.x + " years.");
    }

    public static void main(String[] args){
        Example printCreds = new Example();
        printCreds.printCreds();
        printCreds.altitude(100);
        //printTrash();


            //printTrash.s="sdfasdfa"; - is blocked for changes (final)
            //System.out.println(printTrash.name);

        }
    }

