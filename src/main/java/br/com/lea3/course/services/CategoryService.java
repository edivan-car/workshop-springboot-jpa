package br.com.lea3.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.lea3.course.entities.Category;
import br.com.lea3.course.repositories.CategoryRepository;

@Service
public class CategoryService {

	@Autowired
	private CategoryRepository repository;
	
	public List<Category> findAll(){
		return repository.findAll();
	}
	
	public Category findbyId(Long id) {
		Optional<Category> obj = repository.findById(id);
		return obj.get();
	}
}
