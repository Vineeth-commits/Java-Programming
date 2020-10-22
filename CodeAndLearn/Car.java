public class Car {

    private String model;
    private String engine;
    private String color;

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