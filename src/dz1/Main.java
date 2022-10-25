package dz1;

public class Main {
    public static void main(String[] args) {
        transport lada = new transport("Лада", "Гранта", 2015, "Россия", null, 200);



        printInfo(lada);

    }
    private static void printInfo (transport transport){
        System.out.println("Марка автомобиля: "+ transport.getBrand()
                +" ,Модель: " + transport.getModel()
                +" ,год: "+ transport.getYearOut()
                +" ,производитель: " + transport.getCountry()
                +" ,цвет: "+transport.getColor()
                +" ,максимальная  скорость передвижения: " +transport.getSpeedMax());
    }

    }
