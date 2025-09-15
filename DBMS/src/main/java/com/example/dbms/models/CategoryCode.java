package com.example.dbms.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter

public class CategoryCode extends BaseModel{
    private String name;
    @ManyToMany(mappedBy = "categoryCode")
    private List<LccCode> lccCodes;
}
