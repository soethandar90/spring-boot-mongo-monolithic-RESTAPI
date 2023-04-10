package sa.assignment.webshop.service;

import sa.assignment.webshop.contract.ProductDto;
import sa.assignment.webshop.domain.Product;

import java.util.List;
import java.util.Optional;

public interface ProductService {
    ProductDto addProduct(Product product);
    ProductDto updateProduct(String productNumber, Product product);
    Optional<ProductDto> getProduct(String productNumber);
    List<ProductDto> getProductList();
    void deleteProduct(String productNumber);
}
