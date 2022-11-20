package Transport;

import java.util.Objects;

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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Mechanic<?> mechanic = (Mechanic<?>) o;
        return Objects.equals(name, mechanic.name) && Objects.equals(company, mechanic.company);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, company);
    }

    @Override
    public String toString() {
        return "Механик " + name + "работает в " + company;
    }
}
