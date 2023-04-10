package sa.assignment.webshop.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import sa.assignment.webshop.contract.ProductDto;
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
    public ResponseEntity<ProductDto> addProduct(@RequestBody Product product) {
        return new ResponseEntity<ProductDto>(productService.addProduct(product), HttpStatus.CREATED);
    }

    @PutMapping("/{productNumber}")
    public ResponseEntity<ProductDto> updateProduct(@PathVariable String productNumber, @RequestBody Product product) {
        return new ResponseEntity<>(productService.updateProduct(productNumber, product), HttpStatus.OK);
    }

    @GetMapping("/{productNumber}")
    public ResponseEntity<Optional<ProductDto>> getProduct(@PathVariable String productNumber) {
        return new ResponseEntity<>(productService.getProduct(productNumber), HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<List<ProductDto>> getProductList() {
        return new ResponseEntity<>(productService.getProductList(), HttpStatus.OK);
    }

    @DeleteMapping("/{productNumber}")
    public ResponseEntity deleteProduct(@PathVariable String productNumber) {
        productService.deleteProduct(productNumber);
        return new ResponseEntity(HttpStatus.NO_CONTENT);
    }
}
