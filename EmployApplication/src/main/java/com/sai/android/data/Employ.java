package com.sai.android.data;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "employ")
public class Employ {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;
	@Column
	String name;
	@Column
	String depart;
	@Column
	String design;

	Employ() {
	}

	public Employ(int id, String name, String depart, String design) {
		this.id = id;
		this.name = name;
		this.depart = depart;
		this.design = design;
	}

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

	public String getDepart() {
		return depart;
	}

	public void setDepart() {
		this.depart = depart;
	}

	public String getDesign() {
		return design;
	}

	public void setDesign() {
		this.design = design;
	}

	@Override
	public String toString() {
		return "Employee[id=" + id + ",name= " + name + " , dept =" + depart + " , desig=" + design + "]";
	}

}
