package main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Date;
import java.sql.SQLException;

import com.ltts.dao.PlayerDaoImplementation;
import com.ltts.dao.teamDaoImplementation;
import com.ltts.model.Player;
import com.ltts.model.Team;

public class Application {

	public static void main(String[] args) throws SQLException, Exception, IOException {
		// TODO Auto-generated method stub
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Select your choice:");
		System.out.println("1. Insert \n 2. Search (Retrieve) \n 3. Update the Player and Team \n 4.View all the players \n 5. View all players (based on Team) \n 6. View all players (based on skill & Team)");
	    int n=Integer.parseInt(br.readLine()); 
	    if(n==1)
	    {
	    	System.out.println("Enter the Player Id: "); 
	    	int pid=Integer.parseInt(br.readLine());
	    	System.out.println("Enter the Player Name: ");
            String pname=br.readLine();
            System.out.println("Enter date of birth");
            Date pdob=Date.valueOf(br.readLine());
            System.out.println("Enter the Player skill: ");
            String pskill=br.readLine();
            System.out.println("Enter the Team Id: "); 
	    	int pteamid=Integer.parseInt(br.readLine());
	        System.out.println("Enter the Player Number of Matches: ");
	        int pnum=Integer.parseInt(br.readLine());
	        System.out.println("Enter the Player Wickets: ");
	        int pwic=Integer.parseInt(br.readLine());
	        System.out.println("Enter the Player Nationality: ");
            String pnationality=br.readLine();
	        System.out.println("Enter the Player runs: ");
	        int pruns=Integer.parseInt(br.readLine());
	        
	       Player p= new Player(pid, pname, pskill, pdob, pnum, pruns, pwic, pnationality);
	       PlayerDaoImplementation pd= new PlayerDaoImplementation();
	       pd.add(p);
	       
	       System.out.println("Enter the team Id: "); 
	    	int tid=Integer.parseInt(br.readLine());
	    	System.out.println("Enter the Team Name: ");
           String tname=br.readLine();
           System.out.println("Enter the Owner Name: ");
           String towner=br.readLine();
           System.out.println("Enter the Coach Name: ");
           String tcoach=br.readLine();
           System.out.println("Enter the Player Id: "); 
	    	int tteamid=Integer.parseInt(br.readLine());
           
	    	Team t= new Team(tteamid, tname, towner, tcoach, tteamid, null);
	    	teamDaoImplementation td= new teamDaoImplementation();
	    	td.add(t);
	    	
	}

}
}
