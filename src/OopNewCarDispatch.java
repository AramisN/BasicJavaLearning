public class OopNewCarDispatch {
    public static void main(String[] args){
        //Create a variable with OopCar type + initializing the bmw object from OopCar.
        OopCar bmw = new OopCar();
        OopCar mustang = new OopCar();
        OopCar mercedes = new OopCar();

        String model = "BMW-X6";
        String model2 = "Mercedes-SLS";
        String model3 = "Mustang-GT500";

        boolean transmition = true; //transmition is automatic


        //giving a value to the model
        bmw.setModel(model);
        mercedes.setModel(model2);
        mustang.setModel(model3);

       System.out.println(bmw.getModel()); //Outputs BMW-X6
       System.out.println(mercedes.getModel()); //Outputs BMW-X6
       System.out.println(mustang.getModel()); //Outputs BMW-X6

    }
}
