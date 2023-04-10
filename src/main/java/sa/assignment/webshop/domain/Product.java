package sa.assignment.webshop.domain;

import lombok.*;
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
@EqualsAndHashCode(exclude = {"productNumber", "stock", "reviewList"})
public class Product implements Serializable {
    @Id
    private String productNumber;
    private String name;
    private double price;
    private Stock stock;
    private Supplier supplier;
    private List<Review> reviewList;
}
