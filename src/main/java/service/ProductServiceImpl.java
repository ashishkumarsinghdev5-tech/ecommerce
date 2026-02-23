package service; // Service layer package.
import dto.ProductCategoryDto; // Import Category DTO.
import dto.ProductDto; // Import Product DTO.
import entities.ProductCategory; // Import Category Entity (DB table class).
import mapper.ProductCategoryMapper; // Import Mapper (Entity → DTO conversion).
import org.springframework.beans.factory.annotation.Autowired; // Used for dependency injection.
import org.springframework.stereotype.Service; // Marks class as Spring Service bean.
import repo.ProductCategoryRepo; // Import Category Repository.
import repo.ProductRepo; //Import Product Repository.

import java.util.ArrayList;// Used to create dynamic list.
import java.util.List;//➡ List interface for collection.
import java.util.stream.Collectors;

@Service//➡ Registers this class as Spring-managed service component.
public class ProductServiceImpl implements ProductService
    //➡ Service implementation class of ProductService interface.
{
  @Autowired // ➡ Inject dependency automatically.
  private ProductRepo productRepo; //➡ Product repository object.
  @Autowired
  private ProductCategoryRepo categoryRepo;//➡ Category repository object.
    @Override
    public List<ProductCategoryDto> findAllCategories()
            //➡ Method to fetch all categories.
    { /*
      List<ProductCategory> categories = categoryRepo.findAll(); //➡ Fetch all categories from database.
      List<ProductCategoryDto> dtoList = new ArrayList<>();//➡ Create empty DTO list.
      for (ProductCategory category : categories)
      {//➡ Loop through each category.

          ProductCategoryDto dto = ProductCategoryMapper.convertToDto(category);//➡ Convert Entity → DTO.
          dtoList.add(dto);//➡ Add converted DTO to list.}
       return dtoList ; */
        // using alternate option java 8
       return categoryRepo.findAll()
                .stream()
                .map(ProductCategoryMapper::convertToDto)
                .collect(Collectors.toList());

    }

    @Override
    public List<ProductDto> findProductByCategoryId(Long categoryId) {
        return null ;
    }

    @Override
    public ProductDto findByProductId(Long productId) {
        return null;
    }

    @Override
    public List<ProductDto> findByProductName(String productName) {
        return null;
    }
}
