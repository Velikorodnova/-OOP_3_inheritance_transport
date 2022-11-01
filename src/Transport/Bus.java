package Transport;

public class Bus extends Transport implements Сompeting {


//    @Override
//    public void refill() {
//        System.out.println("Нужно заправить бензином или дизельным топливом");
//    }

    public Bus(String brand, String model, double engineVolume) {
        super(brand, model, engineVolume);
    }

    @Override
    public void startMoving() {
        System.out.println("Сесть в автобус и поехать");

    }

    @Override
    public void stopMoving() {
        System.out.println("Остановить автобус и выйти из него");

    }


    @Override
    public String pitStop() {
        return allPitStop;
    }

    @Override
    public double bestLapTime() {
        return SEE_LAP_TIME;
    }

    @Override
    public int maxSpeed() {
        return SEE_MAX_SPEED;
    }

    public static final double SEE_LAP_TIME = 60.00;
    public static final int SEE_MAX_SPEED = 100;

    public static final String allPitStop = "Замена покрышек, Технический осмотр, Заправка топливом";

    //    public Bus(double maxSpeed) {
//        super(maxSpeed);
//    }

}