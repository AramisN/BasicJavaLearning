public class OopCar {
    private int color;
    private String model;
    private boolean transmition; // true for automatic


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
