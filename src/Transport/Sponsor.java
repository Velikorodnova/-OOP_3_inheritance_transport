package Transport;

public class Sponsor {

    private String name;
    private int sum;

    public Sponsor(String name, int sum) {
        this.name = name;
        this.sum = sum;
    }

    public void sponsorRace() {
        System.out.println("Спонсировать заезд");

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSum() {
        return sum;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }

    @Override
    public String toString() {
        return "Спонсор " + name + " проспонсировал на " + sum;
    }
}
