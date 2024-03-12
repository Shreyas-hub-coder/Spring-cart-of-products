package com.example.demo.controller.controller.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class FakeStoreProductDto {

    Long id;
    String title;
    double price;
    String description;
    String category;
    String date_range;
    String image; 
}
