package com.sianth.sianthvendor.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "vendors")
public class vendor {

    @Id
    @GeneratedValue
    private int id;
    private String name;
    private String secret_key;
    private String streetaddress1;
    private String streetaddress2;
    private String city;
    private String state;
    private String country;
    private String contactPerson;
    private String landingZoneLoc;
    private String rawzoneLoc;
    private String activeStatus;

}
