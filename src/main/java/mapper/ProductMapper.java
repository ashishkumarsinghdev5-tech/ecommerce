package mapper; //conversion logic between Entity and DTO

import dto.ProductDto;// DTO class used to transfer data to/from client
import entities.Product;// Entity class mapped to the database table
import org.modelmapper.ModelMapper; // Used to automatically map fields between objects.

public class ProductMapper  // Product → ProductDto, ProductDto → Product
{
    public static final ModelMapper modelMapper = new ModelMapper();
    // static → Shared across the application,final → Cannot be reassigned.
    //new ModelMapper() → Creates instance of ModelMapper,
    // Used to call map() method for object conversion.
    public static ProductDto convertToDto(Product entity)
    //Takes Product entity as input.
    // Converts Entity → DTO., returns ProductDto object
    {
        return modelMapper.map(entity,ProductDto.class);
    }
    public static Product convertToEntity(ProductDto productDto)
    {
        return modelMapper.map(productDto,Product.class);
    }
}
