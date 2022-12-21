package com.example.escola7.persistence.repository;

import com.example.escola7.persistence.model.Alunos;
import com.example.escola7.persistence.model.Professor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AlunoRepository extends JpaRepository<Alunos,Long> {
}
