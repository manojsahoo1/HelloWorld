public class Car {
    private String name;
    private int modelYear;
    private String color;

    public Car() {
    }

    public Car(String name, int modelYear, String color) {
        this.name = name;
        this.modelYear = modelYear;
        this.color = color;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setModelYear(int modelYear) {
        this.modelYear = modelYear;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public int getModelYear() {
        return modelYear;
    }

    public String getColor() {
        return color;
    }
}
