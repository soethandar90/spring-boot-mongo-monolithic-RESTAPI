package sa.assignment.webshop.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import sa.assignment.webshop.domain.ShoppingCart;
import sa.assignment.webshop.service.ShoppingCartService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/shoppingcarts")
public class ShoppingCartController {
    @Autowired
    private ShoppingCartService shoppingCartService;

    @PostMapping
    public ShoppingCart addShoppingCart(@RequestBody ShoppingCart shoppingCart) {
        return shoppingCartService.addShoppingCart(shoppingCart);
    }

    @PutMapping
    public ShoppingCart updateShoppingCart(@PathVariable String shoppingCartNumber, @RequestBody ShoppingCart shoppingCart) {
        return shoppingCartService.updateShoppingCart(shoppingCartNumber, shoppingCart);
    }

    @GetMapping("/{shoppingCartNumber}")
    public Optional<ShoppingCart> getShoppingCart(@PathVariable String shoppingCartNumber) {
        return shoppingCartService.getShoppingCart(shoppingCartNumber);
    }

    @GetMapping
    public List<ShoppingCart> getShoppingCartList() {
        return shoppingCartService.getShoppingCartList();
    }

    @DeleteMapping("/{shoppingCartNumber}")
    public void deleteShoppingCart(@PathVariable String shoppingCartNumber) {
        shoppingCartService.deleteShoppingCart(shoppingCartNumber);
    }
}
