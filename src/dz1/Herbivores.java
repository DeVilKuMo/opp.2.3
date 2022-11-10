package dz1;

public class Herbivores extends Mammals{
    public Herbivores(String name, int age, String habitat) {
        super(name, age, habitat);
    }

    @Override
    public void eat() {
        System.out.println(getName()+"ест");
    }

    @Override
    public void go() {
        System.out.println(getName()+" ходит ");
    }
    public void graze(){
        System.out.println(getName()+" пастись");
    }
}
