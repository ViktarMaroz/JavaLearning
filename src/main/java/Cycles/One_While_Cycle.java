package Cycles;

public class One_While_Cycle {

    public static void main(String[] args){

        System.out.println("\n"+ "-----While------"+"\n");
    int number = 2;
    int power = 1;
    int result = 1;
    int counter = 1;

    while (power<21){
        result = result * number;
        System.out.println(counter + ". "+ number + " raised to power " + power + " = " + result);
        power++;
        counter++;
        }


    System.out.println("\n"+ "-----Do While------"+"\n");
        int number1 = 3;
        int power1 = 1;
        int result1 = 1;
        int counter1 = 1;

        do {
            System.out.println(counter1 + ". " + number1 + " raised to power " + power1 + " = " + result1);
            power1++;
            result1 = result1 * number1;
            counter1++;
        }
        while (result1<3000);

        System.out.println("\n"+ "-----continue;------"+"\n");
            int sum = 0;
            int i = 0;
            int count = 20;
            while(i<=count) {
                i++;
                if (i*i<=count)
                    continue;
                sum += i*i*i;
            }
            System.out.println(sum);

        System.out.println("\n"+ "-----infinite cycle / break------"+"\n");
        int num= 2;
        int pow = 1;
        int res = 1;
        int counter2 = 1;
        while (true){

            res = res * num;
            System.out.println(counter2 + ". "+ num + " raised to power " + pow + " = " + res);
            pow++;
            counter2++;
            if (pow>10) break;
        }
        System.out.println("\n"+ "-----Nested cycles------"+"\n");
        System.out.println("     2  3  4  5  6  7  8  9  10 11 12");
        int ii =2;
        while (ii<11){
            if ((ii%10)>0)
            System.out.print("0"+ii + " | ");
            else System.out.print(ii + " | ");

            int j = 2;
            while (j<13){
                int mul = ii*j;
                if (mul <10) System.out.print(mul + "  ");
                else System.out.print(mul + " ");
                j++;
            };
        System.out.println();
        ii++;

        }
    }
}

