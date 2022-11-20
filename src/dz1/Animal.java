package dz1;

import java.util.Objects;

public abstract class Animal {
    private String name;
    private int age;
    private String habitat;

    public Animal(String name, int age, String habitat) {
        this.name = name;
        this.age = age;
        this.habitat = habitat;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Animals{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", habitat='" + habitat + '\'' +
                '}';
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return age == animal.age && Objects.equals(name, animal.name) && Objects.equals(habitat, animal.habitat);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, habitat);
    }

    public void  sleep(){
        System.out.println(getName()+" Спать ");
    }


    public abstract void eat();

    public abstract void go();
}