package com.example.demo.dto;

import com.example.demo.model.Country;
import com.example.demo.model.Product;
import lombok.Data;

import java.util.List;

@Data
public class VendorDto {
    private String name;
    private Country country;
    private List<Product> products;

}
