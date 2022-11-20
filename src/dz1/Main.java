package dz1;

public class Main {
    public static void main(String[] args) {
        Amphibians frog = new Amphibians("Лягушка", 1, "болото");
        Amphibians snakes = new Amphibians("Уж пресноводный", 5, "лес");
        Flightless peacock = new Flightless("Павлин", 5, " Джунгли");
        Flightless penguin = new Flightless("Пиньгвин", 3, "Арктика");
        Flightless dodo = new Flightless("Птица додо", 4, "лес");
        Flying gull = new Flying("Чайка ", 2, "берег морской");
        Flying falcon = new Flying("Сокол", 5, "степь");
        Flying albatross = new Flying("Альбатрос", 4, "Южный океан");
        Herbivores gazelle = new Herbivores("Газель", 2, "Африка");
        Herbivores giraffe = new Herbivores("Жираф", 3, "Африка");
        Herbivores horse = new Herbivores("Лошадь", 5, "Россия");
        Predators hyena = new Predators("Гиена", 6, "Азия");
        Predators tiger = new Predators("Тигр", 2, "Индия");
        Predators bear = new Predators("Медведь", 7, "Россия");
        System.out.println();
        snakes.hut();
        frog.hut();
        peacock.walk();
        penguin.walk();
        gull.fly();
        dodo.eat();
        falcon.fly();
        albatross.fly();
        gazelle.graze();
        giraffe.graze();
        horse.graze();
        hyena.hut();
        tiger.hut();
        bear.hut();

    }


}
