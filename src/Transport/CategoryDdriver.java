package Transport;

public class CategoryDdriver extends Driver<Bus> {

    public CategoryDdriver(String name, boolean driverLicense, int experience) {
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
