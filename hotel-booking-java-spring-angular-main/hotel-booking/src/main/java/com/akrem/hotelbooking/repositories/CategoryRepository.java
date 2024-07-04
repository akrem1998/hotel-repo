package com.akrem.hotelbooking.repositories;
import org.springframework.data.jpa.repository.JpaRepository;
import com.akrem.hotelbooking.models.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {
    void deleteCategoryById(Long id);
    Category findCategoryById(Long id);
}
