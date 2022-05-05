package com.example.municipalityrestapi;

import com.example.municipalityrestapi.model.District;
import com.example.municipalityrestapi.model.Municipality;
import com.example.municipalityrestapi.repository.DistrictRepository;
import com.example.municipalityrestapi.repository.MunicipalityRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertNotNull;
@SpringBootTest
class MunicipalityRestApiApplicationTests {


    @Autowired
    DistrictRepository districtRepository;
    @Autowired
    MunicipalityRepository municipalityRepository;


    @Test
    void createDistrict() {
        District district = new District();
        district.setDistrictCode("bkt");
        district.setDistrictName("bhaktapur");
        districtRepository.save(district);

    }

    @Test
    void findAllDistrict() {
        List list = districtRepository.findAll();
        assertThat(list).size().isGreaterThan(2);

    }
}
/*
//
//    @Test
//    void CreateMunicipality(){
//        Municipality municipality = new Municipality();
//        municipality.setDistrictCode("bkt");
//        municipality.setMunicipalityCode("BM");
//        municipality.setMunicipalityName("Bhaktapur Municipality");
//        municipalityRepository.save(municipality);
//    }
//
//    @Test
//    void getDistrictById()
//    {
//        District district = districtRepository.findById(1L).get();
//
//    }
}
*/
