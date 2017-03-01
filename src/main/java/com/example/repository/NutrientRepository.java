package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.model.Nutrient;;

public interface NutrientRepository extends JpaRepository<Nutrient, Integer> {

}
