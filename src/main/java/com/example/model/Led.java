package com.example.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="led_device")
public class Led {
	public int getLed_id() {
		return led_id;
	}
	public void setLed_id(int led_id) {
		this.led_id = led_id;
	}
	public String getLed_name() {
		return led_name;
	}
	public void setLed_name(String led_name) {
		this.led_name = led_name;
	}
	public boolean isLed_status() {
		return led_status;
	}
	public void setLed_status(boolean led_status) {
		this.led_status = led_status;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "Led [led_id=" + led_id + ", led_name=" + led_name + ", led_status=" + led_status + ", price=" + price
				+ "]";
	}

	public Led() {
	}
	public Led(int led_id, String led_name, boolean led_status, float price) {
		this.led_id = led_id;
		this.led_name = led_name;
		this.led_status = led_status;
		this.price = price;
	}
	@Id
	@GeneratedValue
	@Column(name="id")
	private int led_id;
	@Column(name="name")
	private String led_name;
	@Column(name="status")
	private boolean led_status;
	@Column(name="price")
	private float price;
}
