package com.example.tacocloudwithjpa;

import data.TacoOrder;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends CrudRepository<TacoOrder, Long> {
}
