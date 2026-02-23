package repo;

import entities.ProductCategory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductCategoryRepo extends JpaRepository<ProductCategory, Long>
/* “Create a repository for ProductCategory entity where ID type is Long
and give me full database CRUD operations automatically.”
 */
{
}