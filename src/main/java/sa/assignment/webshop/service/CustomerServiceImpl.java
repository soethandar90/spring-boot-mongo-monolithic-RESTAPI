package sa.assignment.webshop.service;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sa.assignment.webshop.contract.CustomerDto;
import sa.assignment.webshop.dataaccess.CustomerCollection;
import sa.assignment.webshop.domain.Customer;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Optional;

@Service
public class CustomerServiceImpl implements CustomerService {
    @Autowired
    private CustomerCollection customerCollection;

    @Autowired
    private ModelMapper modelMapper;

    @Override
    public CustomerDto addCustomer(Customer customer) {
        return modelMapper.map(customerCollection.save(customer), CustomerDto.class);
    }

    @Override
    public CustomerDto updateCustomer(String customerNumber, Customer customer) {
        Customer existingCustomer = modelMapper.map(getCustomer(customerNumber).get(), Customer.class);
        if (existingCustomer.getFirstName() != customer.getFirstName()) {
            existingCustomer.setFirstName(customer.getFirstName());
        }
        if (existingCustomer.getLastName() != customer.getLastName()) {
            existingCustomer.setLastName(customer.getLastName());
        }
        if (existingCustomer.getEmail() != customer.getEmail()) {
            existingCustomer.setEmail(customer.getEmail());
        }
        if (existingCustomer.getPhone() != customer.getPhone()) {
            existingCustomer.setPhone(customer.getPhone());
        }
        if (existingCustomer.getAccount().equals(customer.getAccount())) {
            existingCustomer.setAccount(customer.getAccount());
        }
        if (existingCustomer.getAddress().equals(customer.getAddress())) {
            existingCustomer.setAddress(customer.getAddress());
        }
        if (existingCustomer.getCreditCardList().equals(customer.getCreditCardList())) {
            existingCustomer.setCreditCardList(customer.getCreditCardList());
        }
        return modelMapper.map(customerCollection.save(existingCustomer), CustomerDto.class);
    }

    @Override
    public Optional<CustomerDto> getCustomer(String customerNumber) {
        return Optional.ofNullable(modelMapper.map(customerCollection.findById(customerNumber), CustomerDto.class));
    }

    @Override
    public List<CustomerDto> getCustomerList() {
        List<CustomerDto> customerDtoList = new ArrayList<>();
        List<Customer> customerList = customerCollection.findAll();
        if (customerList.size() > 0) {
            ListIterator<Customer> itr = customerList.listIterator();
            while (itr.hasNext()) {
                customerDtoList.add(modelMapper.map(itr.next(), CustomerDto.class));
            }
        }
        return customerDtoList;
    }

    @Override
    public void deleteCustomer(String customerNumber) {
        customerCollection.deleteById(customerNumber);
    }
}
