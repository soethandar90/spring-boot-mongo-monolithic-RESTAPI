package sa.assignment.webshop.dataaccess;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import sa.assignment.webshop.domain.Order;
@Repository
public interface OrderCollection extends MongoRepository<Order,String> {
}
