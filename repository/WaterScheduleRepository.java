package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.model.WaterSchedule;;

public interface WaterScheduleRepository extends JpaRepository<WaterSchedule, Integer> {

}
