package sa.assignment.webshop.dataaccess;

import org.springframework.data.mongodb.repository.MongoRepository;
import sa.assignment.webshop.domain.Customer;

public interface CustomerDAO extends MongoRepository<Customer, String> {
}
