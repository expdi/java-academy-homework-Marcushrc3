package expeditors.backend;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class InMemoryAdopterDAO1 implements AdopterDAO {
    private List<Adopter> adopters = new ArrayList<>();

    @Override
    public void addAdopter(Adopter adopter) {
        adopters.add(adopter);
    }

    @Override
    public List<Adopter> getAdopters() {
        return new ArrayList<>(adopters);
    }

    @Override
    public List<Adopter> getAdoptersByName(String name) {
        return adopters.stream()
                .filter(adopter -> adopter.getAdopterName().equalsIgnoreCase(name))
                .collect(Collectors.toList());
    }

    @Override
    public List<Adopter> sortByNaturalOrder() {
        return adopters.stream()
                .sorted()
                .collect(Collectors.toList());
    }

    @Override
    public List<Adopter> sortByDateOfAdoption() {
        return adopters.stream()
                .sorted(Comparator.comparing(Adopter::getDateOfAdoption))
                .collect(Collectors.toList());
    }

    @Override
    public List<Adopter> findBy(AdoptionService.Criteria criteria) {
        return adopters.stream()
                .filter(criteria::matches)
                .collect(Collectors.toList());
    }
}
