package br.com.tiagosouzagarcia.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.tiagosouzagarcia.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{
	
}
