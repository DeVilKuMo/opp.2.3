package dz1;

public class Bus {

    private String brand;

    private String model;

    private int yearOut;

    private String country;

    private String color;

    private int speedMax;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYearOut() {
        return yearOut;
    }

    public void setYearOut(int yearOut) {
        this.yearOut = yearOut;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getSpeedMax() {
        return speedMax;
    }

    public void setSpeedMax(int speedMax) {
        this.speedMax = speedMax;
    }

    public Bus(String brand, String model, int yearOut, String country, String color, int speedMax) {
        this.brand = brand;
        this.model = model;
        this.yearOut = yearOut;
        this.country = country;
        this.color = color;
        this.speedMax = speedMax;
    }
}
