package core.basesyntax;

public class Car implements Cloneable {
    private int numberOfSeats;
    private String color;
    private Engine engine;
    private String modelName;
    private int yearOfRelease;

    public Car(int numberOfSeats, String color, Engine engine,
               String modelName, int yearOfRelease) {
        this.numberOfSeats = numberOfSeats;
        this.color = color;
        this.engine = engine;
        this.modelName = modelName;
        this.yearOfRelease = yearOfRelease;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public int getYearOfRelease() {
        return yearOfRelease;
    }

    public void setYearOfRelease(int yearOfRelease) {
        this.yearOfRelease = yearOfRelease;
    }

    @Override
    public Car clone() throws CloneNotSupportedException {
        Car car = null;
        try {
            car = (Car)super.clone();
        } catch (CloneNotSupportedException e) {
            car = new Car(5, "black", engine,
                    "Suzuki", 2007);
        }
        car.engine = engine.clone();
        return car;
    }
}
