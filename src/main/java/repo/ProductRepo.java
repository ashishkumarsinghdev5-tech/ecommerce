package repo;

import entities.Product;/* Imports Product entity class.,Product is a JPA entity.
                          It represents a table in database */
import org.springframework.data.jpa.repository.JpaRepository; /* Imports JpaRepository
from Spring Data JPA. JpaRepository is an interface provided by Spring.
It gives: save(),findAll(),findById(),deleteById(),count(), and many more methods */

import java.util.List;

public interface ProductRepo extends JpaRepository<Product,Long>
/* public → accessible anywhere , interface → no implementation written by you
Spring automatically generates implementation at runtime
note :- NEVER create ProductRepoImpl manually.
 */
{
    public List<Product> findByCategoryId(Long categoryId);
}
