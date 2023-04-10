package sa.assignment.webshop.domain;

import lombok.*;
import org.springframework.data.mongodb.core.mapping.DocumentReference;
import org.springframework.data.mongodb.core.mapping.Field;

import java.io.Serializable;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@EqualsAndHashCode
public class OrderLine implements Serializable {
    @DocumentReference
    private Product product;
    private int quantity;
}
