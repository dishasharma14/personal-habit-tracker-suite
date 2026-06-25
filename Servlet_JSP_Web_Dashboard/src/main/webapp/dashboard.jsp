<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.util.List" %>
<%@ page import="model.Habit" %>
<!DOCTYPE html>
<html>
<head>
<title>Habit Tracker</title>
</head>
<body>

<h2>My Habit Tracker Dashboard</h2>
    
<form action="habits" method="POST">
<input type="hidden" name="action" value="add">
<input type="text" name="habitName" placeholder="Enter a new habit..." required>
<button type="submit">Add Habit</button>
</form>

<br>

<table border="1" cellpadding="5" cellspacing="0">
<thead>
<tr>
<th>Habit Name</th>
<th>Status</th>
</tr></thead>
<tbody>
<% List<Habit> habits = (List<Habit>) request.getAttribute("habits");
if (habits != null && !habits.isEmpty()) {
for (Habit h : habits) {
%>
<tr>
<td><%= h.getHabitName() %></td>
<td>
<% if (h.isCompleted()) { 
%>
Done <% } else { 
%>
Pending 
<form action="habits" method="POST" style="display:inline; margin-left:10px;">
<input type="hidden" name="action" value="update">
<input type="hidden" name="habitId" value="<%= h.getId() %>">
<button type="submit">Mark Done</button>
</form>
<% } %>
</td>
</tr>
<% }
} else { 
%>
<tr>
<td colspan="2">No habits tracked yet.</td>
</tr>
<% } %>
</tbody>
</table>

</body>
</html>