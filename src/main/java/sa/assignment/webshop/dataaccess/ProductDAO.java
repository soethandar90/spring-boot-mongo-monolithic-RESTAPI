package sa.assignment.webshop.dataaccess;

import org.springframework.data.mongodb.repository.MongoRepository;
import sa.assignment.webshop.domain.Product;

public interface ProductDAO extends MongoRepository<Product,String> {
}
