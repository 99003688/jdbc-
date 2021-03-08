package com.ltts.dao;

import java.sql.SQLException;
import java.util.List;

import com.ltts.model.Team;

public interface TeamDao {

public int add(Team p) throws SQLException;
	
	public void delete(int id) throws SQLException;
	
	public Team getTeam(int id) throws SQLException;
	
	public List<Team>getTeam() throws SQLException;
	
	public void update(Team t1) throws SQLException;
}
