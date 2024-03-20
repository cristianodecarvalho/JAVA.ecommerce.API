package com.cristiano.ecommerce.service.admin.category;

import com.cristiano.ecommerce.dto.CategoryDto;
import com.cristiano.ecommerce.entity.Category;

import java.util.List;

public interface CategoryService {

    Category createCategory(CategoryDto categoryDto);
    List<Category> getAllCategories();
}
