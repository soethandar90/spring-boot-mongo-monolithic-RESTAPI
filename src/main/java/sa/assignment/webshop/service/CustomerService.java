package sa.assignment.webshop.service;

import sa.assignment.webshop.contract.CustomerDto;
import sa.assignment.webshop.domain.Customer;

import java.util.List;
import java.util.Optional;

public interface CustomerService {
    CustomerDto addCustomer(Customer customer);
    CustomerDto updateCustomer(String customerNumber, Customer customer);
    Optional<CustomerDto> getCustomer(String customerNumber);
    List<CustomerDto> getCustomerList();
    void deleteCustomer(String customerNumber);


}
