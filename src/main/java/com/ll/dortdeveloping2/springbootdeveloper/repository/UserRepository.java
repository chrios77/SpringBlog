package com.ll.dortdeveloping2.springbootdeveloper.repository;

import com.ll.dortdeveloping2.springbootdeveloper.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User , Long> {
    Optional<User> findByEmail(String email);
}
