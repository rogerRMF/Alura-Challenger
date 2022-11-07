package com.Alura.Challenge.playlist.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.Alura.Challenge.playlist.entities.Filme;
import com.Alura.Challenge.playlist.repositories.FilmeRepository;
import com.Alura.Challenge.playlist.services.exceptions.EntityNotFoundException;

@Service
public class FilmeService {
	
	@Autowired
	private FilmeRepository repository;
	
	public Filme findById(Long id) {
		return repository.findById(id).orElseThrow(
				() -> new EntityNotFoundException("Id not found" + id));		
	}
	
	

}
