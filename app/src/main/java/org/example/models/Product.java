package org.example.models;

import java.util.Map;

import java.time.LocalDateTime;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
public class Product extends BaseEntity{
    public String _id;
    public String name;
    public Map<String, Object> attributes;
    public BigDecimal price;
    public String category;
    public String subCategory;
    public int quantity;
    public String status;
}