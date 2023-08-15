package dev.raniery.catalog.services;

import dev.raniery.catalog.entities.Category;
import dev.raniery.catalog.repositories.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryServices {

    @Autowired
    private CategoryRepository repository;
    public List<Category> findAll() {
        return repository.findAll();
    }
}
