package thao.demospringboot.repository.category;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import thao.demospringboot.model.category.Category;
@Repository
public interface ICategoryRepository extends JpaRepository<Category ,Long> {
}
