package expeditors.backend.customer;

import expeditors.backend.customer.domain.Customer;
import expeditors.backend.customer.jconfig.CustAppConfig;
import expeditors.backend.customer.service.CustomerService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class Application {

    public static void main(String[] args) {
        Application app = new Application();
        app.go();
    }

    public void go() {
        ApplicationContext context = new AnnotationConfigApplicationContext(CustAppConfig.class);

        CustomerService service = context.getBean("customerService", CustomerService.class);

        List<Customer> customers = service.getCustomers();

        System.out.println("customers: " + customers.size());
        customers.forEach(System.out::println);

    }
}
