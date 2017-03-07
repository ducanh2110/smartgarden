package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.model.Fan;

public interface FanRepository extends JpaRepository<Fan, Integer> {

}
