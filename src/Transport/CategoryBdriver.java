package Transport;
public class CategoryBdriver extends Driver <Car>{

    public CategoryBdriver(String name, boolean driverLicense, int experience) {
        super(name, driverLicense, experience);
    }

    @Override
    public void startMoving() {
    }

    @Override
    public void stopMoving() {
    }

    @Override
    public void refill() {
    }

}
