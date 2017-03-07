package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.model.NutrientSchedule;;

public interface NutrientScheduleRepository extends JpaRepository<NutrientSchedule, Integer> {

}
