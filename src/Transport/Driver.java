package Transport;

public abstract class Driver<T extends Transport & Сompeting> {
    private String name;
    private boolean driverLicense;
    private int experience;

    private String category;


    public Driver(String name) {
        this.name = name;
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
    public String toString() {
        return "Водитель - " + name +
                ", водительские права - " + driverLicense +
                ", стаж - " + experience + ", ";
    }

    public abstract void driveTransport(T transport);

}
