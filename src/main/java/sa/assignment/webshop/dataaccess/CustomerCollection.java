package sa.assignment.webshop.dataaccess;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import sa.assignment.webshop.domain.Customer;
@Repository
public interface CustomerCollection extends MongoRepository<Customer, String> {
}
