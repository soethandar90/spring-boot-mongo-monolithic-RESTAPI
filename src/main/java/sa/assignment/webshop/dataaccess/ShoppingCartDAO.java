package sa.assignment.webshop.dataaccess;

import org.springframework.data.mongodb.repository.MongoRepository;
import sa.assignment.webshop.domain.ShoppingCart;

public interface ShoppingCartDAO extends MongoRepository<ShoppingCart, String> {
}
