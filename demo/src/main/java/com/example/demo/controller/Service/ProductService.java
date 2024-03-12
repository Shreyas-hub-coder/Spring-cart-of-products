package com.example.demo.controller.Service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.demo.controller.controller.dto.FakeStoreProductDto;

@Service
public class ProductService {


    RestTemplate restTemplate= new RestTemplate();

    String url  = "https://fakestoreapi.com/";

  


    public FakeStoreProductDto[] getAllProducts(){

        FakeStoreProductDto response[] = restTemplate.getForObject(url + "/carts/", FakeStoreProductDto[].class);

        return response;


    }

     public FakeStoreProductDto getProductbyId(Long id){

        FakeStoreProductDto response = restTemplate.getForObject(url + "/carts/" + id, FakeStoreProductDto.class);

        return response;

    }
    
}
