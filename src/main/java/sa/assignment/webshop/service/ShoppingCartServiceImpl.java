package sa.assignment.webshop.service;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sa.assignment.webshop.contract.ShoppingCartDto;
import sa.assignment.webshop.dataaccess.ShoppingCartCollection;
import sa.assignment.webshop.domain.ShoppingCart;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Optional;

@Service
public class ShoppingCartServiceImpl implements ShoppingCartService {
    @Autowired
    private ShoppingCartCollection shoppingCartCollection;

    @Autowired
    private ModelMapper modelMapper;

    @Override
    public ShoppingCartDto addShoppingCart(ShoppingCart shoppingCart) {
        return modelMapper.map(shoppingCartCollection.save(shoppingCart), ShoppingCartDto.class);
    }

    @Override
    public ShoppingCartDto updateShoppingCart(String shoppingCartNumber, ShoppingCart shoppingCart) {
        ShoppingCart existingShoppingCart = modelMapper.map(getShoppingCart(shoppingCartNumber).get(), ShoppingCart.class);
        if (!existingShoppingCart.getCartLineList().equals(shoppingCart.getCartLineList())) {
            existingShoppingCart.setCartLineList(shoppingCart.getCartLineList());
        }
        return modelMapper.map(shoppingCartCollection.save(existingShoppingCart), ShoppingCartDto.class);
    }

    @Override
    public Optional<ShoppingCartDto> getShoppingCart(String shoppingCartNumber) {
        return Optional.ofNullable(modelMapper.map(shoppingCartCollection.findById(shoppingCartNumber), ShoppingCartDto.class));
    }

    @Override
    public List<ShoppingCartDto> getShoppingCartList() {
        List<ShoppingCartDto> shoppingCartDtoList = new ArrayList<>();
        List<ShoppingCart> shoppingCartList = shoppingCartCollection.findAll();
        if (shoppingCartList.size() > 0) {
            ListIterator<ShoppingCart> itr = shoppingCartList.listIterator();
            while (itr.hasNext()) {
                shoppingCartDtoList.add(modelMapper.map(itr.next(), ShoppingCartDto.class));
            }
        }
        return shoppingCartDtoList;
    }

    @Override
    public void deleteShoppingCart(String shoppingCartNumber) {
        shoppingCartCollection.deleteById(shoppingCartNumber);
    }
}
