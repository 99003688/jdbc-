package com.ltts.model;

import java.util.ArrayList;

public class Team {

	int teamId;
	String teamname;
	String ownerName;
	String coachName;
	int playerId;
	
	ArrayList<Player> list = new ArrayList<Player>();
	
	
	
	public Team(int teamId, String teamname, String ownerName, String coachName, int playerId, ArrayList<Player> list) {
		super();
		this.teamId = teamId;
		this.teamname = teamname;
		this.ownerName = ownerName;
		this.coachName = coachName;
		this.playerId = playerId;
		this.list = list;
	}



	public int getTeamId() {
		return teamId;
	}



	public void setTeamId(int teamId) {
		this.teamId = teamId;
	}



	public String getTeamname() {
		return teamname;
	}



	public void setTeamname(String teamname) {
		this.teamname = teamname;
	}



	public String getOwnerName() {
		return ownerName;
	}



	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}



	public String getCoachName() {
		return coachName;
	}



	public void setCoachName(String coachName) {
		this.coachName = coachName;
	}



	public int getPlayerId() {
		return playerId;
	}



	public void setPlayerId(int playerId) {
		this.playerId = playerId;
	}



	public ArrayList<Player> getList() {
		return list;
	}



	public void setList(ArrayList<Player> list) {
		this.list = list;
	}



	@Override
	public String toString() {
		return "Team [teamId=" + teamId + ", teamname=" + teamname + ", ownerName=" + ownerName + ", coachName="
				+ coachName + ", playerId=" + playerId + ", list=" + list + "]";
	}
	
	
}
