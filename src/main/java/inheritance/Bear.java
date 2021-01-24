package inheritance;

import java.time.LocalDate;

public class Bear {
    String name;
    double weight;
    LocalDate birthDate;

    public Bear(String name, double weight, LocalDate birthDate) {
        this.name = name;
        this.weight = weight;
        this.birthDate = birthDate;
    }

    public String getColor() {
        return "unknown";
    }

    @Override
    public String toString() {
        return "Bear{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                ", birthDate=" + birthDate +
                '}';
    }
}
