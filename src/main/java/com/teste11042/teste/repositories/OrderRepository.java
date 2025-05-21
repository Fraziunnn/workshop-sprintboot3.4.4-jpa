package com.teste11042.teste.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.teste11042.teste.entites.Order;
import com.teste11042.teste.entites.User;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
