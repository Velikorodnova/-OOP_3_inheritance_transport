package Transport;
public class DriverB extends Driver <Car>{

    public DriverB(String name, boolean driverLicense, int experience, String category) {
        super(name, driverLicense, experience, category);
    }

    @Override
    public void startMoving() {
        System.out.println("Начать движение");
    }

    @Override
    public void stopMoving() {
        System.out.println("Закончить движение");

    }

    @Override
    public void refill() {
        System.out.println("Нужно заправлять бензином или дизельным топливом" );
    }

    @Override
    public void driveTransport(Car car) {
        System.out.println("Водитель " + getName() + " водит машину " + car.getBrand() + " и может участвовать в заезде.");
    }



}
