package dz1;

public class Main {
    public static void main(String[] args) {
        transport lada = new transport("Лада", "Гранта", 2015, "Россия", null, 200);

        Train lastochka = new Train("Ласточка", "В-901", 2011, "Россия",301,
                "Белорусский вокзал", "Минск-Пассажирский", 3500.0, 11);

        Train leningrad = new Train("Ленинград", "D-125", 2019, "Россия", 270,
                "Ленинградский вокзал", "Ленинградский-Пассажирский", 1700.0,8);

        Bus volvo = new Bus("Volvo", "B12 Series", 2019, "Германия", "белый", 220);
        Bus mercedes = new Bus("Mercedes-Benz", "Sprinter", 2021, "Германия", "черный", 280);
        Bus neoplan = new Bus("Neoplan", "Cityliner", 2011, "Германия", "зеленый", 190);



        printInfo(lada);

        printtInfo(lastochka);
        printtInfo(leningrad);

        printInfoBus(volvo);
        printInfoBus(mercedes);
        printInfoBus(neoplan);
    }
    private static void printInfo (transport transport){
        System.out.println("Марка автомобиля: "+ transport.getBrand()
                +" ,Модель: " + transport.getModel()
                +" ,год: "+ transport.getYearOut()
                +" ,производитель: " + transport.getCountry()
                +" ,цвет: "+transport.getColor()
                +" ,максимальная  скорость передвижения: " +transport.getSpeedMax());

    }
    private static void printtInfo(Train train){
        System.out.println("Поезд -" + train.getBrand()
                + ", модель: " + train.getModel()
                + ", " + train.getProductionYear()
                + " года, "
                + "страна - " + train.getProductionCountry()
                + ", макс.скорость - " + train.getMaxSpeed()
                + " км/час, ст. отправления - "
                + train.getDepartureStationName()
                + ", прибывает на станцию - " + train.getDepartureStationName()
                + ", цена билета составляет " +train.getCost()
                + " рублей, количество мест в вагоне - " + train.getNumberOfWagons() + ".");
    }
    private static void printInfoBus(Bus bus){
        System.out.println("Марка автобуса: "+ bus.getBrand()
                +" ,Модель: " + bus.getModel()
                +" ,год: "+ bus.getYearOut()
                +" ,производитель: " + bus.getCountry()
                +" ,цвет: "+bus.getColor()
                +" ,максимальная  скорость передвижения: " +bus.getSpeedMax());
    }
}
