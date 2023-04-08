package sa.assignment.webshop.service;

import sa.assignment.webshop.domain.Product;

import java.util.List;
import java.util.Optional;

public interface ProductService {
    Product addProduct(Product product);
    Product updateProduct(String productNumber, Product product);
    Optional<Product> getProduct(String productNumber);
    List<Product> getProductList();
    void deleteProduct(String productNumber);
}
