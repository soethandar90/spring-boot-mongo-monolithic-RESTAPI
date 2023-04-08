package sa.assignment.webshop.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sa.assignment.webshop.dataaccess.CustomerCollection;
import sa.assignment.webshop.domain.Customer;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerServiceImpl implements CustomerService {
    @Autowired
    private CustomerCollection customerCollection;

    @Override
    public Customer addCustomer(Customer customer) {
        return customerCollection.save(customer);
    }

    @Override
    public Customer updateCustomer(String customerNumber, Customer customer) {
        return customerCollection.save(customer);
    }

    @Override
    public Optional<Customer> getCustomer(String customerNumber) {
        return customerCollection.findById(customerNumber);
    }

    @Override
    public List<Customer> getCustomerList() {
        return customerCollection.findAll();
    }

    @Override
    public void deleteCustomer(String customerNumber) {
        customerCollection.deleteById(customerNumber);
    }
}
