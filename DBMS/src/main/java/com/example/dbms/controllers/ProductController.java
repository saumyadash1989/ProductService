package com.example.dbms.controllers;
import com.example.dbms.models.LccCode;
import com.example.dbms.repositories.LccRepository;
import com.example.dbms.services.ProductService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;
@RestController
@RequestMapping("/lcccode")
public class ProductController {
    private final LccRepository lccRepository;
    private ProductService productService;
    public ProductController(@Qualifier("pruductServiceImpl") ProductService productService, LccRepository lccRepository) {
        this.productService = productService;
        this.lccRepository = lccRepository;
    }




    @PostMapping("/")
    public LccCode createProduct(@RequestBody LccCode createProductRequestDto) {
        LccCode product=productService.createProduct(createProductRequestDto.getName());

       LccCode lccCode=  productService.createProduct(createProductRequestDto.getName());

  return lccCode;
    }

}
