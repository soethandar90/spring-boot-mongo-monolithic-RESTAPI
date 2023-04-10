package sa.assignment.webshop.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import sa.assignment.webshop.contract.OrderDto;
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
    public OrderDto addOrder(@RequestBody Order order) {
        return orderService.addOrder(order);
    }

    @PutMapping("/{orderNumber}")
    public OrderDto updateOrder(@PathVariable String orderNumber, @RequestBody Order order) {
        return orderService.updateOrder(orderNumber, order);
    }

    @GetMapping("/{orderNumber}")
    public Optional<OrderDto> getOrder(@PathVariable String orderNumber) {
        return orderService.getOrder(orderNumber);
    }

    @GetMapping
    public List<OrderDto> getOrderList() {
        return orderService.getOrderList();
    }

    @DeleteMapping("/{orderNumber}")
    public void deleteOrder(@PathVariable String orderNumber) {
        orderService.deleteOrder(orderNumber);
    }
}
