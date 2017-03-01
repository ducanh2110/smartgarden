package com.example.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="nutrientpump_device")
public class Nutrient {
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
	public float getNutrient_price() {
		return nutrient_price;
	}
	public void setNutrient_price(float nutrient_price) {
		this.nutrient_price = nutrient_price;
	}
	public Nutrient() {
	}
	@Override
	public String toString() {
		return "Nutrient [nutrient_id=" + nutrient_id + ", nutrient_name=" + nutrient_name + ", nutrient_status=" + nutrient_status + ", nutrient_price="
				+ nutrient_price + "]";
	}
	public Nutrient(int nutrient_id, String nutrient_name, boolean nutrient_status, float nutrient_price) {
		this.nutrient_id = nutrient_id;
		this.nutrient_name = nutrient_name;
		this.nutrient_status = nutrient_status;
		this.nutrient_price = nutrient_price;
	}
	@Column(name="id")
	@Id
	@GeneratedValue
	private int nutrient_id;
	@Column(name="name")
	private String nutrient_name;
	@Column(name="status")
	private boolean nutrient_status;
	@Column(name="price")
	private float nutrient_price;
}
