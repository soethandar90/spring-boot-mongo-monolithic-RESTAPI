package sa.assignment.webshop.dataaccess;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import sa.assignment.webshop.domain.Supplier;
@Repository
public interface SupplierCollection extends MongoRepository<Supplier, String> {
}
