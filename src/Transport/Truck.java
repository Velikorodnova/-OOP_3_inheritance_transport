package Transport;


public class Truck extends Transport implements Сompeting {

    public Truck(String brand, String model, double engineVolume) {
        super(brand, model, engineVolume);
    }

    @Override
    public void startMoving() {
        System.out.println("Сесть в грузовик и поехать");

    }

    @Override
    public void stopMoving() {
        System.out.println("Остановить грузовик и выйти из него");


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

//    public static final String TIRE_REPLACEMENT = "Замена покрышек";
//    public static final String TECHNICAL_INSPECTION = "Технический осмотр";
//    public static final String FUELING = "Заправка топливом";
    public static final double SEE_LAP_TIME = 28.5;
    public static final int SEE_MAX_SPEED = 110;

    public static final String allPitStop = "Замена покрышек, Технический осмотр, Заправка топливом";


//    public void doPitStop(String pitStop) {
//        switch (pitStop) {
//            case TIRE_REPLACEMENT:
//                System.out.println("Снять старые покрышки");
//                System.out.println("Поставить новые покрышки");
//                break;
//            case TECHNICAL_INSPECTION:
//                System.out.println("Проверка исправности основных узлов авто");
//                break;
//            case FUELING:
//                System.out.println("Заправить авто подходящим видом топлива");
//                break;
//            default:
//                System.out.println("Данное действие не предусмотрено для пит стопа");
//        }
//
//    }


}
