package sa.assignment.webshop.service;

import sa.assignment.webshop.domain.Order;

import java.util.List;
import java.util.Optional;

public interface OrderService {
    Order addOrder(Order order);
    Order updateOrder(String orderNumber, Order order);
    Optional<Order> getOrder(String orderNumber);
    List<Order> getOrderList();
    void deleteOrder(String orderNumber);
}
