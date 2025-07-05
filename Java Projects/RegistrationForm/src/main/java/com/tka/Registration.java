package com.tka;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/user-registration")
public class Registration extends HttpServlet {

    private static final long serialVersionUID = 1L;
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    	
        String fname = req.getParameter("fname");
        String lname = req.getParameter("lname");
        String email = req.getParameter("email");
        String mobno = req.getParameter("mobno");
        String gender = req.getParameter("gender");
        String city = req.getParameter("city");
        String state = req.getParameter("state");
        String country = req.getParameter("country");
        String education = req.getParameter("education");
        String tenth = req.getParameter("tenth");
        String twelfth = req.getParameter("twelfth");
        String dob = req.getParameter("dob");
        String skills = req.getParameter("skills");
        String password = req.getParameter("password");

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection c = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/users?useSSL=false", "root", "1111");

            System.out.println("Connected to database");

            String query = "INSERT INTO registration_form (fname, lname, email, mob_no, gender, city, state, country, education, tenth, twelfth, dob, skills, password) "
                         + "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement ps = c.prepareStatement(query);
            ps.setString(1, fname);
            ps.setString(2, lname);
            ps.setString(3, email);
            ps.setString(4, mobno);
            ps.setString(5, gender);
            ps.setString(6, city);
            ps.setString(7, state);
            ps.setString(8, country);
            ps.setString(9, education);
            ps.setString(10, tenth);
            ps.setString(11, twelfth);
            ps.setString(12, dob);
            ps.setString(13, skills);
            ps.setString(14, password);

            ps.executeUpdate();
            c.close();

            System.out.println("Data inserted successfully");
            resp.getWriter().println("<p>Registration Successful!</p>");

        } catch (Exception e) {
            e.printStackTrace();
            resp.getWriter().println("<p>Error while inserting data.</p>");
            System.out.println(e.getMessage());
        }
    }
}
