package com.example.municipalityrestapi.controller;

import com.example.municipalityrestapi.model.District;
import com.example.municipalityrestapi.model.Municipality;
import com.example.municipalityrestapi.model.Ward;
import com.example.municipalityrestapi.repository.DistrictRepository;
import com.example.municipalityrestapi.repository.MunicipalityRepository;
import com.example.municipalityrestapi.service.MunicipalityService;
import lombok.RequiredArgsConstructor;
import org.apache.velocity.exception.ResourceNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class MainController {

    private final MunicipalityService municipalityService;
    private final DistrictRepository districtRepository;
    private final MunicipalityRepository municipalityRepository;

    @PostMapping("/district")
    public ResponseEntity<District> saveDistrict(@RequestBody District district){
        return new ResponseEntity<>(municipalityService.saveDistrict(district), HttpStatus.OK);
    }

    @PostMapping("/municipality")
    public ResponseEntity<Municipality> saveMunicipality(@RequestBody Municipality municipality){
        District district = districtRepository.findByDistrictCode(municipality.getDistrictCode());
        municipality.setDistrict(district);
        return new ResponseEntity<>(municipalityService.saveMunicipality(municipality),HttpStatus.OK);
    }


    @PostMapping("/ward")
    public ResponseEntity<Ward> saveWard(@RequestBody Ward ward){
        Municipality municipality = municipalityRepository.findByMunicipalityCode(ward.getMunicipalityCode());
        ward.setMunicipality(municipality);
        return new ResponseEntity<>(municipalityService.saveWard(ward),HttpStatus.OK);
    }

    @GetMapping("list")
    public ResponseEntity<?> listAll(){
        List<District> districts = districtRepository.findAll();
        return new ResponseEntity<>(districts, HttpStatus.OK);
    }


    @GetMapping("district/{id}")
    public ResponseEntity<District> districtByid(@PathVariable Long id){
        District district = districtRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("No data found of district, municipality & ward with district id: " + id));
        return new ResponseEntity<>(district, HttpStatus.OK);

    }

    @GetMapping("municipality/{id}")
    public ResponseEntity<Municipality> municipalictyById(@PathVariable Long id){
        Municipality municipality = municipalityRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Municipality Not Found with id: " + id));
        return new ResponseEntity<>(municipality, HttpStatus.OK);

    }



}
