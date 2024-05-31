package expeditors.backend;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Adopter> adopters = new ArrayList<>();

        Adopter adopter1 = new Adopter(1, "Marcus Silva", "Cookie", 1234567890L, LocalDate.of(2023, 1, 1), "Labrador", AnimalType.DOG);
        Adopter adopter2 = new Adopter(2, "Silvana Mariano", "Flaff", 9876543210L, LocalDate.of(2023, 1, 1), "Siamese", AnimalType.CAT);

        adopters.add(adopter1);
        adopters.add(adopter2);

        for (Adopter adopter : adopters) {
            System.out.println(adopter);
        }
    }
}
