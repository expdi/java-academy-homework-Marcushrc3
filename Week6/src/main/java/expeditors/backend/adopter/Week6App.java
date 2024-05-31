package expeditors.backend.adopter;

import expeditors.backend.adopter.domain.Adopter;
import expeditors.backend.adopter.domain.Pet;
import expeditors.backend.adopter.service.AdopterService;
import expeditors.backend.customer.jconfig.CustAppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.time.LocalDate;
import java.util.List;

import static java.lang.System.out;

public class Week6App {

    public static void main(String[] args) {
        Week6App week6App = new Week6App();
        week6App.go();
    }

    public void go() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.getEnvironment().setActiveProfiles("dev");
        context.register(CustAppConfig.class);
        context.scan("expeditors.backend.adopter");
        context.refresh();

        AdopterService adopterService = context.getBean("adopterService", AdopterService.class);

        Adopter adopter = new Adopter("Marcus", "65416913",
                LocalDate.of(2024, 04, 8)
                ,"Rua Bocaina de Minas, 239"
                ,LocalDate.of(1999, 5, 28)
                ,Pet.builder(Pet.PetType.DOG).name("Cookie").build());
        adopterService.addAdopter(adopter);

        List<Adopter> result = adopterService.getAllAdopters();
        out.println("result: " + result.size());
        result.forEach(out::println);
    }
}
