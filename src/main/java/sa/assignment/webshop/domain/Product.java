package sa.assignment.webshop.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.validation.annotation.Validated;

import java.io.Serializable;
import java.util.List;

@Document("product")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Validated
public class Product implements Serializable {
    @Id
    private String productNumber;
    private String description;
    private double price;
    private Stock stock;
    private Supplier supplier;
    private List<Review> reviewList;
}
