package br.com.luanrocha.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.luanrocha.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
