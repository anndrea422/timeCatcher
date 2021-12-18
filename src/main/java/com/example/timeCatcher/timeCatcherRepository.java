package com.example.timeCatcher;

import com.example.timeCatcher.completedWork;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface timeCatcherRepository extends JpaRepository<completedWork, Long> {
}

