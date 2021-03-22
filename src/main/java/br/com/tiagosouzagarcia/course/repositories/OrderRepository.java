package br.com.tiagosouzagarcia.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.tiagosouzagarcia.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{
	
}
