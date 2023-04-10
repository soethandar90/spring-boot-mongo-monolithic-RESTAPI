package sa.assignment.webshop.domain;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.DocumentReference;

import java.util.List;
@Document("shoppingcart")
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@EqualsAndHashCode
public class ShoppingCart {
    @Id
    private String shoppingCartNumber;
    private List<CartLine> cartLineList;
}
