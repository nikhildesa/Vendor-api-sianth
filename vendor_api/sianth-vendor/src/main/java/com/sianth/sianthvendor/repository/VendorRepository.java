package com.sianth.sianthvendor.repository;

import com.sianth.sianthvendor.entity.vendor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VendorRepository extends JpaRepository<vendor,Integer> {


    vendor findByName(String name);
}
