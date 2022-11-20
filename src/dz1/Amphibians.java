package dz1;

    public class Amphibians extends Animal {


        public Amphibians(String name, int age, String habitat) {
            super(name, age, habitat);
        }

        @Override
        public void eat() {
            System.out.println(getName()+" ест");
        }

        @Override
        public void go() {
            System.out.println(getName()+" передвигается вода и суши");

        }

        public  void hut(){
        System.out.println(getName()+" Охотиться ");

        }

    }
