package com.avsoft.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.avsoft.demo.entity.Orders;

public interface OrderRepository extends JpaRepository<Orders, Integer> {
}
