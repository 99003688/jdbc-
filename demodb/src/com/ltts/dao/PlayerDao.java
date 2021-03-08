package com.ltts.dao;
import java.util.List;
import java.sql.SQLException;

import com.ltts.model.Player;

public interface PlayerDao {

	public int add(Player p) throws SQLException;
	
	public void delete(int id) throws SQLException;
	
	public Player getPlayer(int id) throws SQLException;
	
	public List<Player>getPlayers() throws SQLException;
	
	public void update(Player p1) throws SQLException;
	

}
