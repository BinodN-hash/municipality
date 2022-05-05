package com.example.municipalityrestapi.service;

import com.example.municipalityrestapi.model.District;
import com.example.municipalityrestapi.model.Municipality;
import com.example.municipalityrestapi.model.Ward;

public interface MunicipalityService {
    District saveDistrict(District district);
    Municipality saveMunicipality(Municipality municipality);
    Ward saveWard(Ward ward);
}
