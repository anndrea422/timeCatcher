package com.example.timeCatcher;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TimeCatcherRepository extends JpaRepository<CompletedWork, Long> {


    List<CompletedWork> findAllByUserId(Integer userId);
}

