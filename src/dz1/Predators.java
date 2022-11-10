package dz1;

public class Predators extends Mammals{


    public Predators(String name, int age, String habitat) {
        super(name, age, habitat);
    }

    @Override
    public void eat() {
        System.out.println(getName()+"Ест");
    }

    @Override
    public void go() {
        System.out.println(getName()+"ходит");
    }
    public void hut(){
        System.out.println(getName()+" охотится");
    }
}
