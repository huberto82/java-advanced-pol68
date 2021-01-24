package inheritance;

import java.time.LocalDate;

public class Panda extends Bear {
    static final String colorDescription = "black&white";

    public Panda(String name, double weight, LocalDate birthDate) {
        super(name, weight, birthDate);
    }

    public String getColor(){
        return "black&white";
    }

    @Override
    public String toString() {
        return "Panda{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                ", birthDate=" + birthDate +
                ", colorDescription='" + colorDescription + '\'' +
                '}';
    }
}
