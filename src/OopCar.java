public class OopCar {
    private String color;
    private String model;
    private boolean transmition; // true for automatic
    // Constructor with default values - no input parameters
    public OopCar(){
        // use "this" to call another constructor.
        this("Red","Default-Model2",false);


    }
    // Constructor with default values - with input parameters
    public OopCar(String color, String model, boolean transmition){
        this.color = "Blue";
        this.model = "Default-Model";
        this.transmition = true;

    }



    public void setModel(String model) {
        if (model.equals("BMW-X6") || model.equals("Mustang-GT500")) {
            this.model = model;
        }else {
            this.model = model + " " + "which is not as hot as other cars (kidding)";
        }
    }

    public String getModel() {
        return this.model;
    }


}
