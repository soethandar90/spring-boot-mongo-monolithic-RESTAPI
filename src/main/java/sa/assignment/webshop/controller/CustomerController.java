package sa.assignment.webshop.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import sa.assignment.webshop.contract.CustomerDto;
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
    public CustomerDto addCustomer(@RequestBody Customer customer) {
        return customerService.addCustomer(customer);
    }

    @PutMapping("/{customerNumber}")
    public CustomerDto updateCustomer(@PathVariable String customerNumber, @RequestBody Customer customer) {
        return customerService.updateCustomer(customerNumber, customer);
    }

    @GetMapping("/{customerNumber}")
    public Optional<CustomerDto> getCustomer(@PathVariable String customerNumber) {
        return customerService.getCustomer(customerNumber);
    }

    @GetMapping
    public List<CustomerDto> getCustomerList() {
        return customerService.getCustomerList();
    }

    @DeleteMapping("/{customerNumber}")
    public void deleteCustomer(@PathVariable String customerNumber) {
        customerService.deleteCustomer(customerNumber);
    }
}
