package sa.assignment.webshop.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sa.assignment.webshop.dataaccess.ShoppingCartCollection;
import sa.assignment.webshop.domain.ShoppingCart;

import java.util.List;
import java.util.Optional;

@Service
public class ShoppingCartServiceImpl implements ShoppingCartService {
    @Autowired
    private ShoppingCartCollection shoppingCartCollection;

    @Override
    public ShoppingCart addShoppingCart(ShoppingCart shoppingCart) {
        return shoppingCartCollection.save(shoppingCart);
    }

    @Override
    public ShoppingCart updateShoppingCart(String shoppingCartNumber, ShoppingCart shoppingCart) {
        return shoppingCartCollection.save(shoppingCart);
    }

    @Override
    public Optional<ShoppingCart> getShoppingCart(String shoppingCartNumber) {
        return shoppingCartCollection.findById(shoppingCartNumber);
    }

    @Override
    public List<ShoppingCart> getShoppingCartList() {
        return shoppingCartCollection.findAll();
    }

    @Override
    public void deleteShoppingCart(String shoppingCartNumber) {
        shoppingCartCollection.deleteById(shoppingCartNumber);
    }
}
