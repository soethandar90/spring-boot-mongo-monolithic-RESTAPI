package sa.assignment.webshop.dataaccess;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import sa.assignment.webshop.domain.ShoppingCart;
@Repository
public interface ShoppingCartCollection extends MongoRepository<ShoppingCart, String> {
}
