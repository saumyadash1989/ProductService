package com.example.dbms.repositories;

import com.example.dbms.models.LccCode;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LccRepository extends JpaRepository<LccCode, Long> {
}
