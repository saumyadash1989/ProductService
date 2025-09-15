package com.example.dbms.models;


import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter

public class LccCode  extends BaseModel{
    private String name;
    @ManyToMany
    @JoinTable(
            name = "lcc_code_category_code",
            joinColumns = @JoinColumn(name = "categorycode_id"),
            inverseJoinColumns = @JoinColumn(name = "id"))
   private List<CategoryCode> categoryCode;
}
