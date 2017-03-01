package com.example.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="fan_device")
public class Fan {
	public int getFan_id() {
		return fan_id;
	}
	public void setFan_id(int fan_id) {
		this.fan_id = fan_id;
	}
	public String getFan_name() {
		return fan_name;
	}
	public void setFan_name(String fan_name) {
		this.fan_name = fan_name;
	}
	public boolean isFan_status() {
		return fan_status;
	}
	public void setFan_status(boolean fan_status) {
		this.fan_status = fan_status;
	}
	public float getFan_price() {
		return fan_price;
	}
	public void setFan_price(float fan_price) {
		this.fan_price = fan_price;
	}
	public Fan() {
	}
	@Override
	public String toString() {
		return "Fan [fan_id=" + fan_id + ", fan_name=" + fan_name + ", fan_status=" + fan_status + ", fan_price="
				+ fan_price + "]";
	}
	public Fan(int fan_id, String fan_name, boolean fan_status, float fan_price) {
		this.fan_id = fan_id;
		this.fan_name = fan_name;
		this.fan_status = fan_status;
		this.fan_price = fan_price;
	}
	@Column(name="id")
	@Id
	@GeneratedValue
	private int fan_id;
	@Column(name="name")
	private String fan_name;
	@Column(name="status")
	private boolean fan_status;
	@Column(name="price")
	private float fan_price;
}
