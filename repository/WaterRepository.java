package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.model.Water;;

public interface WaterRepository extends JpaRepository<Water, Integer> {

}
