package com.example.tacocloudwithjpa;

import com.example.tacocloudwithjpa.data.Taco;
import com.example.tacocloudwithjpa.data.TacoOrder;
import com.example.tacocloudwithjpa.repositories.OrderRepository;
import com.example.tacocloudwithjpa.repositories.TacoRepository;
import org.springframework.stereotype.Service;

@Service
public class OrderService {
    private final OrderRepository orderRepository;
    private final TacoRepository tacoRepository;

    public OrderService(OrderRepository orderRepository, TacoRepository tacoRepository) {
        this.orderRepository = orderRepository;
        this.tacoRepository = tacoRepository;
    }

    public <S extends TacoOrder> S save(S entity) {
        S savedOrder = orderRepository.save(entity);
        for (Taco taco : savedOrder.getTacos()) {
            taco.setTacoOrder(savedOrder);
            tacoRepository.save(taco);
        }
        return savedOrder;
    }
}
