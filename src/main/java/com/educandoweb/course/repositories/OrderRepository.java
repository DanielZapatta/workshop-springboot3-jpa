package com.educandoweb.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.course.entities.Order;

// Já está herdando do JPA Repository que é um componente do Spring, não há necessidade de Annotations
public interface OrderRepository extends JpaRepository<Order, Long>{

}
