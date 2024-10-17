package com.example.demo.dto;

import com.example.demo.model.Vendor;
import lombok.Data;

import java.util.List;

@Data
public class CountryDto{

    private Long code;
    private String name;
    private String continent;
    private List<Vendor> vendors;

}
