public class AnimalInherit {

    private String name;
    private int brain;
    private int body;

    public AnimalInherit(String name, int brain, int body) {
        this.name = name;
        this.brain = brain;
        this.body = body;
    }

    public void eat(){
        System.out.println("Animal.eat() is called and working.");
    }

    public void move(){

    }

    public int getBrain() {
        return brain;
    }

    public int getBody() {
        return body;
    }
    }



