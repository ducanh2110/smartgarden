package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.model.LedSchedule;;

public interface LedScheduleRepository extends JpaRepository<LedSchedule, Integer> {

}
