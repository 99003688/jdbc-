package com.ltts.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.jdbc.util.DatabaseConnection;
import com.ltts.model.Player;

public class PlayerDaoImplementation implements PlayerDao {
	
	static Connection con=DatabaseConnection.getConnection();

	@Override
	public int add(Player p) throws SQLException {
		// TODO Auto-generated method stub
		String query 
        = "insert into Player(name, " + "skill, " + "dateOfBirth, "+ " numberOfMatches,"  +"runs, " + " wickets, " + "nationality) VALUES (?, ?, ?, ?, ?, ?, ?)"; 
		PreparedStatement ps = con.prepareStatement(query); 
    ps.setString(1, p.getName()); 
    ps.setString(2, p.getSkill()); 
    ps.setDate(3, (Date) p.getDateOfBirth());
    ps.setInt(4, p.getNumberOfMatches());
    ps.setInt(5, p.getRuns());
    ps.setInt(6, p.getWickets());
    ps.setString(7, p.getNationality()); 
    
    int n = ps.executeUpdate(); 
    return n;
		
	}

	@Override
	public void delete(int id) throws SQLException {
		// TODO Auto-generated method stub
		  String query = "delete from Player where id =?"; 
      PreparedStatement ps = con.prepareStatement(query); 
      ps.setInt(1, id); 
      ps.executeUpdate(); 
		
	}

	@Override
	public Player getPlayer(int id) throws SQLException {
		// TODO Auto-generated method stub
		 String query 
         = "select * from Player where id= ?"; 
     PreparedStatement ps 
         = con.prepareStatement(query); 

     ps.setInt(1, id); 
     java.util.Date dateOfBirth = null;
	Player p = new Player(id, query, query, dateOfBirth, id, id, id, query); 
     ResultSet rs = ps.executeQuery(); 
     boolean check = false; 

     while (rs.next()) { 
         check = true; 
         p.setid(rs.getInt("Id")); 
         p.setName(rs.getString("Name")); 
         p.setSkill(rs.getString("Skills"));
         p.setDateOfBirth(rs.getDate("DateOfBirth")); 
         p.setNumberOfMatches(rs.getInt("NumberOfMatches"));
         p.setRuns(rs.getInt("Runs"));
         p.setWickets(rs.getInt("Wickets"));
         p.setNationality(rs.getString("Nationality"));
     } 

     if (check == true) { 
         return p; 
     } 
     else
         return null; 
 } 
	

	@Override
	public List<Player> getPlayers() throws SQLException {
		// TODO Auto-generated method stub
		String query = "select * from Player"; 
        PreparedStatement ps 
            = con.prepareStatement(query); 
        ResultSet rs = ps.executeQuery(); 
        List<Player> ls = new ArrayList<Player>(); 
  
        while (rs.next()) { 
            Player p = new Player(0, query, query, null, 0, 0, 0, query); 
            p.setid(rs.getInt("Id")); 
            p.setName(rs.getString("Name")); 
            p.setSkill(rs.getString("Skills"));
            p.setDateOfBirth(rs.getDate("DateOfBirth")); 
            p.setNumberOfMatches(rs.getInt("NumberOfMatches"));
            p.setRuns(rs.getInt("Runs"));
            p.setWickets(rs.getInt("Wickets"));
            p.setNationality(rs.getString("Nationality"));
            ls.add(p); 
        } 
        return ls; 
	
	}

	public void update(Player p1) throws SQLException{

        String query 
            = "update Player set name=?, "
              + " skill = ? where id = ?"; 
        PreparedStatement ps 
            = con.prepareStatement(query); 
        ps.setString(1, p1.getName()); 
        ps.setString(2, p1.getSkill()); 
        ps.setInt(3, p1.getid()); 
        ps.executeUpdate(); 
	}
	
}
