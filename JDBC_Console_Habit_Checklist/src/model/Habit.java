package model;

public class Habit {
	private int id;
	private String habitName;
	private boolean isCompleted;
	
	public Habit() {}
	
	public Habit(int id, String habitName, boolean isCompleted) {
		this.id=id;
		this.habitName=habitName;
		this.isCompleted=isCompleted;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id=id;
	}
	public String getHabitName() {
		return habitName;
	}
	public void setHabitName(String habitName) {
		this.habitName=habitName;
	}
	public boolean isCompleted() {
		return isCompleted;
	}
	public void setCompleted(boolean isCompleted) {
		this.isCompleted=isCompleted;
	}

}
