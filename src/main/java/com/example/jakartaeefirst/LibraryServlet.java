package com.example.jakartaeefirst;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;

@WebServlet
public class LibraryServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter pw = response.getWriter();
        try {
            Class.forName("org.postgresql.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        try {
            Connection conn = DriverManager.getConnection(
                    "jdbc.postgresql://localhost:5432/jakarta_ee_db",
                    "neil", "");
            Statement stat = conn.createStatement();
            ResultSet rs = stat.executeQuery("SELECT title FROM books");
            while (rs.next()) {
                pw.println(rs.getString("title"));
            }
            stat.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}