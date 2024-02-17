package com.spring.batchprocessing.repository;

import com.spring.batchprocessing.entity.Document;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DocumentRepository extends JpaRepository<Document,Integer> {
}
