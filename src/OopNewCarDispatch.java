public class OopNewCarDispatch {
    public static void main(String[] args){
        //Create a variable with OopCar type + initializing the bmw object from OopCar.
        OopCar bmw = new OopCar();
        OopCar mustang = new OopCar();
        OopCar mercedes = new OopCar();
        OopCar test777 = new OopCar();

        String model = "BMW-X6";
        String model2 = "Mercedes-SLS";
        String model3 = "Mustang-GT500";

        boolean transmition = true; //transmition is automatic


        //giving a value to the model
        bmw.setModel(model);
        mercedes.setModel(model2);
        mustang.setModel(model3);

        //giving no value to trigger the constructor to work
        System.out.println(test777.getModel()); //Outputs BMW-X6

       //printing out what we've sent to the class
       System.out.println(bmw.getModel()); //Outputs BMW-X6
       System.out.println(mercedes.getModel()); //Outputs Mercedes-SLS which is not as hot as other cars (kidding)
       System.out.println(mustang.getModel()); //Outputs Mustang-GT500

    }
}
