package dal;

import model.Habit;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class HabitDAL {
	private final String url= "jdbc:mysql://localhost:3306/habit_db";
	private final String username = "root"; 
    private final String password = "admin";
    
    private Connection getConnection() throws SQLException {
    	return DriverManager.getConnection(url, username, password);
    }
    
    public void addHabit(String habitName) {
    	String query= "insert into habits (habit_name, is_completed) values (?, false)";
    	try (Connection conn= getConnection();
    		PreparedStatement stmt= conn.prepareStatement(query)){
    		
    		stmt.setString(1, habitName);
    		stmt.executeUpdate(); 
    	}
    	catch (SQLException e) {
    		e.printStackTrace();
    	}
    }
    
    public List<Habit> getAllHabits(){
    	List<Habit> habits= new ArrayList<>();
    	String query= "select * from habits";
    	try (Connection conn= getConnection();
    		PreparedStatement stmt= conn.prepareStatement(query);
    		ResultSet rs= stmt.executeQuery()){
    		
    		while(rs.next()) {
    			Habit habit= new Habit(rs.getInt("id"), rs.getString("habit_name"), rs.getBoolean("is_completed"));
    			habits.add(habit);
    		}
    	} catch (SQLException e) {
    		e.printStackTrace();
    }
    	return habits;

}

    public void markAsDone(int id) {
        String query = "update habits set is_completed = true where id = ?";
        try (Connection conn = getConnection();
             PreparedStatement stmt = conn.prepareStatement(query)) {
        	stmt.setInt(1, id);
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
