package entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Set;

@Entity
@Table(name="product_category")
@Setter
@Getter
public class ProductCategory
{
    @Id //primary key of the table.
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    //Database auto-generates the ID (auto-increment).
    private Long id;
    private String categoryName;
    @OneToMany(mappedBy= "category",cascade = CascadeType.ALL)
    //One category → many products.
    //The relationship is controlled by the category field inside the Product entity.
    //This is the inverse (non-owning) side.
    //All operations (save, delete, update) on category will apply to products
    private Set<Product> products;
    //Holds all products belonging to this category.
    //Foreign key will exist in the Product table, not here.
}
