package sa.assignment.webshop.contract;

import lombok.Data;
import sa.assignment.webshop.domain.CartLine;

import java.util.List;

@Data
public class ShoppingCartDto {
    private String shoppingCartNumber;
    private List<CartLine> cartLineList;

}
