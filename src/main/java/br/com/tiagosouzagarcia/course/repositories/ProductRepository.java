package br.com.tiagosouzagarcia.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.tiagosouzagarcia.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{
	
}
