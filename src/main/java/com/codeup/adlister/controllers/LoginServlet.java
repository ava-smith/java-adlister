package com.codeup.adlister.controllers;

import com.codeup.adlister.dao.DaoFactory;
import com.codeup.adlister.dao.MySQLUsersDao;
import com.mysql.cj.jdbc.Driver;

import com.codeup.adlister.models.User;
import daos.Config;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.*;
import java.io.IOException;
import java.sql.*;

@WebServlet(name = "controllers.LoginServlet", urlPatterns = "/login")
public class LoginServlet extends HttpServlet {
    private Connection connection = null;

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        if (request.getSession().getAttribute("user") != null) {
            response.sendRedirect("/profile");
            return;
        }
        request.getRequestDispatcher("/WEB-INF/login.jsp").forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        boolean validAttempt = false;
//        Config config = new Config();
//        try {
//            DriverManager.registerDriver(new Driver());
//            connection = DriverManager.getConnection(
//                    config.getUrl(),
//                    config.getUser(),
//                    config.getPassword()
//            );
//        } catch (SQLException e) {
//            throw new RuntimeException("Error connecting to the database!", e);
//        }
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        // TODO: find a record in your database that matches the submitted password
//        String passQuery = "SELECT password FROM users WHERE password=?";
//        try {
//            PreparedStatement stmt = connection.prepareStatement(passQuery);
//            stmt.setString(1, password);
//            ResultSet rs = stmt.executeQuery();
//            rs.next();
//            if(rs.getString("password").equals(password)) {
//                validAttempt = true;
//            }
//        } catch (SQLException e) {
//            throw new RuntimeException("Wrong password", e);
//        }
        // TODO: make sure we find a user with that username
//        String userQuery = "SELECT username FROM users WHERE username=?";
//        try {
//            PreparedStatement stmt = connection.prepareStatement(userQuery);
//            stmt.setString(1, username);
//            ResultSet rs = stmt.executeQuery();
//            rs.next();
//            if(rs.getString("username").equals(username)) {
//                validAttempt = true;
//            }
//        } catch (SQLException e) {
//            throw new RuntimeException("Wrong username", e);
//        }
        // TODO: check the submitted password against what you have in your database

        User user = DaoFactory.getUsersDao().findByUsername(username);

        if(user == null) {
            response.sendRedirect("/login");
            return;
        }
        if (password.equals(user.getPassword())) {
            validAttempt = true;
        }

        if (validAttempt) {
            // TODO: store the logged in user object in the session, instead of just the username
            request.getSession().setAttribute("user", user);
            response.sendRedirect("/profile");
        } else {
            response.sendRedirect("/login");
        }
    }
}
