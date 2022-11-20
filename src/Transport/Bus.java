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

    public enum capacityType {
        EXTRA_SMALL("Oсобо малая вместимость"), SMALL("Малая вместимость"), MEDIUM("Средняя вместимость"),
        LARGE("Большая вместимость"), ESPECIALLY_LARGE("Особо большая вместимость");

        public static void determineTheTypeOfCar(String titleCapacityType) {
            Bus.capacityType tmp = null;
            for (Bus.capacityType value : values()) {
                if (value.getTitleCapacityType().equals(titleCapacityType)) {
                    tmp = value;
                }
            }
            if (tmp != null) {
                System.out.println(tmp.getTitleCapacityType());
            } else {
                System.out.println("Недостаточно данных об авто");
            }
        }

        private String titleCapacityType;

        capacityType(String titleCapacityType) {
            this.titleCapacityType = titleCapacityType;
        }

        public String getTitleCapacityType() {
            return titleCapacityType;
        }

        public void setTitleCapacityType(String titleCapacityType) {
            this.titleCapacityType = titleCapacityType;
        }

    }

    @Override
    public boolean getDiagnosed() {
        System.out.println("Автобус " + getBrand() + getModel() + " в диагностике не нуждается");
        return true;
    }

    @Override
    public void fixTheCar() {
        System.out.println(getBrand() + " " + getModel() + " починена");
    }

    //    public Bus(double maxSpeed) {
//        super(maxSpeed);
//    }

}