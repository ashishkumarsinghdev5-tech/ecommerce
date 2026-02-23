package dto;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.Date;
@Setter
@Getter
public class ProductDto
{
    private Long id; // Primary key of the table.
    private String name ; // Product name.
    private String description; //Product description.
    private String title; //Product title.
    private BigDecimal unitPrice; //Stores product price
    // BigDecimal is preferred for currency to avoid precision issues.
    private String image;//Stores image URL or image path.
    private boolean active; // Indicates if product is active or not.
    private int untilInStock; //Stores quantity available in stock.
    private Date dateCreated; //Stores when the product was created.
    private Date lastUpadate;//Stores last update time.
}
