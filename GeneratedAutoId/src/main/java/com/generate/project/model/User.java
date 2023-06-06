package com.generate.project.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name ="generateid")
public class User {
	
	 @Id
    @GeneratedValue(generator = "auto_id")
	
	private int auto_id;
	private LocalDate dated;
	
	@Column(unique=true)
	
	public int getAuto_id() {
		return auto_id;
	}
	public void setAuto_id(int auto_id) {
		this.auto_id = auto_id;
	}
	public LocalDate getDated() {
		return dated;
	}
	public void setDated(LocalDate today) {
		this.dated = today;
	}
	
	
}
