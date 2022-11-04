import Transport.*;
//import Transport.Train;


public class Main {
    public static void main(String[] args) {

        Car ferrari = new Car("Ferrari", "812", 6.5);
        System.out.println(ferrari);
        ferrari.startMoving();
        ferrari.stopMoving();
        Car chevrolet = new Car("Chevrolet", "Camaro", 3.6);
        System.out.println(chevrolet);
        chevrolet.startMoving();
        chevrolet.stopMoving();
        Car bmw = new Car("BMW", "M4 GT4", 3.00);
        System.out.println(bmw);
        bmw.startMoving();
        bmw.stopMoving();
        Car porsche = new Car("Porsche", "911 GT3", 3.9);
        System.out.println(porsche);
        porsche.startMoving();
        porsche.stopMoving();
        Truck kamaz = new Truck("КамАЗ", "АЗ-4326-9", 13);
        System.out.println(kamaz);
        kamaz.startMoving();
        kamaz.stopMoving();
        Truck daf = new Truck("DAF", "3300", 11.6);
        System.out.println(daf);
        daf.startMoving();
        daf.stopMoving();
        Truck man = new Truck("MAN", "TGX", 15.2);
        System.out.println(man);
        man.startMoving();
        man.stopMoving();
        Truck skania = new Truck("Skania", "5", 15.00);
        System.out.println(skania);
        skania.startMoving();
        skania.stopMoving();
        Bus bus1 = new Bus("BUS", "1", 20.00);
        System.out.println(bus1);
        bus1.startMoving();
        bus1.stopMoving();
        Bus bus2 = new Bus("BUS", "2", 19.00);
        System.out.println(bus2);
        bus2.startMoving();
        bus2.stopMoving();
        Bus bus3 = new Bus("BUS", "3", 18.00);
        System.out.println(bus3);
        bus3.startMoving();
        bus3.stopMoving();
        Bus bus4 = new Bus("BUS", "4", 17.00);
        System.out.println(bus4);
        bus4.startMoving();
        bus4.stopMoving();


        System.out.println("KamAZ - " + kamaz.bestLapTime());
        System.out.println("KamAZ - " + kamaz.pitStop());

        DriverB maks = new DriverB("Макс", true, 3);
        DriverC vlad = new DriverC("Влад", true, 0);
        DriverD oleg = new DriverD("Олег", true, 2);

        maks.driveTransport(chevrolet);
        vlad.driveTransport(man);
        oleg.driveTransport(bus1);

        Truck.loadType.determineTheTypeOfCar("5");
        Bus.capacityType.determineTheTypeOfCar("Малая вместимость");








//        Car lada = new Car("Lada", "Granta", "Синий", 2015, "Россия", 1.7, "Механическая", "Хечбек", "B222AK777", 5, true);
//        System.out.println(lada);
//        Car audi = new Car("Audi", "A8 50 L TDI quattro", "Черный", 2020, null, 3.0, "Механическая", "Хечбек", "B222AK777", 5, false);
//        System.out.println(audi);
//        Car bmw = new Car("BMW", "Z8", "Черный", 2021, "Германия", 0, "Механическая", "Хечбек", "B222AK777", 5, true);
//        System.out.println(bmw);
//        Car kia = new Car("Kia", "Sportage 4", "Красный", 0, "Южная Корея", 2.4, "Механическая", "Хечбек", "B222AK777", 5, false);
//        System.out.println(kia);
//        Car hyundai = new Car("Hyundai", "Avante", "Оранжевый", 2016, "Южная Корея", 1.6, "Механическая", "Хечбек", "B222AK777", 5, true);
//        System.out.println(hyundai);
//
//        Bus paz = new Bus("ПАЗ", "32053", "Синий", 2020, "Россия");
//        System.out.println(paz);
//
//
//        Train lastochka = new Train("Ласточка", "В-901", null, 2011, "Россия", 3500.00, 0, "Белорусский вокзал",
//                "Минск", 11, 0);
//        System.out.println(lastochka);
//
//        Train leningrad = new Train("Ленинград", "D-125", "Синий", 2019, "Россия", 1700.00, 0, "Ленинградский вокзал",
//                "Ленинград", 8, 0);
//        System.out.println(leningrad);
//        lastochka.refill();
//        hyundai.refill();
//        paz.refill();

    }


}

