package com.chineseivy.bean;

public class Categories {
    private Integer categoriesid;
    private String categoriesname;
    public Integer getCategoriesid() {
        return categoriesid;
    }

    public void setCategoriesid(Integer categoriesid) {
        this.categoriesid = categoriesid;
    }

    public String getCategoriesname() {
        return categoriesname;
    }

    public void setCategoriesname(String categoriesname) {
        this.categoriesname = categoriesname == null ? null : categoriesname.trim();
    }
}