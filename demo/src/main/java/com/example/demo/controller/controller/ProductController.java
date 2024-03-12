package com.example.demo.controller.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.controller.Service.ProductService;
import com.example.demo.controller.controller.dto.FakeStoreProductDto;


@RestController
public class ProductController{

    ProductService ps;
    ProductController(ProductService ps){
        this.ps = ps;
    }

    @GetMapping("/carts/")
    public FakeStoreProductDto[] getAllProducts(){
        return ps.getAllProducts();

    }

    @GetMapping("/carts/{id}/")
    public FakeStoreProductDto getProductbyId(@PathVariable Long id){
        return ps.getProductbyId(id);

    }
}



