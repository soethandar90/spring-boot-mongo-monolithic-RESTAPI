package sa.assignment.webshop.domain;

import lombok.*;
import org.springframework.data.annotation.Id;

import java.io.Serializable;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
public class CreditCard implements Serializable {
    private String number;
    private String validateDate;
}
