package com.salvador.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.salvador.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
