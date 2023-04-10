package sa.assignment.webshop.service;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sa.assignment.webshop.contract.ProductDto;
import sa.assignment.webshop.dataaccess.ProductCollection;
import sa.assignment.webshop.domain.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Optional;

@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    private ProductCollection productCollection;

    @Autowired
    private ModelMapper modelMapper;

    @Override
    public ProductDto addProduct(Product product) {
            return modelMapper.map(productCollection.save(product), ProductDto.class);
        }

    @Override
    public ProductDto updateProduct(String productNumber, Product product) {
        Product existingProduct = modelMapper.map(getProduct(productNumber).get(), Product.class);
        if (existingProduct.getName() != product.getName()) {
            existingProduct.setName(product.getName());
        }
        if (existingProduct.getPrice() != product.getPrice()) {
            existingProduct.setPrice(product.getPrice());
        }
        if (!existingProduct.getStock().equals(product.getStock())) {
            existingProduct.setStock(product.getStock());
        }

        //Review will be separated later.
        if (!existingProduct.getReviewList().equals(product.getReviewList())) {
            existingProduct.setReviewList(product.getReviewList());
        }

        return modelMapper.map(productCollection.save(existingProduct), ProductDto.class);
    }

    @Override
    public Optional<ProductDto> getProduct(String productNumber) {
        return Optional.ofNullable(modelMapper.map(productCollection.findById(productNumber), ProductDto.class));
    }

    @Override
    public List<ProductDto> getProductList() {
        List<ProductDto> productDtoList = new ArrayList<>();
        List<Product> productList= productCollection.findAll();
        if(productList.size()>0){
            ListIterator<Product> itr = productList.listIterator();
            while(itr.hasNext()){
                productDtoList.add(modelMapper.map(itr.next(), ProductDto.class));
            }
        }
        return productDtoList;
    }

    @Override
    public void deleteProduct(String productNumber) {
        productCollection.deleteById(productNumber);
    }
}
