package sa.assignment.webshop.contract;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.DocumentReference;
import sa.assignment.webshop.domain.*;

import java.time.LocalDate;
import java.util.List;

@Data
public class OrderDto {
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
