package com.example.brief15.repository;

import com.example.brief15.entity.Loaning;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LoaningRepository extends JpaRepository<Loaning, Long> {
}
