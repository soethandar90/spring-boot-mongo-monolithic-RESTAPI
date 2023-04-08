package sa.assignment.webshop.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import sa.assignment.webshop.domain.Product;
import sa.assignment.webshop.service.ProductService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("products")
public class ProductController {
    @Autowired
    private ProductService productService;

    @PostMapping
    public Product addProduct(@RequestBody Product product) {
        return productService.addProduct(product);
    }

    @PutMapping("/{productNumber}")
    public Product updateProduct(@PathVariable String productNumber, @RequestBody Product product) {
        return productService.updateProduct(productNumber, product);
    }

    @GetMapping("/{productNumber}")
    public Optional<Product> getProduct(@PathVariable String productNumber) {
        return productService.getProduct(productNumber);
    }

    @GetMapping
    public List<Product> getProductList() {
        return productService.getProductList();
    }

    @DeleteMapping("/{productNumber}")
    public void deleteProduct(@PathVariable String productNumber) {
        productService.deleteProduct(productNumber);
    }
}
