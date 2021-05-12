package com.sianth.sianthvendor.controller;

import com.sianth.sianthvendor.entity.vendor;
import com.sianth.sianthvendor.service.vendorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class vendorController {

    @Autowired
    private vendorService service;

    @PostMapping("/addVendor")
    public vendor addVendor(@RequestBody vendor vendor){
        return service.saveVendor(vendor);

    }

    @PostMapping("/addVendors")
    public List<vendor> addVendors(@RequestBody List<vendor> vendors){
        return service.saveVendors(vendors);

    }
    @GetMapping("/vendor")
    public List<vendor> findAllVendors(){
        return service.getVendors();

    }

    @GetMapping("/vendor/{id}")
    public vendor findVendorById(@PathVariable int id){

        return service.getVendorById(id);
    }

    @GetMapping("/vendor/{name}")
    public vendor findVendorByName(@PathVariable String name){

        return service.getVendorByName(name);
    }

    @PutMapping("/update")
    public vendor updateVendor(@RequestBody vendor vendor){
        return service.updateVendor(vendor);

    }

    @DeleteMapping("/delete{id}")
    public String deleteVendor(@PathVariable int id){

        return service.deleteVendor(id);
    }




}
