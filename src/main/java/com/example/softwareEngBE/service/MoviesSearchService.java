package com.example.softwareEngBE.service;

import com.example.softwareEngBE.dto.MoviesDto;
import com.example.softwareEngBE.entity.Movies;
import com.example.softwareEngBE.repository.MoviesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

import static com.example.softwareEngBE.dto.MoviesDto.createMoviesDto;

@Service
public class MoviesSearchService {
    @Autowired
    MoviesRepository moviesRepository;


    public List<MoviesDto> getAllMovies() { //모든 영화 보여주기
        List<Movies> moviesEntityList = moviesRepository.findAll();
        List<MoviesDto> moviesDtoList = new ArrayList<>();
        //MoviesDto 리스트에 하나씩 추가
        for (Movies movieEntity : moviesEntityList) {
            moviesDtoList.add(MoviesDto.createMoviesDto(movieEntity));
        }
        return moviesDtoList;
    }

    public List<MoviesDto> findByTitle(String title) {
        List<Movies> moviesEntityList=moviesRepository.findByTitle(title);
        List<MoviesDto> moviesDtoList=new ArrayList<>();
        for (Movies movieEntity : moviesEntityList) {
            moviesDtoList.add(MoviesDto.createMoviesDto(movieEntity));
        }
        return moviesDtoList;
    }
}
