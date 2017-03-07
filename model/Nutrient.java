package com.example.model;

import javax.persistence.*;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="nutrient_device")
public class Nutrient {
	@Column(name="id")
	@Id
	@GeneratedValue
	private int nutrient_id;
	@Column(name="name")
	private String nutrient_name;
	@Column(name="status")
	private boolean nutrient_status;
	private Set<Nutrient> nutrient;
	
	public Nutrient() {
	}
	public Nutrient(int nutrient_id, String nutrient_name, boolean nutrient_status) {
		this.nutrient_id = nutrient_id;
		this.nutrient_name = nutrient_name;
		this.nutrient_status = nutrient_status;
	}
	
	public int getNutrient_id() {
		return nutrient_id;
	}
	public void setNutrient_id(int nutrient_id) {
		this.nutrient_id = nutrient_id;
	}
	public String getNutrient_name() {
		return nutrient_name;
	}
	public void setNutrient_name(String nutrient_name) {
		this.nutrient_name = nutrient_name;
	}
	public boolean isNutrient_status() {
		return nutrient_status;
	}
	public void setNutrient_status(boolean nutrient_status) {
		this.nutrient_status = nutrient_status;
	}
	
	@OneToMany(mappedBy = "nutrientschedule", cascade = CascadeType.ALL)
    public Set<Nutrient> getBooks() {
        return nutrient;
    }
	
	@Override
	public String toString() {
		return "Nutrient [nutrient_id=" + nutrient_id + ", nutrient_name=" + nutrient_name + ", nutrient_status=" + nutrient_status + "]";
	}
}
