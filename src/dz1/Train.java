package dz1;

public class Train extends Transport {
    private double cost;
    private double travelTime;
    private String departureStationName;
    private String finalStop;
    private int numberOfWagons;

    private String brand;
    private String model;
    private int productionYear;
    private String productionCountry;
    private int maxSpeed;


    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    @Override
    public void refill() {
        System.out.println("Вид топлива для заправки поезда " + getBrand() + ": " + getFuel());

    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public void setProductionYear(int productionYear) {
        this.productionYear = productionYear;
    }

    public String getProductionCountry() {
        return productionCountry;
    }

    public void setProductionCountry(String productionCountry) {
        this.productionCountry = productionCountry;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public double getTravelTime() {
        return travelTime;
    }

    public void setTravelTime(double travelTime) {
        this.travelTime = travelTime;
    }

    public String getDepartureStationName() {
        return departureStationName;
    }

    public void setDepartureStationName(String departureStationName) {
        this.departureStationName = departureStationName;
    }

    public String getFinalStop() {
        return finalStop;
    }

    public void setFinalStop(String finalStop) {
        this.finalStop = finalStop;
    }

    public int getNumberOfWagons() {
        return numberOfWagons;
    }

    public void setNumberOfWagons(int numberOfWagons) {
        numberOfWagons = numberOfWagons;
    }

    public Train(String brand, String model, Integer productionYear, String productionCountry, Integer maxSpeed,
                 String departureStationName,String finalStop, Double cost, int numberOfWagons
                 ) {
        super();

        this.cost = cost;
        this.travelTime = travelTime;
        this.departureStationName = departureStationName;
        this.finalStop = finalStop;
        numberOfWagons = numberOfWagons;
        this.brand = brand;
        this.model = model;
        this.productionYear = productionYear;
        this.productionCountry = productionCountry;
        this.maxSpeed = maxSpeed;
    }

}
