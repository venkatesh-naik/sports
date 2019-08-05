package com.xworkz.thor.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="sports")
public class SportsDto implements Serializable{
	@Id
	@GenericGenerator(name="xworkz",strategy="increment")
	@GeneratedValue(generator="xworkz")
	
	@Column(name="sid")
	private int sid;
	@Column(name="sname")
	private String sname;
	@Column(name="stype")
	private String stype;
	@Column(name="noofplayers")
	private String noofplayer;
	@Column(name="location")
	private String location;
	@Column(name="i18n")
	private String i18n;
	
	public SportsDto() {
		// TODO Auto-generated constructor stub
		System.out.println("invoke sports dto");
	}

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public String getStype() {
		return stype;
	}

	public void setStype(String stype) {
		this.stype = stype;
	}

	public String getNoofplayer() {
		return noofplayer;
	}

	public void setNoofplayer(String noofplayer) {
		this.noofplayer = noofplayer;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getI18n() {
		return i18n;
	}

	public void setI18n(String i18n) {
		this.i18n = i18n;
	}

	@Override
	public String toString() {
		return "SportsDto [sid=" + sid + ", sname=" + sname + ", stype="
				+ stype + ", noofplayer=" + noofplayer + ", location="
				+ location + ", i18n=" + i18n + "]";
	}
	

}
