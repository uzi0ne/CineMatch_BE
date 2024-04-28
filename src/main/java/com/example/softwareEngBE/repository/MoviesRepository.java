package com.example.softwareEngBE.repository;

import com.example.softwareEngBE.entity.Movies;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface MoviesRepository extends JpaRepository<Movies,Integer> {
    List<Movies> findByTitle(String title);
}
