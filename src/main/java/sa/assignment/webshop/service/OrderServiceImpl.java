package sa.assignment.webshop.service;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sa.assignment.webshop.contract.OrderDto;
import sa.assignment.webshop.dataaccess.OrderCollection;
import sa.assignment.webshop.domain.Order;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Optional;

@Service
public class OrderServiceImpl implements OrderService {
    @Autowired
    private OrderCollection orderCollection;

    @Autowired
    private ModelMapper modelMapper;

    @Override
    public OrderDto addOrder(Order order) {
        return modelMapper.map(orderCollection.save(order), OrderDto.class);
    }

    @Override
    public OrderDto updateOrder(String orderNumber, Order order) {
        Order existingOrder = modelMapper.map(getOrder(orderNumber).get(), Order.class);
        if (existingOrder.getDate() != order.getDate()) {
            existingOrder.setDate(order.getDate());
        }
        if (existingOrder.getStatus() != order.getStatus()) {
            existingOrder.setStatus(order.getStatus());
        }
        if (existingOrder.getOrderLineList().equals(order.getOrderLineList())) {
            existingOrder.setOrderLineList(order.getOrderLineList());
        }
        if (existingOrder.getOrderLineList().equals(order.getOrderLineList())) {
            existingOrder.setOrderLineList(order.getOrderLineList());
        }
        if (existingOrder.getShippingAddress().equals(order.getShippingAddress())) {
            existingOrder.setShippingAddress(order.getShippingAddress());
        }
        if (existingOrder.getBillingAddress().equals(order.getBillingAddress())) {
            existingOrder.setBillingAddress(order.getBillingAddress());
        }
        if (existingOrder.getCreditCard().equals(order.getCreditCard())) {
            existingOrder.setCreditCard(order.getCreditCard());
        }
        if (existingOrder.getShippingOption().equals(order.getShippingOption())) {
            existingOrder.setShippingOption(order.getShippingOption());
        }
        if (existingOrder.getCustomer().equals(order.getCustomer())) {
            existingOrder.setCustomer(order.getCustomer());
        }
        return modelMapper.map(orderCollection.save(existingOrder), OrderDto.class);
    }

    @Override
    public Optional<OrderDto> getOrder(String orderNumber) {
        return Optional.ofNullable(modelMapper.map(orderCollection.findById(orderNumber), OrderDto.class));
    }

    @Override
    public List<OrderDto> getOrderList() {
        List<Order> orderList = orderCollection.findAll();
        List<OrderDto> orderDtoList = new ArrayList<>();
        if (orderDtoList.size() > 0) {
            ListIterator<Order> itr = orderList.listIterator();
            while (itr.hasNext()) {
                orderDtoList.add(modelMapper.map(itr.next(), OrderDto.class));
            }
        }
        return orderDtoList;
    }

    @Override
    public void deleteOrder(String orderNumber) {
        orderCollection.deleteById(orderNumber);
    }
}
