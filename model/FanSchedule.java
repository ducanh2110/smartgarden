package com.example.model;

import javax.persistence.*;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import org.joda.time.DateTime;

@Entity
@Table(name="fan_schedule")
public class FanSchedule {
	@Column(name="id")
	@Id
	@GeneratedValue
	private int fanschedule_id;
	@Column(name="fandeviceid")
	private int fan_id;
	@Column(name="datecreated")
	private DateTime fan_datecreated;
	@Column(name="datemodified")
	private DateTime fan_datemodified;
	@Column(name="activestartdate")
	private DateTime fan_activestartdate;
	@Column(name="activeenddate")
	private DateTime fan_activeenddate;
	
	public FanSchedule() {
	}
	public FanSchedule(int fanschedule_id, int fan_id, DateTime fan_datecreated, DateTime fan_datemodified,
			DateTime fan_activestartdate, DateTime fan_activeenddate) {
		super();
		this.fanschedule_id = fanschedule_id;
		this.fan_id = fan_id;
		this.fan_datecreated = fan_datecreated;
		this.fan_datemodified = fan_datemodified;
		this.fan_activestartdate = fan_activestartdate;
		this.fan_activeenddate = fan_activeenddate;
	}

	public int getFanschedule_id() {
		return fanschedule_id;
	}
	public void setFanschedule_id(int fanschedule_id) {
		this.fanschedule_id = fanschedule_id;
	}
	@ManyToOne
    @JoinColumn(name = "fan_id")
	public int getFan_id() {
		return fan_id;
	}
	public void setFan_id(int fan_id) {
		this.fan_id = fan_id;
	}
	public DateTime getFan_datecreated() {
		return fan_datecreated;
	}
	public void setFan_datecreated(DateTime fan_datecreated) {
		this.fan_datecreated = fan_datecreated;
	}
	public DateTime getFan_datemodified() {
		return fan_datemodified;
	}
	public void setFan_datemodified(DateTime fan_datemodified) {
		this.fan_datemodified = fan_datemodified;
	}
	public DateTime getFan_activestartdate() {
		return fan_activestartdate;
	}
	public void setFan_activestartdate(DateTime fan_activestartdate) {
		this.fan_activestartdate = fan_activestartdate;
	}
	public DateTime getFan_activeenddate() {
		return fan_activeenddate;
	}
	public void setFan_activeenddate(DateTime fan_activeenddate) {
		this.fan_activeenddate = fan_activeenddate;
	}
	
	@Override
	public String toString() {
		return "FanSchedule [fanschedule_id=" + fanschedule_id + ", fan_id=" + fan_id + ", fan_datecreated="
				+ fan_datecreated + ", fan_datemodified=" + fan_datemodified + ", fan_activestartdate="
				+ fan_activestartdate + ", fan_activeenddate=" + fan_activeenddate + "]";
	}
}
