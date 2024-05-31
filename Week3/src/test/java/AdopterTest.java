import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;

import expeditors.backend.AnimalType;
import expeditors.backend.Adopter;
import org.testng.annotations.Test;

public class AdopterTest {

    @Test
    public void testFullConstructor() {
        Adopter adopter = new Adopter(1, "John Doe", "Buddy", 1234567890L, LocalDate.of(2023, 1, 1), "Labrador", AnimalType.DOG);
        assertEquals(1, adopter.getId());
        assertEquals("John Doe", adopter.getAdopterName());
        assertEquals("Buddy", adopter.getPetName());
        assertEquals(1234567890L, adopter.getPhoneNumber());
        assertEquals(LocalDate.of(2023, 1, 1), adopter.getDateOfAdoption());
        assertEquals("Labrador", adopter.getAnimalBreed());
        assertEquals(AnimalType.DOG, adopter.getAnimalType());
    }

    @Test
    public void testMinimalConstructor() {
        Adopter adopter = new Adopter(2, "Clelton", 9876543210L, LocalDate.of(2023, 1, 1), AnimalType.CAT);
        assertEquals(2, adopter.getId());
        assertEquals("Clelton", adopter.getAdopterName());
        assertEquals("", adopter.getPetName());  // Valor padrão
        assertEquals(9876543210L, adopter.getPhoneNumber());
        assertEquals(LocalDate.of(2023, 1, 1), adopter.getDateOfAdoption());
        assertEquals("", adopter.getAnimalBreed());  // Valor padrão
        assertEquals(AnimalType.CAT, adopter.getAnimalType());
    }
}
