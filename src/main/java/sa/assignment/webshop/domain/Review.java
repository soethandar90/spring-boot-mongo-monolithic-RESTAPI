package sa.assignment.webshop.domain;

import lombok.*;
import org.springframework.data.annotation.Id;

import java.io.Serializable;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
public class Review implements Serializable {
    private String title;
    private String description;
    private double score;
}
