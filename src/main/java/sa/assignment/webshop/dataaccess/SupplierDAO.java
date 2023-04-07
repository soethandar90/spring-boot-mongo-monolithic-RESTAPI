package sa.assignment.webshop.dataaccess;

import org.springframework.data.mongodb.repository.MongoRepository;
import sa.assignment.webshop.domain.Supplier;

public interface SupplierDAO extends MongoRepository<Supplier, String> {
}
