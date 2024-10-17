package com.example.demo.dto;

import com.example.demo.model.Order;
import com.example.demo.model.Product;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

@Data
public class OrderItemDto {
    private int quantity;
    private double price;
    private long orderId;
    private long productId;
}
