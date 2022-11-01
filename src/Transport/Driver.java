package Transport;

public abstract class Driver <Transport> {
    private String name;
    private boolean driverLicense;
    private int experience;

    public Driver(String name) {
        this.name = name;
    }

    public Driver(String name, boolean driverLicense, int experience) {
        this.name = name;
        this.driverLicense = driverLicense;
        this.experience = experience;

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

    public void driveTransport() {

    }

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

    @Override
    public String toString() {
        return "Водитель - " +
                name +
                ", водительские права - " + driverLicense +
                ", стаж - " + experience + ", ";
    }


}
