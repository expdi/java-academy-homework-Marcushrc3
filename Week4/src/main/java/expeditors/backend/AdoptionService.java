package expeditors.backend;

import java.util.List;

public class AdoptionService {
    private AdopterDAO adopterDAO;

    public AdoptionService(AdopterDAO adopterDAO) {
        this.adopterDAO = adopterDAO;
    }

    public void addAdopter(Adopter adopter) {
        adopterDAO.addAdopter(adopter);
    }

    public List<Adopter> getAdopters() {
        return adopterDAO.getAdopters();
    }

    public List<Adopter> getAdoptersByName(String name) {
        return adopterDAO.getAdoptersByName(name);
    }

    public List<Adopter> sortByNaturalOrder() {
        return adopterDAO.sortByNaturalOrder();
    }

    public List<Adopter> sortByDateOfAdoption() {
        return adopterDAO.sortByDateOfAdoption();
    }


    public interface Criteria {
        boolean matches(Adopter adopter);
    }
}
