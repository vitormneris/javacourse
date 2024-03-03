package com.anotherglance.store.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.anotherglance.store.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
}
