package com.example.model;

import javax.persistence.*;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="led_device")
public class Led {
	@Column(name="id")
	@Id
	@GeneratedValue
	private int led_id;
	@Column(name="name")
	private String led_name;
	@Column(name="status")
	private boolean led_status;
	private Set<Led> led;
	
	public Led() {
	}
	public Led(int led_id, String led_name, boolean led_status) {
		this.led_id = led_id;
		this.led_name = led_name;
		this.led_status = led_status;
	}
	
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
	
	@OneToMany(mappedBy = "ledschedule", cascade = CascadeType.ALL)
    public Set<Led> getBooks() {
        return led;
    }
	
	@Override
	public String toString() {
		return "Led [led_id=" + led_id + ", led_name=" + led_name + ", led_status=" + led_status + "]";
	}
}
