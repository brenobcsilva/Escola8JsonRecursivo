package com.example.escola7.persistence.repository;

import com.example.escola7.persistence.model.Professor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProfessorRepository extends JpaRepository<Professor,Long> {
}
