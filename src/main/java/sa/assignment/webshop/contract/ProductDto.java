package sa.assignment.webshop.contract;

import lombok.Data;
import sa.assignment.webshop.domain.Review;
import sa.assignment.webshop.domain.Stock;
import sa.assignment.webshop.domain.Supplier;

import java.util.List;

@Data
public class ProductDto {
    private String productNumber;
    private String name;
    private double price;
    private Stock stock;
    private Supplier supplier;
    private List<Review> reviewList;
}
