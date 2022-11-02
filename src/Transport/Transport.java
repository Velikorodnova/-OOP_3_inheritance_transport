package Transport;

import java.util.Objects;

public abstract class Transport {
    private String brand;
    private String model;
    private double engineVolume;
//    private String color;
//    private int productionYear;
//    private String productionCountry;
//    private double maxSpeed;


    public Transport(String brand, String model, double engineVolume) {
        this.brand = brand;
        this.model = model;
        this.engineVolume = engineVolume;
//        this.color = color;
//        this.productionYear = productionYear;
//        this.productionCountry = productionCountry;

        if (model == null || model.isEmpty()) {
            this.model = "default";
        } else {
            this.model = model;
        }
        if (brand == null || brand.isEmpty()) {
            this.brand = "default";
        } else {
            this.brand = brand;
        }
        if (engineVolume == 0) {
            this.engineVolume = 1.5;
        } else {
            this.engineVolume = engineVolume;
        }

//        if (productionCountry == null || productionCountry.isEmpty()) {
//            this.productionCountry = "default";
//        } else {
//            this.productionYear = productionYear;
//        }
//        if (color == null || color.isEmpty()) {
//            this.color = "Белый";
//        } else {
//            this.color = color;
//        }
//        if (productionYear == 0) {
//            this.productionYear = 2000;
//        } else {
//            this.productionYear = productionYear;
//        }
    }

//    public Transport(double maxSpeed) {
//        this.maxSpeed = maxSpeed;
//
//        if (maxSpeed == 0) {
//            this.maxSpeed = 150.00;
//        } else {
//            this.maxSpeed = maxSpeed;
//        }


//    public double getMaxSpeed() {
//        return maxSpeed;
//    }
//
//    public void setMaxSpeed(double maxSpeed) {
//        this.maxSpeed = maxSpeed;
//    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

//    public String getColor() {
//        return color;
//    }
//
//    public void setColor(String color) {
//        this.color = color;
//    }
//
//    public int getProductionYear() {
//        return productionYear;
//    }
//
//    public void setProductionYear(int productionYear) {
//        this.productionYear = productionYear;
//    }
//
//    public String getProductionCountry() {
//        return productionCountry;
//    }
//
//    public void setProductionCountry(String productionCountry) {
//        this.productionCountry = productionCountry;
//    }

    public String toString() {
        return "Бренд - " + brand +
                ", Модель - " + model +
                ", Объем двигателя - " + engineVolume;
//                ", Цвет - " + color +
//                ", Год выпуска - " + productionYear +
//                ", Страна сборки - " + productionCountry;
    }

    public abstract void startMoving();
    public abstract void stopMoving();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Transport transport = (Transport) o;
        return Double.compare(transport.engineVolume, engineVolume) == 0
                && Objects.equals(brand, transport.brand)
                && Objects.equals(model, transport.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, model, engineVolume);
    }




    //    public abstract void refill();
}
