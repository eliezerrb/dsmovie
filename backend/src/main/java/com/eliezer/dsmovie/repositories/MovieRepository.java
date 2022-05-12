package com.eliezer.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.eliezer.dsmovie.entities.Movie;

public interface MovieRepository extends JpaRepository<Movie, Long>{

}
