public class OopNewCarDispatch {
    public static void main(String[] args){
        //Create a variable with OopCar type + initializing the bmw object from OopCar.
        OopCar bmw = new OopCar();

        String model = "BMW-X6";
        boolean transmition = true; //transmition is automatic


        //giving a value to the model
        bmw.setModel(model);
       System.out.println(bmw.getModel()); //Outputs BMW-X6

    }
}
