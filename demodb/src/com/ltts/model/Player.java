package com.ltts.model;

import java.util.Date;

public class Player {
 int id;
 String name;
 String skill;
 Date dateOfBirth;
int numberOfMatches;
 int runs;
 int wickets;
 String nationality;
 
 
 
 


public Player(int id, String name, String skill, Date dateOfBirth, int numberOfMatches, int runs, int wickets,
		String nationality) {
	super();
	this.id = id;
	this.name = name;
	this.skill = skill;
	this.dateOfBirth = dateOfBirth;
	this.numberOfMatches = numberOfMatches;
	this.runs = runs;
	this.wickets = wickets;
	this.nationality = nationality;
}




public  int getid() {
	return id;
}




public void setid(int id) {
	this.id = id;
}



public String getName() {
	return name;
}




public void setName(String name) {
	this.name = name;
}




public String getSkill() {
	return skill;
}




public void setSkill(String skill) {
	this.skill = skill;
}




public Date getDateOfBirth() {
	return dateOfBirth;
}




public void setDateOfBirth(Date dateOfBirth) {
	this.dateOfBirth = dateOfBirth;
}




public int getNumberOfMatches() {
	return numberOfMatches;
}




public void setNumberOfMatches(int numberOfMatches) {
	this.numberOfMatches = numberOfMatches;
}




public int getRuns() {
	return runs;
}




public void setRuns(int runs) {
	this.runs = runs;
}




public int getWickets() {
	return wickets;
}




public void setWickets(int wickets) {
	this.wickets = wickets;
}




public String getNationality() {
	return nationality;
}




public void setNationality(String nationality) {
	this.nationality = nationality;
}




@Override
public String toString() {
	return "Player [id=" + id + ", name=" + name + ", skill=" + skill + ", dateOfBirth=" + dateOfBirth
			+ ", numberOfMatches=" + numberOfMatches + ", runs=" + runs + ", wickets=" + wickets + ", nationality="
			+ nationality + "]";
}








}
