public class MainClass {
    //method
    public static void main(String[] args) {
        String firstarg = "Aramis";
        System.out.println(firstarg);

        // variable sets
        int int1 = 8;
        String str1 = "Aramis";
        double dob1 = 3.14;
        char ch1 = 'A';
        System.out.println(int1 + str1 + " and " + dob1);
        System.out.println(ch1);
        System.out.println(int1 % dob1);
        System.out.println(++int1 + " | " + int1++);

        // Primitive datatypes
        long longval = 9_223_372_036_854_775_807L;
        int intval = 2147483548;
        System.out.println("The maximum number for an Int variable is "
                +Integer.MAX_VALUE + " , " +Integer.MIN_VALUE+ " and what you have in your variable is "+ intval);
        byte byteval = 127;

        //conditionals
            //Switchcase
        switch(byteval){
            // We use break to get out of here, otherwise the compiler will
            // go through each part of the switch statement.
            case 126:
                System.out.println("1 more to reach maximum.");
                break;
            case 127:
                System.out.println("Maximum is reached in the variable.");
                break;
            // You can use multiple cases with one action
            case 1: case 2: case 3:
                System.out.println("The value is so little.");
                break;
            default:
                System.out.println("Hmm, there's something wrong!");
                break;
        }
            //While and DoWhile
        while (byteval == 127){
            System.out.println("Number is "+ byteval);
            break;
        }
        do {
            System.out.println("I'm going to be printed anyway.");
        }while (byteval != 127);


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
            String forconversion = "77";
            int forconversion2 = 77;
        //Parsing value conversion
        System.out.println("The converted String to Int is "+
                ParsingValueConvert.gettheparsingconvert(forconversion));
        System.out.println("The converted String to Double is "+
                ParsingValueConvert.gettheparsingconvertdouble(forconversion));
        System.out.println("The converted Int to String is "+
                ParsingValueConvert.gettheparsingconvert(forconversion2));

        //Read User input
        System.out.println("This is what you typed into Scanner input of this code: \n " +
                ReadUserInputs.scannerinput());


        //Call a method
        print2values(7,"Aramis");

        displayhighscorePosition("Aramis", calculatehighscorePosition(1500));
        displayhighscorePosition("Davoud", calculatehighscorePosition(900));
        displayhighscorePosition("Asghar", calculatehighscorePosition(400));
        displayhighscorePosition("Maria", calculatehighscorePosition(50));

        //couple of tests

        // Calling the overload method
        System.out.println("The Average of 2 numbers is: \n " +
                MethodOverloading.thesameoverridemethod(1,2));
        System.out.println("The Average of 3 numbers is: \n " +
                MethodOverloading.thesameoverridemethod(1,2,3));



        //Calling the Dog class which is inherited from Animal class
        DogInherit dog = new DogInherit(2,4,1,24,1);
        dog.eat();
    }
    //Create a method
    public static void print2values(int myfirstint, String myfirststring){
        System.out.println(myfirststring + " " + myfirstint);
    }
    public static void displayhighscorePosition(String playername, int playerposition){
        System.out.println(playername + " was able to get into the position of " + playerposition);
    }
    public static int calculatehighscorePosition(int playerscore){
        if (playerscore > 1000) return 1;
        else if (playerscore > 500 && playerscore < 1000) return 2;
        else if (playerscore > 100 && playerscore < 500) return 3;
        else return 4;
    }





}
