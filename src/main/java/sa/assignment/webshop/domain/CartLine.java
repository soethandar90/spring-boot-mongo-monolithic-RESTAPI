package sa.assignment.webshop.domain;

import lombok.*;
import org.springframework.data.mongodb.core.mapping.DocumentReference;
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
public class CartLine {
    @DocumentReference
    private Product product;
    private int quantity;
}
