package service;

import dto.ProductCategoryDto; // This DTO represents Category data
import dto.ProductDto; // Represents Product data.

import java.util.List;

public interface ProductService
{
    public List<ProductCategoryDto> findAllCategories();
    /* public → accessible everywhere, List<ProductCategoryDto> → return type
     findAllCategories() → method name., Fetch all product categories.
    Used by controller to display categories */
    public List<ProductDto> findProductByCategoryId(Long categoryId);
    /* public → accessible from other classes.,
     List<ProductDto> → returns list of product DTOs ,
    findProductByCategoryId → method name.*/
    public ProductDto findByProductId(Long productId);
    public List<ProductDto> findByProductName(String productName);
}
