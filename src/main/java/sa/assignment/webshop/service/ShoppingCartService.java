package sa.assignment.webshop.service;

import sa.assignment.webshop.contract.ShoppingCartDto;
import sa.assignment.webshop.domain.ShoppingCart;

import java.util.List;
import java.util.Optional;

public interface ShoppingCartService {
    ShoppingCartDto addShoppingCart(ShoppingCart shoppingCart);
    ShoppingCartDto updateShoppingCart(String shoppingCartNumber, ShoppingCart shoppingCart);
    Optional<ShoppingCartDto> getShoppingCart(String shoppingCartNumber);
    List<ShoppingCartDto> getShoppingCartList();
    void deleteShoppingCart(String shoppingCartNumber);
}
