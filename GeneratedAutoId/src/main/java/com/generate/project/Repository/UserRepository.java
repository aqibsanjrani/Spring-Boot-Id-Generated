package com.generate.project.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.generate.project.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

	//int getNextSequence();


}
