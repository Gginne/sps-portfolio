package com.google.sps.servlets;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.sps.servlets.models.Project;

/** Handles requests sent to the /hello URL. Try running a server and navigating to /hello! */
@WebServlet("/projects")
public class ProjectServlet extends HttpServlet {

 private ArrayList<Project> projects;

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        makeProjects();
        response.setContentType("text/html;");
        response.getWriter().println("<h1>Projects Go Here</h1>");
    }

    private void makeProjects() {
        Project Photopress = new Project(
            "Photopres"
        )
    }
}