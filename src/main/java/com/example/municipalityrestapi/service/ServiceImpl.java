package com.example.municipalityrestapi.service;
import com.example.municipalityrestapi.model.District;
import com.example.municipalityrestapi.model.Municipality;
import com.example.municipalityrestapi.model.Province;
import com.example.municipalityrestapi.model.Ward;
import com.example.municipalityrestapi.repository.DistrictRepository;
import com.example.municipalityrestapi.repository.MunicipalityRepository;
import com.example.municipalityrestapi.repository.ProvinceRepository;
import com.example.municipalityrestapi.repository.WardRepository;
import lombok.RequiredArgsConstructor;
import  org.springframework.stereotype.Service;


@Service
@RequiredArgsConstructor
public class ServiceImpl implements MunicipalityService{

    private final DistrictRepository districtRepository;
    private final MunicipalityRepository municipalityRepository;
    private final WardRepository wardRepository;
    private final ProvinceRepository provinceRepository;

    @Override
    public Province saveProvince(Province province) {
        return provinceRepository.save(province);
    }

    @Override
    public District saveDistrict(District district){
        return districtRepository.save(district);
    }

    @Override
    public Municipality saveMunicipality(Municipality municipality) {
        return municipalityRepository.save(municipality);
    }

    @Override
    public Ward saveWard(Ward ward) {

        return wardRepository.save(ward);
    }

}
