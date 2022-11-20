package dz1;

public class Flying extends Birds {
    public String getMovementType() {
        return movementType;
    }

    public void setMovementType(String movementType) {
        this.movementType = movementType;
    }

    private String movementType;

    public Flying(String name, int age, String habitat) {
        super(name, age, habitat);
    }

    public void fly() {
        System.out.println(getName()+" Летать ");
    }

    @Override
    public void eat() {
        System.out.println(getName()+" ест ");
    }

    @Override
    public void go() {
        System.out.println(getName()+" Летает");
    }
}
