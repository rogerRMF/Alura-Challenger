package com.Alura.Challenge.playlist.controllers;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.Alura.Challenge.playlist.entities.Filme;
import com.Alura.Challenge.playlist.repositories.FilmeRepository;
import com.Alura.Challenge.playlist.services.FilmeService;




@RestController
@RequestMapping(value = "/videos")
public class FilmeController {
	
	@Autowired
	private FilmeService filmeService;
	
	@Autowired
	private FilmeRepository repository;
	
	@GetMapping
	public ResponseEntity<List<Filme>> findAll() {
		List<Filme> list = repository.findAll();
		return ResponseEntity.ok().body(list);
		
	}
		
	@GetMapping(value= "/{id}")
	public ResponseEntity<Filme> findById(@PathVariable Long id) {
			Filme obj = filmeService.findById(id);
			return ResponseEntity.ok().body(obj);
	}
	
	@PostMapping
	public Filme insert(@RequestBody Filme filme ) {
		Filme result = repository.save(filme);
		return result;
	}
	
}
	//@PutMapping(value = "/videos{id}")
	//public Filme atualizar(@PathVariable Long id, @RequestBody Filme filme) {
	//	Filme filmeAtual = repository.findById(id).get();
	//	BeanUtils.copyProperties(filme, filmeAtual, "id");
//		return repository.save(filmeAtual);
	//}
	
//}





















