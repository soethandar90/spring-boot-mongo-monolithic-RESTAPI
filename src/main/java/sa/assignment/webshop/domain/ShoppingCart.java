package sa.assignment.webshop.domain;

import org.springframework.data.annotation.Id;

import java.util.List;

public class ShoppingCart {
    private String shoppingCartNumber;
    private List<CartLine> cartLineList;
}
