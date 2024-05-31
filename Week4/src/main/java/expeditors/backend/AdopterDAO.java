package expeditors.backend;

import java.util.List;

public interface AdopterDAO {
    void addAdopter(Adopter adopter);
    List<Adopter> getAdopters();
    List<Adopter> getAdoptersByName(String name);
    List<Adopter> sortByNaturalOrder();
    List<Adopter> sortByDateOfAdoption();
    List<Adopter> findBy(AdoptionService.Criteria criteria);
}
