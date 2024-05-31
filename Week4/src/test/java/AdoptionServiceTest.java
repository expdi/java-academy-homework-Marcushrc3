import expeditors.backend.Adopter;
import expeditors.backend.AnimalType;
import expeditors.backend.AdopterDAO;
import expeditors.backend.AdoptionService;
import expeditors.backend.InMemoryAdopterDAO1;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AdoptionServiceTest {
    private AdoptionService service;

    @BeforeEach
    public void setUp() {
        AdopterDAO adopterDAO = new InMemoryAdopterDAO1();
        service = new AdoptionService(adopterDAO);

        service.addAdopter(new Adopter(1, "Marcus", "Cookie", 1234567890L, LocalDate.of(2023, 5, 19), "Labrador", AnimalType.DOG));
        service.addAdopter(new Adopter(2, "Silvana", "Flaff", 9876543210L, LocalDate.of(2023, 5, 20), "Siamese", AnimalType.CAT));
        service.addAdopter(new Adopter(3, "Maria do Carmo", "Pitt", 1122334455L, LocalDate.of(2023, 4, 22), "Poodle", AnimalType.DOG));
    }

    @Test
    public void testGetAdoptersByName() {
        List<Adopter> marcusAdopters = service.getAdoptersByName("Marcus");
        assertEquals(1, marcusAdopters.size());
        assertEquals("Marcus", marcusAdopters.get(0).getAdopterName());
    }

    @Test
    public void testSortByNaturalOrder() {
        List<Adopter> sortedAdopters = service.sortByNaturalOrder();
        assertEquals(3, sortedAdopters.size());
        assertEquals("Maria do Carmo", sortedAdopters.get(1).getAdopterName());
    }

    @Test
    public void testSortByDateOfAdoption() {
        List<Adopter> sortedAdopters = service.sortByDateOfAdoption();
        assertEquals(3, sortedAdopters.size());
        assertEquals("Maria do Carmo", sortedAdopters.get(0).getAdopterName());
    }
}
