package com.eliezer.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.eliezer.dsmovie.entities.Score;
import com.eliezer.dsmovie.entities.ScorePK;

public interface ScoreRepository extends JpaRepository<Score, ScorePK>{

}
