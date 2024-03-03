package com.anotherglance.store.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.anotherglance.store.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
