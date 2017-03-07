package com.example.model;

import javax.persistence.*;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import org.joda.time.DateTime;

@Entity
@Table(name="water_schedule")
public class WaterSchedule {
	@Column(name="id")
	@Id
	@GeneratedValue
	private int waterschedule_id;
	@Column(name="waterdeviceid")
	private int water_id;
	@Column(name="datecreated")
	private DateTime water_datecreated;
	@Column(name="datemodified")
	private DateTime water_datemodified;
	@Column(name="activestartdate")
	private DateTime water_activestartdate;
	@Column(name="activeenddate")
	private DateTime water_activeenddate;
	
	public WaterSchedule() {
	}
	public WaterSchedule(int waterschedule_id, int water_id, DateTime water_datecreated, DateTime water_datemodified,
			DateTime water_activestartdate, DateTime water_activeenddate) {
		super();
		this.waterschedule_id = waterschedule_id;
		this.water_id = water_id;
		this.water_datecreated = water_datecreated;
		this.water_datemodified = water_datemodified;
		this.water_activestartdate = water_activestartdate;
		this.water_activeenddate = water_activeenddate;
	}

	public int getWaterschedule_id() {
		return waterschedule_id;
	}
	public void setWaterschedule_id(int waterschedule_id) {
		this.waterschedule_id = waterschedule_id;
	}
	@ManyToOne
    @JoinColumn(name = "water_id")
	public int getWater_id() {
		return water_id;
	}
	public void setWater_id(int water_id) {
		this.water_id = water_id;
	}
	public DateTime getWater_datecreated() {
		return water_datecreated;
	}
	public void setWater_datecreated(DateTime water_datecreated) {
		this.water_datecreated = water_datecreated;
	}
	public DateTime getWater_datemodified() {
		return water_datemodified;
	}
	public void setWater_datemodified(DateTime water_datemodified) {
		this.water_datemodified = water_datemodified;
	}
	public DateTime getWater_activestartdate() {
		return water_activestartdate;
	}
	public void setWater_activestartdate(DateTime water_activestartdate) {
		this.water_activestartdate = water_activestartdate;
	}
	public DateTime getWater_activeenddate() {
		return water_activeenddate;
	}
	public void setWater_activeenddate(DateTime water_activeenddate) {
		this.water_activeenddate = water_activeenddate;
	}
	
	@Override
	public String toString() {
		return "WaterSchedule [waterschedule_id=" + waterschedule_id + ", water_id=" + water_id + ", water_datecreated="
				+ water_datecreated + ", water_datemodified=" + water_datemodified + ", water_activestartdate="
				+ water_activestartdate + ", water_activeenddate=" + water_activeenddate + "]";
	}
}
