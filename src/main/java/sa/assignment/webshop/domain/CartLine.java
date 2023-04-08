package sa.assignment.webshop.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.DocumentReference;
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class CartLine {
@DocumentReference
    private Product product;
    private int quantity;
}
