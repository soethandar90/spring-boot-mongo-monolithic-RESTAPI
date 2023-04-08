package sa.assignment.webshop.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import sa.assignment.webshop.domain.Order;
import sa.assignment.webshop.service.OrderService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/orders")
public class OrderController {
    @Autowired
    private OrderService orderService;

    @PostMapping
    public Order addOrder(@RequestBody Order order) {
        return orderService.addOrder(order);
    }

    @PutMapping
    public Order updateOrder(@PathVariable String orderNumber, @RequestBody Order order) {
        return orderService.updateOrder(orderNumber, order);
    }

    @GetMapping("/{orderNumber}")
    public Optional<Order> getOrder(@PathVariable String orderNumber) {
        return orderService.getOrder(orderNumber);
    }

    @GetMapping
    public List<Order> getOrderList() {
        return orderService.getOrderList();
    }

    @DeleteMapping("/{orderNumber}")
    public void deleteOrder(@PathVariable String orderNumber) {
        orderService.deleteOrder(orderNumber);
    }
}
