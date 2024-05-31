package expeditors.backend.customer.dao;


import expeditors.backend.customer.domain.Customer;

import java.util.List;

public interface CustomerDAO {
    Customer insert(Customer c);

    boolean delete(int id);

    boolean update(Customer c);

    Customer find(int id);

    List<Customer> findAll();

    default List<Customer> findByExample(Customer example) {
        throw new UnsupportedOperationException("Needs Implementing");
    }
}
