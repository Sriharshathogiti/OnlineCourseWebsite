package com.example.Controller.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String prifix;
	private String userName;
	private String emailid;
	private String mobilenumber;
	private String course;
	private String modeOfTraining;
	public User() {
		
	}
	public User(Integer id, String prifix, String userName, String emailid, String mobilenumber, String course,
			String modeOfTraining) {
		this.id = id;
		this.prifix = prifix;
		this.userName = userName;
		this.emailid = emailid;
		this.mobilenumber = mobilenumber;
		this.course = course;
		this.modeOfTraining = modeOfTraining;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getPrifix() {
		return prifix;
	}
	public void setPrifix(String prifix) {
		this.prifix = prifix;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getEmailid() {
		return emailid;
	}
	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}
	public String getMobilenumber() {
		return mobilenumber;
	}
	public void setMobilenumber(String mobilenumber) {
		this.mobilenumber = mobilenumber;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public String getModeOfTraining() {
		return modeOfTraining;
	}
	public void setModeOfTraining(String modeOfTraining) {
		this.modeOfTraining = modeOfTraining;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", prifix=" + prifix + ", userName=" + userName + ", emailid=" + emailid
				+ ", mobilenumber=" + mobilenumber + ", course=" + course + ", modeOfTraining=" + modeOfTraining + "]";
	}
	
	
	
	

}
