package com.example.municipalityrestapi.repository;

import com.example.municipalityrestapi.model.District;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DistrictRepository extends JpaRepository<District, Long> {

    District findByDistrictCode(String districtCode);

}
