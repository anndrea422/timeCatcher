package com.example.timeCatcher.repository;

import com.example.timeCatcher.model.FinishedWork;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FinishedWorkRepository extends JpaRepository<FinishedWork, Long> {

}
