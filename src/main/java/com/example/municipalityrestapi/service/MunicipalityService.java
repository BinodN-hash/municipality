package com.example.municipalityrestapi.service;

import com.example.municipalityrestapi.model.District;
import com.example.municipalityrestapi.model.Municipality;
import com.example.municipalityrestapi.model.Province;
import com.example.municipalityrestapi.model.Ward;

public interface MunicipalityService {
    Province saveProvince(Province province);
    District saveDistrict(District district);
    Municipality saveMunicipality(Municipality municipality);
    Ward saveWard(Ward ward);


}
