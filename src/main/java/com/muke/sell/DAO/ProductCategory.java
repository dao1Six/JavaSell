package com.muke.sell.DAO;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ProductCategory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer categoryId;

    private String  categoryName;
    
    private Integer categoryType;

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public Integer getCategorytype() {
        return categoryType;
    }

    public void setCategorytype(Integer categorytype) {
        this.categoryType = categorytype;
    }

    public ProductCategory(String categoryName, Integer categorytype) {
        this.categoryName = categoryName;
        this.categoryType = categorytype;
    }

    public ProductCategory() {
    }
}
