package sa.assignment.webshop.domain;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.DocumentReference;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.List;

@Document("customer")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class Customer {
    @Id
    private String customerNumber;
    private String firstName;
    private String lastName;
    private String email;
    private String phone;
    //@JsonSerialize
    private Account account;
    //@JsonSerialize
    private Address address;
    //@JsonSerialize
    private List<CreditCard> creditCardList;
    @DocumentReference
    private List<Order> orderList;
}
