package com.ltts.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.jdbc.util.DatabaseConnection;
import com.ltts.model.Team;

public class teamDaoImplementation implements TeamDao {
	static Connection con=  DatabaseConnection.getConnection();

	@Override
	public int add(Team p) throws SQLException {
		// TODO Auto-generated method stub
		 String query  = "insert into Player(teamId, " + "teamname, " + "ownername, "+ " coachName,"  +"playerId) VALUES (?, ?, ?, ?, ?)"; 
     PreparedStatement ps = con.prepareStatement(query); 
     ps.setInt(1,p.getPlayerId());
     ps.setString(2, p.getTeamname()); 
     ps.setString(3, p.getOwnerName()); 
     ps.setString(4,p.getCoachName());
     ps.setInt(5,p.getPlayerId());
     
     int n = ps.executeUpdate(); 
     return n;
		
	}

	@Override
	public void delete(int id) throws SQLException {
		// TODO Auto-generated method stub
		  String query 
          = "delete from Player where PlayerId =?"; 
      PreparedStatement ps 
          = con.prepareStatement(query); 
      ps.setInt(1, id); 
      ps.executeUpdate(); 
		
	}

	@Override
	public Team getTeam(int id) throws SQLException {
		// TODO Auto-generated method stub
		 String query 
         = "select * from employee where emp_id= ?"; 
     PreparedStatement ps 
         = con.prepareStatement(query); 

     ps.setInt(1, id); 
     Team t = new Team(id, query, query, query, id, null); 
     ResultSet rs = ps.executeQuery(); 
     boolean check = false; 

     while (rs.next()) { 
         check = true; 
         t.setTeamId(rs.getInt("TeamId"));
        t.setTeamname(rs.getString("TeamName")); 
         t.setOwnerName(rs.getString("OwnerName")); 
         t.setCoachName(rs.getString("CoachName"));
         t.setPlayerId(rs.getInt("Playerid"));
     } 
     if (check == true) { 
         return t; 
     } 
     else
         return null; 
 } 

	@Override
	public List<Team> getTeam() throws SQLException {
		// TODO Auto-generated method stub
		 String query = "select * from employee"; 
	        PreparedStatement ps 
	            = con.prepareStatement(query); 
	        ResultSet rs = ps.executeQuery(); 
	        List<Team> ls = new ArrayList<Team>(); 
	  
	        while (rs.next()) { 
	            Team t = new Team(0, query, query, query, 0, null); 
	            t.setTeamId(rs.getInt("TeamId"));
	            t.setTeamname(rs.getString("TeamName")); 
	             t.setOwnerName(rs.getString("OwnerName")); 
	             t.setCoachName(rs.getString("CoachName"));
	             t.setPlayerId(rs.getInt("Playerid"));
	        
	            ls.add(t); 
	        }
	       
		return ls;
	}


	public void update (Team t1) throws SQLException {
		// TODO Auto-generated method stub
		 String query 
         = "update Team set Teamname=?, "
           + " OwnerName= ? where PlyerId = ?"; 
     PreparedStatement ps 
         = con.prepareStatement(query); 
     ps.setString(1, t1.getTeamname()); 
     ps.setString(2, t1.getOwnerName()); 
     ps.setInt(3, t1.getPlayerId()); 
     ps.executeUpdate(); 
		
	}

}
