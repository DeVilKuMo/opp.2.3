package dz1;

public abstract class transport {
     private String brand;

     private String model;

     private int yearOut;

     private String country;

    private String color;

    private int speedMax;

    private final String fuel;






    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getYearOut() {
        return yearOut;
    }

    public String getCountry() {
        return country;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if (color != null){
        }else {
            this.color = " цвет не указан ";
        }
        if (color == null) {
            this.color = "Белый";
        } else {
            this.color = color;
        }

    }

    public int getSpeedMax() {
        return speedMax;
    }

    public String getFuel() {
        return fuel;
    }

    public void setSpeedMax(int speedMax) {
        if (speedMax<=0){
            this.speedMax = speedMax;
        }

    }

    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public transport(String brand, String model, int yearOut, String country, String color, int speedMax,String fuel) {
        this.brand = brand;
        this.model = model;
        this.yearOut = yearOut;
        this.country = country;
        this.color = color;
        this.speedMax = speedMax;
        this.fuel=fuel;


        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////



    }
    public abstract void refill();
    @Override
    public String toString() {
        return "transport{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", yearOut=" + yearOut +
                ", country='" + country + '\'' +
                ", color='" + color + '\'' +
                ", speedMax=" + speedMax +
                ", fuel='" + fuel + '\'' +
                '}';
    }
}
