package dz1;

public class Flightless extends Birds{
    private String movementType;

    public String getMovementType() {
        return movementType;
    }

    public void setMovementType(String movementType) {
        this.movementType = movementType;
    }

    public Flightless(String name, int age, String habitat) {
        super(name, age, habitat);
    }

    public void walk() {
        System.out.println(getName()+" Гулять ");
    }

    @Override
    public void eat() {
        System.out.println(getName()+"кушать");

    }

    @Override
    public void go() {
        System.out.println(getName()+"ходит");

    }
}
