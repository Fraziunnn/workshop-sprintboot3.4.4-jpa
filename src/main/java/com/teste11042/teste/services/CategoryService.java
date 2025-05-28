package com.teste11042.teste.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.teste11042.teste.entites.Category;
import com.teste11042.teste.entites.User;
import com.teste11042.teste.repositories.CategoryRepository;
import com.teste11042.teste.repositories.UserRepository;

@Service
public class CategoryService {

	@Autowired
	private CategoryRepository repository;
	
	public List<Category> findAll() {
		return repository.findAll();
		
	}
	public Category findById(Long Id) {
		Optional<Category> obj = repository.findById(Id);
		return obj.get();
	}
	
}
