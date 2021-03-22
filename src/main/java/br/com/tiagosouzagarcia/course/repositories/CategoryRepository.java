package br.com.tiagosouzagarcia.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.tiagosouzagarcia.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{
	
}
