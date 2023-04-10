package sa.assignment.webshop.domain;

import lombok.*;

import java.io.Serializable;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
public class Stock implements Serializable {
    private int numberInStock;
    private String locationCode;
}
