package expeditors.backend.customer.jconfig;

import expeditors.backend.customer.dao.CustomerDAO;
import expeditors.backend.customer.dao.InMemoryCustomerDAO;
import expeditors.backend.customer.dao.JPACustomerDAO;
import expeditors.backend.customer.service.CustomerService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;


@Configuration
public class CustAppConfig {

    @Bean
    @Profile("dev")
    public CustomerDAO customerDAO() {
       CustomerDAO dao = new InMemoryCustomerDAO();
       return dao;
    }

    @Bean(name = "customerDAO")
    @Profile("prod")
    public CustomerDAO jpaCustomerDAO() {
        CustomerDAO dao = new JPACustomerDAO();
        return dao;
    }

    @Bean(name = "customerService")
    public CustomerService customerService() {
        CustomerService service = new CustomerService();

        CustomerDAO dao = customerDAO();
        service.setCustomerDAO(dao);

        return service;
    }
}
