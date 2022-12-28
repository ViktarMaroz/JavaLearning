public class LogicalOperations {
    public static void main (String[] args){
        //!
        boolean a = true;
        System.out.println(!a);
        System.out.println("******************************");
        //&&
        boolean b = 100>20 && 100>200;
        System.out.println(b);
        System.out.println(100>20 && 100>55);
        System.out.println("******************************");
        //&&
        boolean c = 100>20 || 100>200;
        System.out.println(c);
        System.out.println(100>20 || 100>55);

    }
}
