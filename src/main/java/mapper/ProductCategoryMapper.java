package mapper;

import dto.ProductCategoryDto;
import dto.ProductDto;
import entities.Product;
import entities.ProductCategory;
import org.modelmapper.ModelMapper;

public class ProductCategoryMapper
{
    public static final ModelMapper modelMapper = new ModelMapper();
    public static ProductCategoryDto convertToDto(ProductCategory entity)
    {
        return modelMapper.map(entity,ProductCategoryDto.class);
    }
    public static ProductCategory convertToEntity(ProductCategoryDto categoryDto)
    {
        return modelMapper.map(categoryDto,ProductCategory.class);
    }

}
