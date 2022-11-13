package dz1;

public class Mammal extends Animal {
    private int speed;

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public Mammal(String name, int age, String habitat) {
        super(name, age, habitat);
    }

    @Override
    public void eat() {
        System.out.println(getName()+"ест");
    }

    @Override
    public void go() {
        System.out.println(getName()+" передвигается ");
    }
}
