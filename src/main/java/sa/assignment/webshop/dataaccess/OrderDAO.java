package sa.assignment.webshop.dataaccess;

import org.springframework.data.mongodb.repository.MongoRepository;
import sa.assignment.webshop.domain.Order;

public interface OrderDAO extends MongoRepository<Order,String> {
}
