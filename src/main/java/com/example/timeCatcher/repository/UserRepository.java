package com.example.timeCatcher.repository;

import com.example.timeCatcher.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
