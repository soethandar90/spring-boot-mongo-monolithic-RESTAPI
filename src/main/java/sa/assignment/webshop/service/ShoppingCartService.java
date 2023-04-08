package sa.assignment.webshop.service;

import sa.assignment.webshop.domain.ShoppingCart;

import java.util.List;
import java.util.Optional;

public interface ShoppingCartService {
    ShoppingCart addShoppingCart(ShoppingCart shoppingCart);
    ShoppingCart updateShoppingCart(String shoppingCartNumber, ShoppingCart shoppingCart);
    Optional<ShoppingCart> getShoppingCart(String shoppingCartNumber);
    List<ShoppingCart> getShoppingCartList();
    void deleteShoppingCart(String shoppingCartNumber);
}
