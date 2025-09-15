package com.example.dbms.services;
import com.example.dbms.models.LccCode;
import org.springframework.stereotype.Service;

@Service
public interface ProductService {

    LccCode createProduct(String name);
}
