package com.example.Controller.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.Controller.model.User;
@Repository
public interface UserRepository extends JpaRepository<User, Integer>{

}
