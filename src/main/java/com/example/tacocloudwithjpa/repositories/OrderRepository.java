package com.example.tacocloudwithjpa.repositories;

import com.example.tacocloudwithjpa.data.TacoOrder;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends CrudRepository<TacoOrder, Long> {
}
