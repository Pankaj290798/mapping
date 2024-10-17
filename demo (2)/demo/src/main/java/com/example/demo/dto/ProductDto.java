package com.example.demo.dto;

import com.example.demo.model.OrderItem;
import com.example.demo.model.Vendor;
import lombok.Data;

import java.util.List;

@Data
public class ProductDto {
    private String name;
    private String description;
    private double price;
    private byte[] imageUrl;
    private long vendorId;
    private List<OrderItem> orderItems;
}
