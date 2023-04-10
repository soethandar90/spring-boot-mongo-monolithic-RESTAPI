package sa.assignment.webshop.service;

import sa.assignment.webshop.contract.OrderDto;
import sa.assignment.webshop.domain.Order;

import java.util.List;
import java.util.Optional;

public interface OrderService {
    OrderDto addOrder(Order order);
    OrderDto updateOrder(String orderNumber, Order order);
    Optional<OrderDto> getOrder(String orderNumber);
    List<OrderDto> getOrderList();
    void deleteOrder(String orderNumber);
}
