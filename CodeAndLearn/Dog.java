// when extending a class, a constructor needs to be called
public class Dog extends Animal {
    private int eyes;
    private int tail;
    private int legs;

    public Dog(String name, int brain, int body, int size, int weight, int eyes, int tail, int legs) {
        // call the constructor of the super class, animal class in this class
        super(name, brain, body, size, weight);
        this.eyes = eyes;
        this.tail = tail;
        this.legs = legs;
    }
    private void chew() {
        System.out.println("dog.chew() called");
    }

    // overriding a method that is in the animal class
    @Override
    public void eat() {
        System.out.println("dog.eat() called");
        chew();
        super.eat();
    }
    public void walk() {
        System.out.println("dog.walk called");
        move(5);
    }
    public void run() {
        System.out.println("dog.run called");
        move(10);
    }
}
