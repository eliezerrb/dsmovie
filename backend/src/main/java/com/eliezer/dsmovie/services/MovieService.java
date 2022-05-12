package com.eliezer.dsmovie.services;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.eliezer.dsmovie.dto.MovieDTO;
import com.eliezer.dsmovie.entities.Movie;
import com.eliezer.dsmovie.repositories.MovieRepository;


@Service
public class MovieService {
	
	@Autowired
	private MovieRepository repository;

	@Transactional(readOnly = true)
	public Page<MovieDTO> findall(Pageable pageable) {
		//busca pagina retornando entidade
		Page<Movie> result = repository.findAll(pageable);
		//convertendo pagina para DTO
		Page<MovieDTO> page = result.map(x -> new MovieDTO(x));
		return page;
	}
	
	
	@Transactional(readOnly = true)
	public MovieDTO findById(Long id) {
		//.get serve para acessar o objeto movie que está dentro do objeto optional que é o retorno do findById
		Movie result = repository.findById(id).get();
		MovieDTO dto = new MovieDTO(result);
		return dto;
	}
	
}
