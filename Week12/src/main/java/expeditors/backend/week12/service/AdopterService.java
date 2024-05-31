package expeditors.backend.week12.service;

import expeditors.backend.week12.builder.AdopterBuilder;
import expeditors.backend.week12.model.Adopter;
import expeditors.backend.week12.repository.AdopterRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Service
public class AdopterService {
    @Autowired
    private AdopterRepo adopterRepo;

    public List<Adopter> getAll() {
        return adopterRepo.findAll();
    }


    public Adopter createAdopter (){
        AdopterBuilder builder = new AdopterBuilder();
        Adopter adopter1 = builder.setName("Marcus")
                .setBornDate(LocalDate.of(1999, Month.MAY,28))
                .setEmail("Marcushrc3@outlook.com")
                .setAdress("Estrada do campo limpo 560")
                .build();
        adopterRepo.save(adopter1);
        return adopter1;
    }
}
