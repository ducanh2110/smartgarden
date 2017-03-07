package com.example.model;

import javax.persistence.*;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import org.joda.time.DateTime;

@Entity
@Table(name="led_schedule")
public class LedSchedule {
	@Column(name="id")
	@Id
	@GeneratedValue
	private int ledschedule_id;
	@Column(name="leddeviceid")
	private int led_id;
	@Column(name="datecreated")
	private DateTime led_datecreated;
	@Column(name="datemodified")
	private DateTime led_datemodified;
	@Column(name="activestartdate")
	private DateTime led_activestartdate;
	@Column(name="activeenddate")
	private DateTime led_activeenddate;
	
	public LedSchedule() {
	}
	public LedSchedule(int ledschedule_id, int led_id, DateTime led_datecreated, DateTime led_datemodified,
			DateTime led_activestartdate, DateTime led_activeenddate) {
		super();
		this.ledschedule_id = ledschedule_id;
		this.led_id = led_id;
		this.led_datecreated = led_datecreated;
		this.led_datemodified = led_datemodified;
		this.led_activestartdate = led_activestartdate;
		this.led_activeenddate = led_activeenddate;
	}

	public int getLedschedule_id() {
		return ledschedule_id;
	}
	public void setLedschedule_id(int ledschedule_id) {
		this.ledschedule_id = ledschedule_id;
	}
	@ManyToOne
    @JoinColumn(name = "led_id")
	public int getLed_id() {
		return led_id;
	}
	public void setLed_id(int led_id) {
		this.led_id = led_id;
	}
	public DateTime getLed_datecreated() {
		return led_datecreated;
	}
	public void setLed_datecreated(DateTime led_datecreated) {
		this.led_datecreated = led_datecreated;
	}
	public DateTime getLed_datemodified() {
		return led_datemodified;
	}
	public void setLed_datemodified(DateTime led_datemodified) {
		this.led_datemodified = led_datemodified;
	}
	public DateTime getLed_activestartdate() {
		return led_activestartdate;
	}
	public void setLed_activestartdate(DateTime led_activestartdate) {
		this.led_activestartdate = led_activestartdate;
	}
	public DateTime getLed_activeenddate() {
		return led_activeenddate;
	}
	public void setLed_activeenddate(DateTime led_activeenddate) {
		this.led_activeenddate = led_activeenddate;
	}
	
	@Override
	public String toString() {
		return "LedSchedule [ledschedule_id=" + ledschedule_id + ", led_id=" + led_id + ", led_datecreated="
				+ led_datecreated + ", led_datemodified=" + led_datemodified + ", led_activestartdate="
				+ led_activestartdate + ", led_activeenddate=" + led_activeenddate + "]";
	}
}
