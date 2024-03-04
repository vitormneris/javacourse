package com.anotherglance.store.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.anotherglance.store.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
	
}
