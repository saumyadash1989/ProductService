package com.example.dbms.services;
import com.example.dbms.models.CategoryCode;
import com.example.dbms.models.LccCode;
import com.example.dbms.repositories.CategoryCodeRepository;
import com.example.dbms.repositories.LccRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service("pruductServiceImpl")
public class ProductServiceImpl implements ProductService {

     LccRepository lccRepository;
     CategoryCodeRepository categoryCodeRepository;

    public ProductServiceImpl(LccRepository lccRepository,CategoryCodeRepository categoryCodeRepository) {
        this.lccRepository = lccRepository;
        this.categoryCodeRepository = categoryCodeRepository;
    }




    @Override
    public LccCode createProduct(String name) {
        LccCode lccCode = new LccCode();
        lccCode.setName(name);
        CategoryCode categoryCode = new CategoryCode();
        List<CategoryCode> categoryCodeList = new ArrayList<>();
        categoryCode.setName("categorycode");
        categoryCodeList.add(categoryCode);
        lccCode.setCategoryCode(categoryCodeList);
        categoryCodeRepository.save(categoryCode);
       return  lccRepository.save(lccCode);

    }
}
