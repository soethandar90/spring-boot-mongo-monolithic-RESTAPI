package sa.assignment.webshop.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import sa.assignment.webshop.domain.Customer;
import sa.assignment.webshop.service.CustomerService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/customers")
public class CustomerController {
    @Autowired
    private CustomerService customerService;

    @PostMapping
    public Customer addCustomer(@RequestBody Customer customer) {
        return customerService.addCustomer(customer);
    }

    @PutMapping
    public Customer updateCustomer(@PathVariable String customerNumber, @RequestBody Customer customer) {
        return customerService.updateCustomer(customerNumber, customer);
    }

    @GetMapping("/{customerNumber}")
    public Optional<Customer> getCustomer(@PathVariable String customerNumber) {
        return customerService.getCustomer(customerNumber);
    }

    @GetMapping
    public List<Customer> getCustomerList() {
        return customerService.getCustomerList();
    }

    @DeleteMapping("/{customerNumber}")
    public void deleteCustomer(@PathVariable String customerNumber) {
        customerService.deleteCustomer(customerNumber);
    }
}
