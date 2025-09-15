package com.example.dbms.repositories;

import com.example.dbms.models.CategoryCode;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryCodeRepository extends JpaRepository<CategoryCode, Long> {
}
