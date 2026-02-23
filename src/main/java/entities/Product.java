package entities;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.Date;

@Entity //It will map to a database table.
@Table(name="product") //Maps this entity to the product table.
@Setter
@Getter
public class Product
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
    @ManyToOne //Many products belong to one category.
    @JoinColumn(name = "category_id",nullable = false)
    // Creates foreign key column category_id in product table.
    // nullable = false means: Every product must belong to a category.
    private ProductCategory category;
    //References the ProductCategory entity.

}
