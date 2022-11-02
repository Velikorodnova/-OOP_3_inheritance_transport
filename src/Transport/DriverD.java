package Transport;

public class DriverD extends Driver<Bus> {

    public DriverD(String name, boolean driverLicense, int experience) {
        super(name, driverLicense, experience);
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
    public void driveTransport(Bus bus) {
        System.out.println("Водитель " + getName() + " водит машину " + bus.getBrand() + " и может участвовать в заезде.");
    }


}
