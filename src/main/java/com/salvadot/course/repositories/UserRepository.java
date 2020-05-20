package com.salvadot.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.salvadot.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
