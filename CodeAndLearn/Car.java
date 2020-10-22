public class Car {

    private String model;
    private String engine;
    private String color;

    //Constructor is used to initialise the instance variables
    public Car() {
        // If a empty constructor is called, default values can be added by the following statement.
        this("S-class","V8","white");
        // The above statement must be in the first line of the constructor.
    }
    public Car(String model,String engine,String color) {
        // Other methods can be called using the constructor, but a general rule dont. Use it to initialise directly
        this.model = model;
        this.engine = engine;
        this.color = color;
    }
    public void setModel(String model) {
        String validModel = model.toLowerCase();
        if(validModel.equals("Raptor"))
            this.model = model;
        else
            this.model = "unknown";
    }
    public void setEngine(String engine) {
        this.engine = engine;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public String getEngine() {
        return engine;
    }
    public String getColor() {
        return color;
    }
    public String getModel() {
        return model;
    }
}