Personal Habit Tracker Suite
A 3-part Java development suite demonstrating modern backend architectures, ranging from low-level database drivers to enterprise object-relational mapping tools.

💻 Project 1: JDBC Console Habit Checklist
A terminal-based command-line interface application that allows users to manage their daily habit goals, tracking live completion records directly within a local database.

🛠️ Tech Stack & Concepts Covered
Java SE Core Logic: Standard input handling using Scanner UI.

JDBC (Java Database Connectivity): Explicit management of database connection lifecycles.

Data Access Layer (DAL) Architecture: Separation of database queries from core application logic.

MySQL Storage: Secure data querying using PreparedStatement to prevent SQL injection.

🚀 How to Run
Clone the repository.

Execute the setup SQL script found inside your database configuration to build the habit_db database and habits table.

Import the project into Spring Tool Suite (STS) or any Eclipse-based IDE.

Update the database connection credentials inside dal.HabitDAL.

Run main.MainApp as a Java Application.

🌐 Project 2: Servlet & JSP Web Dashboard
A dynamic Model-View-Controller (MVC) web application that brings the habit tracker to the browser, offering an interactive UI to track habit completion statuses in real-time.

🛠️ Tech Stack & Concepts Covered
Java Enterprise Edition (EE): Multi-layered web architecture using Servlets for controller logic.

JavaServer Pages (JSP): Dynamic front-end rendering utilizing embedded Java expressions (<%= %>).

State & Request Redirection: Clean implementation of HTTP request dispatching and response routing.

Tomcat Server Integration: Deployment and execution mapping via clean deployment descriptor configuration (web.xml).

🚀 How to Run
Ensure a Tomcat v9.0 Server (or higher) instance is configured inside your IDE.

Right-click the Servlet_JSP_Web_Dashboard project folder.

Select Run As ➔ Run on Server.

Access the live dashboard via your browser at:

http://localhost:8080/Servlet_JSP_Web_Dashboard/habits

📋 Prerequisites (Global Suite)
Java JDK 17 or higher

MySQL Server instance running locally

Apache Tomcat v9.0+ web server environment

MySQL Connector/J Driver (mysql-connector-j-x.x.x.jar) added to the build path / deployment assembly
