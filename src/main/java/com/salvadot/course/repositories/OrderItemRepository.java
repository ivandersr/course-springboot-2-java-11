package com.salvadot.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.salvadot.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
