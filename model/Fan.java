package com.example.model;

import javax.persistence.*;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="fan_device")
public class Fan {
	@Column(name="id")
	@Id
	@GeneratedValue
	private int fan_id;
	@Column(name="name")
	private String fan_name;
	@Column(name="status")
	private boolean fan_status;
	private Set<Fan> fan;
	
	public Fan() {
	}
	public Fan(int fan_id, String fan_name, boolean fan_status) {
		this.fan_id = fan_id;
		this.fan_name = fan_name;
		this.fan_status = fan_status;
	}
	
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
	
	@OneToMany(mappedBy = "fanschedule", cascade = CascadeType.ALL)
    public Set<Fan> getBooks() {
        return fan;
    }
	
	@Override
	public String toString() {
		return "Fan [fan_id=" + fan_id + ", fan_name=" + fan_name + ", fan_status=" + fan_status + "]";
	}
}
