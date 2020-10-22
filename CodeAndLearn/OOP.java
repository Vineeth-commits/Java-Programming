// Objects have state and behaviour. Stores state as fields(member variables) and behaviour as methods.
// Class is a blueprint for creating objects
public class OOP {
    public static void main(String[] args) {
        Car ford; //declaration 
        ford = new Car(); // initialization
        Car Merc = new Car("Mayback","V12","black");
        // ford = null;
        System.out.println("Model is "+ford.getModel());
        ford.setModel("Raptor");
        System.out.println("Model is "+ford.getModel());
        Merc.getEngine();
    }
}
