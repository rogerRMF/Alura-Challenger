package com.Alura.Challenge.playlist.repositories;



import org.springframework.data.jpa.repository.JpaRepository;

import com.Alura.Challenge.playlist.entities.Filme;

public interface FilmeRepository extends JpaRepository<Filme, Long> {
	
	
}
