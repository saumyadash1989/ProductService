package com.example.dbms.services;


import com.example.dbms.models.LccCode;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

@Service
public class FakeStoreProductService implements ProductService {








    @Override
    public LccCode createProduct(String name) {
        return null;
    }
}
