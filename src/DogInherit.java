public class DogInherit extends AnimalInherit {
    private int eyes;
    private int legs;
    private int tail;
    private int teeth;
    private int coat;

    public DogInherit(int eyes,int legs, int tail, int teeth, int coat) {
        //because we know what shape a dog is, we can just give it literally in here and then
        // add the dog related variables to the constructor.
        super("Dog", 1, 1);

        this.coat = coat;
        this.eyes = eyes;
        this.tail = tail;
        this.teeth = teeth;
        this.legs = legs;
    }

}
