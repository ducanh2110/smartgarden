package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.model.FanSchedule;;

public interface FanScheduleRepository extends JpaRepository<FanSchedule, Integer> {

}
