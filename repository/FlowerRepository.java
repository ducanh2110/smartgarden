package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.model.Flower;

public interface FlowerRepository extends JpaRepository<Flower, Integer> {

}
