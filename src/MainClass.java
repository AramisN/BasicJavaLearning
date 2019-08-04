
public class MainClass {
    //method
    public static void main(String[] args) {
        String firstarg = "Aramis";
        System.out.println(firstarg);

        // variable sets
        int int1 = 8;
        String str1 = "Armis";
        double dob1 = 3.14;
        char ch1 = 'A';
        System.out.println(int1 + str1 + " and " + dob1);
        System.out.println(ch1);
        System.out.println(int1 % dob1);
        System.out.println(++int1 + " | " + int1++);

        // Primitive datatypes
        long longval = 9_223_372_036_854_775_807L;
        int intval = 2147483548;
        byte byteval = 127;

        // for loops
        for (int i = 0; i <= int1; ++i) {
            for (int j = 0; j <= i; ++j) {
                System.out.print(ch1);
            }
            System.out.println();
        }
        for (int i = 8; i >= 0; i--) {
            for (int j = 0; j <= i; j++) {
                System.out.print(ch1);
            }
            System.out.println();
        }

        //Call a method
        print2values(7,"Aramis");

        displayhighscorePosition("Aramis", calculatehighscorePosition(1500));
        displayhighscorePosition("Davoud", calculatehighscorePosition(900));
        displayhighscorePosition("Asghar", calculatehighscorePosition(400));
        displayhighscorePosition("Maria", calculatehighscorePosition(50));

        //couple of tests

        // Calling the overload method

        System.out.println("The Average of 2 numbers is: \n " + MethodOverloading.thesameoverridemethod(1,2));
        System.out.println("The Average of 3 numbers is: \n " + MethodOverloading.thesameoverridemethod(1,2,3));


    }
    //Create a method
    public static void print2values(int myfirstint, String myfirststring){
        System.out.println(myfirststring + " " + myfirstint);
    }
    public static void displayhighscorePosition(String playername, int playerposition){
        System.out.println(playername + " was able to get into the pisition of " + playerposition);
    }
    public static int calculatehighscorePosition(int playerscore){
        if (playerscore > 1000) return 1;
        else if (playerscore > 500 && playerscore < 1000) return 2;
        else if (playerscore > 100 && playerscore < 500) return 3;
        else return 4;
    }





}
