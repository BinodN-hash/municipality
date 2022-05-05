package com.example.municipalityrestapi.repository;

import com.example.municipalityrestapi.model.Ward;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WardRepository extends JpaRepository<Ward, Long> {

}
