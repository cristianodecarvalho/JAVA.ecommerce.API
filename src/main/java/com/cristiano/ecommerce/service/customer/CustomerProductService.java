package com.cristiano.ecommerce.service.customer;

import com.cristiano.ecommerce.dto.ProductDetailDto;
import com.cristiano.ecommerce.dto.ProductDto;

import java.util.List;

public interface CustomerProductService {
    List<ProductDto> getAllProducts();
    List<ProductDto> searchProductByTitle(String title);
    ProductDetailDto getProductDetailById(Long productId);
}
