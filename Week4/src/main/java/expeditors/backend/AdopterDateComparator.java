package expeditors.backend;

import java.util.Comparator;

public class AdopterDateComparator implements Comparator<Adopter> {
    @Override
    public int compare(Adopter a1, Adopter a2) {
        return a1.getDateOfAdoption().compareTo(a2.getDateOfAdoption());
    }
}
