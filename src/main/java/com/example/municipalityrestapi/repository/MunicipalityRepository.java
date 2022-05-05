package com.example.municipalityrestapi.repository;

import com.example.municipalityrestapi.model.Municipality;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MunicipalityRepository extends JpaRepository<Municipality, Long> {

   Municipality findByMunicipalityCode(String municipalityCode);


}
