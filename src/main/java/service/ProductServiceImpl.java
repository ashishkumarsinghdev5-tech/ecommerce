package service;

import dto.ProductCategoryDto;
import dto.ProductDto;
import entities.ProductCategory;
import mapper.ProductCategoryMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repo.ProductCategoryRepo;
import repo.ProductRepo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service //Marks this class as a Spring service layer component,
// Spring will create its object automatically (Spring Bean)
public class ProductServiceImpl implements ProductService
{
    @Autowired //Spring injects repository objects automatically,
    // Used to interact with database (JPA layer)
    private ProductRepo productRepo;
    @Autowired
    private ProductCategoryRepo categoryRepo;

    @Override
    public List<ProductCategoryDto> findAllCategories()
    {  /*

        List<ProductCategory> categories= categoryRepo.findAll();
        //Calls JPA repository method,Fetches all records from product_category table,
       // Returns List<ProductCategory> (Entity objects),This is raw DB data
        List<ProductCategoryDto> dtoList =new ArrayList<>();
        //Creating empty list to store DTOs,DTO is used to send safe data outside (API layer)
        //,We don’t expose entity directly
        for(ProductCategory category:categories)
        //Looping through each category entity,One entity at a time,
        //Time complexity: O(n) (single traversal)
        {
            ProductCategoryDto dto = ProductCategoryMapper.convertToDto(category);
           // Convert entity → DTO,Mapping layer handles field copying,Keeps service clean,
           // Separation of concerns maintained
            dtoList.add(dto);// Add converted DTO into result list,Building final response list
        }
        return dtoList;
        */
       return categoryRepo.findAll()
               .stream()
                .map(ProductCategoryMapper::convertToDto)
                .collect(Collectors.toList());
       /* Input → ProductCategory,Output → ProductCategoryDto
       1.Fetch all categories,2.Convert list to stream,3.Transform each entity into DTO,
       4.Collect results into new List,5.Return DTO list
       (Stream works like pipeline:
       ,Data → map() transformation → collect() → Result,
       Lazy execution: 1.map() does not execute immediately
       2.Executes only when collect() is called )
         */


    } 

    @Override
    public List<ProductDto> findProductByCategoryId(Long categoryId)
    {
        return null;
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
