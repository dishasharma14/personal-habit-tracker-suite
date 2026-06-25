package main;

import dal.HabitDAL;
import model.Habit;
import java.util.List;
import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        HabitDAL dal = new HabitDAL();
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.println("\n--- JDBC CONSOLE HABIT CHECKLIST ---");
            System.out.println("1. View Today's Habits");
            System.out.println("2. Add a New Habit");
            System.out.println("3. Check-off a Habit (Mark as Done)");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            
            int choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) {
                case 1:
                    System.out.println("\n--- Your Habits ---");
                    List<Habit> habits = dal.getAllHabits();
                    if (habits.isEmpty()) {
                        System.out.println("No habits added yet!");
                    } else {
                        for (Habit h : habits) {
                            String status = h.isCompleted() ? "[Done]" : "[Pending]";
                            System.out.println(h.getId() + ". " + h.getHabitName() + " " + status);
                        }
                    }
                    break;
                    
                case 2:
                    System.out.print("Enter habit name: ");
                    String name = scanner.nextLine();
                    dal.addHabit(name);
                    System.out.println("Habit added successfully!");
                    break;
                    
                case 3:
                    System.out.print("Enter the Habit ID to complete: ");
                    int id = scanner.nextInt();
                    dal.markAsDone(id);
                    System.out.println("Habit marked as completed!");
                    break;
                    
                case 4:
                    System.out.println("Exiting tracker...");
                    scanner.close();
                    System.exit(0);
                    
                default:
                    System.out.println("Invalid option! Please try again.");
            }
        }
    }
}