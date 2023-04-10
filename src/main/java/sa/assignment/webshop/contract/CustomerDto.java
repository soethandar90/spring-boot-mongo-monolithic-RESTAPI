package sa.assignment.webshop.contract;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.DocumentReference;
import sa.assignment.webshop.domain.Account;
import sa.assignment.webshop.domain.Address;
import sa.assignment.webshop.domain.CreditCard;
import sa.assignment.webshop.domain.Order;

import java.util.List;

@Data
public class CustomerDto {
    private String customerNumber;
    private String firstName;
    private String lastName;
    private String email;
    private String phone;

    private Account account;

    private Address address;

    private List<CreditCard> creditCardList;
    @DocumentReference
    private List<Order> orderList;
}
