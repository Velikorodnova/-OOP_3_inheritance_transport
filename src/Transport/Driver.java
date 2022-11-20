package Transport;

import java.util.Objects;

public abstract class Driver<T extends Transport & Сompeting> {
    private String name;
    private boolean driverLicense;
    private int experience;

    private String category;


    public Driver(String name) {
        this.name = name;
    }

    public boolean isDriverLicense() {
        return driverLicense;
    }

    public Driver(String name, boolean driverLicense, int experience, String category) {
        this.name = name;
        this.driverLicense = driverLicense;
        this.experience = experience;
        setCategory(category);


        if (experience == 0 || experience <= 2) {
            this.experience = 3;
        } else {
            this.experience = experience;
        }

        if (name == null || name.isEmpty() || name.isBlank()) {
            this.name = "Driver";
        } else {
            this.name = name;
        }

    }

    public abstract void startMoving();

    public abstract void stopMoving();

    public abstract void refill();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null || name.isEmpty() || name.isBlank()) {
            this.name = "Driver";
        } else {
            this.name = name;
        }
    }

    public boolean getDriverLicense() {
        return driverLicense;
    }

    public void setDriverLicense(boolean driverLicense) {
        this.driverLicense = driverLicense;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        if (experience == 0) {
            this.experience = 3;
        } else {
            this.experience = experience;
        }
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        if (category == null) {
            throw new IllegalArgumentException("Необходимо указать тип прав!");
        }
        this.category = category;
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Driver<?> driver = (Driver<?>) o;
        return driverLicense == driver.driverLicense && experience == driver.experience && Objects.equals(name, driver.name) && Objects.equals(category, driver.category);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, driverLicense, experience, category);
    }

    @Override
    public String toString() {
        return "Водитель - " + name +
                ", водительские права - " + driverLicense +
                ", стаж - " + experience + ", ";
    }

    public abstract void driveTransport(T transport);

}
