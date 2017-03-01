package com.example.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "device")
public class Device {
	@Id
	@GeneratedValue
	private int id;
	private String name;
	private boolean turnLight;
	private int brightness;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isTurnLight() {
		return turnLight;
	}

	public void setTurnLight(boolean turnLight) {
		this.turnLight = turnLight;
	}

	public int getBrightness() {
		return brightness;
	}

	public void setBrightness(int brightness) {
		this.brightness = brightness;
	}

	public Device(int id, String name, boolean turnLight, int brightness) {

		this.id = id;
		this.name = name;
		this.turnLight = turnLight;
		this.brightness = brightness;
	}

	public Device() {
		super();
	}
	
}
