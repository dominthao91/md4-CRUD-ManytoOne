package thao.demospringboot.service.category;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import thao.demospringboot.model.category.Category;
import thao.demospringboot.repository.category.ICategoryRepository;

import java.util.Optional;

@Service
public class CategoryService implements ICategoryService{
    @Autowired
    private ICategoryRepository categoryRepository;
    @Override
    public Iterable findAll() {
        return categoryRepository.findAll();
    }

    @Override
    public Optional findById(Long id) {
        return categoryRepository.findById(id);
    }

    @Override
    public Category save(Category category) {
        return categoryRepository.save(category);
    }

    @Override
    public void remove(Long id) {
    categoryRepository.deleteById(id);
    }
}
