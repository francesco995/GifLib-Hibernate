package com.teamtreehouse.giflib.service;

import com.teamtreehouse.giflib.model.Category;

import java.util.List;

public interface CategoryService {
    List<Category> findAll();
    Category findById();
    void save(Category category);
    void delete(Category category);
}