package com.sianth.sianthvendor.service;

import com.sianth.sianthvendor.entity.vendor;
import com.sianth.sianthvendor.repository.VendorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class vendorService {

    @Autowired
    private VendorRepository repository;

    public vendor saveVendor(vendor vendor){
        return repository.save(vendor);

    }

    public List<vendor> saveVendors(List<vendor> vendors){
        return repository.saveAll(vendors);

    }

    public List<vendor> getVendors(){
        return repository.findAll();

    }

    public vendor getVendorById(int id){
        return repository.findById(id).orElse(null);

    }

    public vendor getVendorByName(String name){
        return repository.findByName(name);

    }


    public String deleteVendor(int id){

        repository.deleteById(id);
        return "vendor removed";
    }

    public vendor updateVendor(vendor vendor){
        vendor existingVendor = repository.findById(vendor.getId()).orElse(null);
        existingVendor.setName(vendor.getName());
        existingVendor.setSecret_key(vendor.getSecret_key());
        existingVendor.setStreetaddress1(vendor.getStreetaddress1());
        existingVendor.setStreetaddress2(vendor.getStreetaddress2());
        existingVendor.setCity(vendor.getCity());
        existingVendor.setState(vendor.getState());
        existingVendor.setCountry(vendor.getCountry());
        existingVendor.setContactPerson(vendor.getContactPerson());
        existingVendor.setLandingZoneLoc(vendor.getLandingZoneLoc());
        existingVendor.setRawzoneLoc(vendor.getRawzoneLoc());
        existingVendor.setActiveStatus((vendor.getActiveStatus()));


        return repository.save(existingVendor);
    }

}
