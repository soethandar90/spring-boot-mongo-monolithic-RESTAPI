package sa.assignment.webshop.domain;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.DocumentReference;
import org.springframework.data.mongodb.core.mapping.Field;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

@Document("order")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
public class Order implements Serializable {
    @Id
    private String orderNumber;
    private LocalDate date;
    private String status;
    private List<OrderLine> orderLineList;
    private Address billingAddress;
    private Address shippingAddress;
    private CreditCard creditCard;
    private ShippingOption shippingOption;
    @DocumentReference
    private Customer customer;

}
