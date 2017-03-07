package com.example.model;

import javax.persistence.*;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import org.joda.time.DateTime;

@Entity
@Table(name="nutrient_schedule")
public class NutrientSchedule {
	@Column(name="id")
	@Id
	@GeneratedValue
	private int nutrientschedule_id;
	@Column(name="nutrientdeviceid")
	private int nutrient_id;
	@Column(name="datecreated")
	private DateTime nutrient_datecreated;
	@Column(name="datemodified")
	private DateTime nutrient_datemodified;
	@Column(name="activestartdate")
	private DateTime nutrient_activestartdate;
	@Column(name="activeenddate")
	private DateTime nutrient_activeenddate;
	
	public NutrientSchedule() {
	}
	public NutrientSchedule(int nutrientschedule_id, int nutrient_id, DateTime nutrient_datecreated, DateTime nutrient_datemodified,
			DateTime nutrient_activestartdate, DateTime nutrient_activeenddate) {
		super();
		this.nutrientschedule_id = nutrientschedule_id;
		this.nutrient_id = nutrient_id;
		this.nutrient_datecreated = nutrient_datecreated;
		this.nutrient_datemodified = nutrient_datemodified;
		this.nutrient_activestartdate = nutrient_activestartdate;
		this.nutrient_activeenddate = nutrient_activeenddate;
	}

	public int getNutrientschedule_id() {
		return nutrientschedule_id;
	}
	public void setNutrientschedule_id(int nutrientschedule_id) {
		this.nutrientschedule_id = nutrientschedule_id;
	}
	@ManyToOne
    @JoinColumn(name = "nutrient_id")
	public int getNutrient_id() {
		return nutrient_id;
	}
	public void setNutrient_id(int nutrient_id) {
		this.nutrient_id = nutrient_id;
	}
	public DateTime getNutrient_datecreated() {
		return nutrient_datecreated;
	}
	public void setNutrient_datecreated(DateTime nutrient_datecreated) {
		this.nutrient_datecreated = nutrient_datecreated;
	}
	public DateTime getNutrient_datemodified() {
		return nutrient_datemodified;
	}
	public void setNutrient_datemodified(DateTime nutrient_datemodified) {
		this.nutrient_datemodified = nutrient_datemodified;
	}
	public DateTime getNutrient_activestartdate() {
		return nutrient_activestartdate;
	}
	public void setNutrient_activestartdate(DateTime nutrient_activestartdate) {
		this.nutrient_activestartdate = nutrient_activestartdate;
	}
	public DateTime getNutrient_activeenddate() {
		return nutrient_activeenddate;
	}
	public void setNutrient_activeenddate(DateTime nutrient_activeenddate) {
		this.nutrient_activeenddate = nutrient_activeenddate;
	}
	
	@Override
	public String toString() {
		return "NutrientSchedule [nutrientschedule_id=" + nutrientschedule_id + ", nutrient_id=" + nutrient_id + ", nutrient_datecreated="
				+ nutrient_datecreated + ", nutrient_datemodified=" + nutrient_datemodified + ", nutrient_activestartdate="
				+ nutrient_activestartdate + ", nutrient_activeenddate=" + nutrient_activeenddate + "]";
	}
}
