package sa.assignment.webshop.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sa.assignment.webshop.dataaccess.OrderCollection;
import sa.assignment.webshop.domain.Order;

import java.util.List;
import java.util.Optional;

@Service
public class OrderServiceImpl implements OrderService {
    @Autowired
    private OrderCollection orderCollection;

    @Override
    public Order addOrder(Order order) {
        return orderCollection.save(order);
    }

    @Override
    public Order updateOrder(String orderNumber, Order order) {
        return orderCollection.save(order);
    }

    @Override
    public Optional<Order> getOrder(String orderNumber) {
        return orderCollection.findById(orderNumber);
    }

    @Override
    public List<Order> getOrderList() {
        return orderCollection.findAll();
    }

    @Override
    public void deleteOrder(String orderNumber) {
        orderCollection.deleteById(orderNumber);
    }
}
