package sa.assignment.webshop.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sa.assignment.webshop.dataaccess.ProductCollection;
import sa.assignment.webshop.domain.Product;

import java.util.List;
import java.util.Optional;
@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    private ProductCollection productCollection;

    @Override
    public Product addProduct(Product product) {
        return productCollection.save(product);
    }

    @Override
    public Product updateProduct(String productNumber, Product product) {
        return productCollection.save(product);
    }

    @Override
    public Optional<Product> getProduct(String productNumber) {
        return productCollection.findById(productNumber);
    }

    @Override
    public List<Product> getProductList() {
        return productCollection.findAll();
    }

    @Override
    public void deleteProduct(String productNumber) {
        productCollection.deleteById(productNumber);
    }
}
