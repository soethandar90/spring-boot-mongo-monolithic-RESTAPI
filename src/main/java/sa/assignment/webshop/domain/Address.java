package sa.assignment.webshop.domain;

import lombok.*;

import java.io.Serial;
import java.io.Serializable;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Address implements Serializable {
    private String street;
    private String city;
    private String zip;
    private String country;
}
