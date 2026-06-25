package controller;

import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dal.HabitDAL;
import model.Habit;

@WebServlet("/habits")
public class HabitController extends HttpServlet {
    private static final long serialVersionUID = 1L;
    private HabitDAL habitDAL;

    @Override
    public void init() throws ServletException {
        this.habitDAL = new HabitDAL();
    }
    protected void doGet(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {

        List<Habit> habitList = habitDAL.getAllHabits();

        request.setAttribute("habits", habitList);
        
        request.getRequestDispatcher("/dashboard.jsp").forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {
        
        String action = request.getParameter("action");
        
        if ("add".equals(action)) {
            String name = request.getParameter("habitName");
            if (name != null && !name.trim().isEmpty()) {
                habitDAL.addHabit(name); 
            }
        }
        else if("update".equals(action)) {
        	String idStr= request.getParameter("habitId");
        	if (idStr!= null) {
        		int id= Integer.parseInt(idStr);
        		habitDAL.markAsDone(id);
        	}
        }
        response.sendRedirect(request.getContextPath() + "/habits");
    }
}