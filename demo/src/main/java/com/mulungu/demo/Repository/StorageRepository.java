package com.mulungu.demo.Repository;

import com.mulungu.demo.entity.DocumentData;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface StorageRepository extends JpaRepository<DocumentData,Long> {



    Optional<DocumentData> findByName(String fileName);
}
