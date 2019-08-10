public class ThisSuperKeywords extends AnimalInherit {
    int thisclassproperties ;

    public ThisSuperKeywords(String name, int brain, int body) {
        super(name, brain, body);
        this.thisclassproperties = 7;
    }

    private void move(int speed){
        System.out.println("thismove().ThisSuperKeywords called.");
        System.out.println("The ThisSuperKeywords move with "+this.thisclassproperties * speed + " pace.");
    }

    public static void main(String[] args){
        ThisSuperKeywords newinstance = new ThisSuperKeywords("ThisSuperKeywords",1,1);

        newinstance.move(4);

    }

}
