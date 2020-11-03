package br.com.luanrocha.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.luanrocha.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
