package com.example.demo.controller.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.controller.Service.ProductService;

@RestController
public class ArticleController {

   ProductService ps;

   ArticleController(ProductService ps){
    this.ps = ps;
   }
    
    @GetMapping("/Articles/")
    public String getAllArticles(){

        return "All Articles added to cart";
    }
    
}
