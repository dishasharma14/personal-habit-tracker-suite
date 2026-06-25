Personal Habit Tracker Suite

A 3-part Java development suite demonstrating modern backend architectures, ranging from low-level database drivers to enterprise object-relational mapping tools.



💻 Project 1: JDBC Console Habit Checklist

A terminal-based command-line interface application that allows users to manage their daily habit goals, tracking live completion records directly within a local database.



🛠️ Tech Stack \& Concepts Covered

Java SE Core Logic \& Scanner UI

JDBC (Java Database Connectivity) for explicit database connection lifecycles

Data Access Layer (DAL) Architecture separating database queries from application logic

MySQL relational data storage using PreparedStatement to mitigate SQL injection

📋 Prerequisites

Java JDK 17 or higher

MySQL Server instance running locally

MySQL Connector/J Driver (mysql-connector-j-x.x.x.jar) added to the build path

🚀 How to Run

Clone the repository.

Execute the setup SQL script found inside your database configuration to build the habit\_db database and habits table.

Import the project into Spring Tool Suite (STS) or any Eclipse-based IDE.

Update the database connection credentials inside dal.HabitDAL.

Run main.MainApp as a Java Application.

