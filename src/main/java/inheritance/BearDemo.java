package inheritance;

import java.time.LocalDate;

public class BearDemo {
    public static void main(String[] args) {
        Bear misiek = new Bear("Misiek", 150, LocalDate.now());
        Panda panda = new Panda("Panda", 140, LocalDate.now());
        System.out.println(misiek);
        System.out.println(panda);
        System.out.println(panda.getColor());
    }
}
