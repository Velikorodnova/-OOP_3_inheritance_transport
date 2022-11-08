package Transport;

import java.time.LocalDate;

public class Car extends Transport implements Сompeting {

//    double engineVolume;
//    private String transmission;
//    private String bodyType;
//    private String registrationNumber;
//    private int numberOfSeats;
//    private static boolean summerTires;

    public Car(String brand, String model, double engineVolume) {
        super(brand, model, engineVolume);
//        this.engineVolume = engineVolume;
//        this.transmission = transmission;
//        this.bodyType = bodyType;
//        this.registrationNumber = registrationNumber;
//        this.numberOfSeats = numberOfSeats;

//        if (engineVolume == 0) {
//            this.engineVolume = 1.5;
//        } else {
//            this.engineVolume = engineVolume;
//        }
//
//        if (transmission == null || transmission.isEmpty()) {
//            this.transmission = "Механическая";
//        } else {
//            this.transmission = transmission;
//        }
//        if (bodyType == null || bodyType.isEmpty()) {
//            this.bodyType = "Седан";
//        } else {
//            this.bodyType = bodyType;
//        }
//        if (registrationNumber == null || registrationNumber.isEmpty()) {
//            this.registrationNumber = "х000хх000";
//        } else {
//            this.registrationNumber = registrationNumber;
//        }
//        if (numberOfSeats == 0) {
//            this.numberOfSeats = 5;
//        } else {
//            this.numberOfSeats = numberOfSeats;
//        }
//
//    }
//
//    public String getBodyType() {
//        return bodyType;
//    }
//
//    public int getNumberOfSeats() {
//        return numberOfSeats;
//    }
//
//    public double getEngineVolume() {
//        return engineVolume;
//    }
//
//    public void setEngineVolume(double engineVolume) {
//        if (engineVolume == 0) {
//            this.engineVolume = 1.5;
//        } else {
//            this.engineVolume = engineVolume;
//        }
//    }
//
//    public String getTransmission() {
//        return transmission;
//    }
//
//    public void setTransmission(String transmission) {
//        if (transmission == null || transmission.isEmpty()) {
//            this.transmission = "Механическая";
//        } else {
//            this.transmission = transmission;
//        }
//    }
//
//    public String getRegistrationNumber() {
//        return registrationNumber;
//    }
//
//    public void setRegistrationNumber(String registrationNumber) {
//        if (registrationNumber == null || registrationNumber.isEmpty()) {
//            this.registrationNumber = "х000хх000";
//        } else {
//            this.registrationNumber = registrationNumber;
//        }
//    }
//
//    public boolean getSummerTires() {
//        return summerTires;
//    }
//
//    public void setSummerTires(boolean summerTires) {
//        LocalDate date = LocalDate.now();
//        int currentMonth = date.getMonthValue();
//        this.summerTires = currentMonth <= 10 && currentMonth >= 5;
//    }
//
//    public boolean correctRegistrationNumber() {
//        if (registrationNumber.length() != 9) {
//            return false;
//        }
//
//        char chars[] = registrationNumber.toCharArray();
//        if (!Character.isAlphabetic(chars[0]) || !Character.isLetter(chars[4]) || !Character.isLetter(chars[5])) {
//            return false;
//        }
//        if (!Character.isDigit(chars[1]) || !Character.isDigit(chars[2]) || !Character.isDigit(chars[3]) ||
//                !Character.isDigit(chars[6]) || !Character.isDigit(chars[7]) || !Character.isDigit(chars[8])) {
//            return false;
//        }
//
//        return true;
//    }
    }

    @Override
    public void startMoving() {
        System.out.println("Сесть в машину и поехать");

    }

    @Override
    public void stopMoving() {
        System.out.println("Остановить машину и выйти из нее");

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

    public static final double SEE_LAP_TIME = 20.05;
    public static final int SEE_MAX_SPEED = 250;

    public static final String allPitStop = "Замена покрышек, Технический осмотр, Заправка топливом";

    public enum bodyType {
        SEDAN("Седан"), HATCHBACK("Хетчбек"), COUPE("Купе"), UNIVERSAL("Универсал"), SUV("Внедорожник"),
        CROSSOVER("Кроссовер"), PICKUP("Пикап"), MINVEN("Минивен");

        private String titleBodyType;

        bodyType(String titleBodyType) {
            this.titleBodyType = titleBodyType;
        }

        public String getTitleBodyType() {
            return titleBodyType;
        }

        public void setTitleBodyType(String titleBodyType) {
            this.titleBodyType = titleBodyType;
        }

    }

    @Override
    public boolean getDiagnosed() {
        return Math.random() > 0.6;
    }
//    public String toString() {
//        return super.toString() +
//
//                ", Объем двигателя - " + engineVolume +
//                ", Коробка передач -  " + transmission +
//                ", Тип кузова - " + bodyType +
//                ", Регистрационный номер - " + registrationNumber +
//                ", Количество мест - " + numberOfSeats +
//                ", Шины - " + summerTires;
//    }
//
//    @Override
//    public void refill() {
//        System.out.println("Нужно заправлять бензином, " +
//                "дизелем на заправке или " +
//                "заряжать на специальных электроду-парковках");
//    }


}
