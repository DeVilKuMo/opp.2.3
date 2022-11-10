package dz1;

public class Birds extends Animals  {


    public Birds(String name, int age, String habitat) {
        super(name, age, habitat);
    }

    @Override
    public void eat() {
        System.out.println(getName()+"ест");
    }

    @Override
    public void go() {
        System.out.println(getName()+"летает");

    }
    public void hut(){
        System.out.println(getName()+"охотится");
    }
}
