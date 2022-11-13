package Transport;

public class Mechanic<T extends Transport> {

    private String name;
    private String company;

    public Mechanic(String name, String company) {
        this.name = name;
        company = company;
    }

    public boolean getDiagnosed(T t) {
        return t.getDiagnosed();

    }

    public boolean fixTheCar() {
        return fixTheCar();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        company = company;
    }

    @Override
    public String toString() {
        return "Механик " + name + "работает в " + company;
    }
}
