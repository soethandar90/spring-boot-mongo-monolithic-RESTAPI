package sa.assignment.webshop.service;

import sa.assignment.webshop.domain.Customer;

import java.util.List;
import java.util.Optional;

public interface CustomerService {
    Customer addCustomer(Customer customer);
    Customer updateCustomer(String customerNumber, Customer customer);
    Optional<Customer> getCustomer(String customerNumber);
    List<Customer> getCustomerList();
    void deleteCustomer(String customerNumber);


}
