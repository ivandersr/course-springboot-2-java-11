package com.salvadot.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.salvadot.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
