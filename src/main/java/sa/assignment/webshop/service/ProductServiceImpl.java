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
        Product existingProduct = getProduct(productNumber).get();
        if (existingProduct!=null) {
            return null;
        }

        if(existingProduct.getDescription()!=product.getDescription()){
            existingProduct.setDescription(product.getDescription());
        }

        if(existingProduct.getPrice()!=product.getPrice()){
            existingProduct.setPrice(product.getPrice());
        }

        if(existingProduct.getStock()!=product.getStock()){
            existingProduct.setPrice(product.getPrice());
        }

        if(existingProduct.getSupplier()!=product.getSupplier()){
            existingProduct.setSupplier(product.getSupplier());
        }

        return productCollection.save(existingProduct);
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
