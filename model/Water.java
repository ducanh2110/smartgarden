package com.example.model;

import javax.persistence.*;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="water_device")
public class Water {
	@Column(name="id")
	@Id
	@GeneratedValue
	private int water_id;
	@Column(name="name")
	private String water_name;
	@Column(name="status")
	private boolean water_status;
	private Set<Water> water;
	
	public Water() {
	}
	public Water(int water_id, String water_name, boolean water_status) {
		this.water_id = water_id;
		this.water_name = water_name;
		this.water_status = water_status;
	}
	
	public int getWater_id() {
		return water_id;
	}
	public void setWater_id(int water_id) {
		this.water_id = water_id;
	}
	public String getWater_name() {
		return water_name;
	}
	public void setWater_name(String water_name) {
		this.water_name = water_name;
	}
	public boolean isWater_status() {
		return water_status;
	}
	public void setWater_status(boolean water_status) {
		this.water_status = water_status;
	}
	
	@OneToMany(mappedBy = "waterschedule", cascade = CascadeType.ALL)
    public Set<Water> getBooks() {
        return water;
    }
	
	@Override
	public String toString() {
		return "Water [water_id=" + water_id + ", water_name=" + water_name + ", water_status=" + water_status + "]";
	}
}
