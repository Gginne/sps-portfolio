package com.google.sps.servlets;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;
import com.google.sps.servlets.models.Project;


/** Handles requests sent to the /hello URL. Try running a server and navigating to /hello! */
@WebServlet("/projects")
public class ProjectServlet extends HttpServlet {

    Project[] projectsArray;

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        populateProjects();
        Gson projectGson = new Gson();
        for(Project p: projects){
            
        }
        response.setContentType("text/html;");
        response.getWriter().println("<h1>Projects Go Here</h1>");
    }

    private void populateProjects() {
        projectsArray = { 
            new Project(
                "Photopres",
                "Photo-saving app built on mern stack",
                "https://github.com/Gginne/photopress",
                "http://photopress.herokuapp.com/"
            ),
            new Project(
                "WeatherMe",
                "Weather & forecast web app",
                "https://github.com/Gginne/weather-app",
                "https://weatherandme.netlify.app/"
            ),
            new Project(
                "Store202",
                "Online shoe store built in php",
                "https://github.com/Gginne/IT202/tree/master/project",
                "https://web.njit.edu/~gc348/IT202/project"
            ),
            new Project(
                "Expense tracker",
                "Expense tracking web app built in vanilla js",
                "https://github.com/Gginne/expense-tracker",
                "https://gginne.github.io/expense-tracker/"
            ),
            new Project(
                "Mixionary",
                "Dictionary web app",
                "https://github.com/Gginne/mixionary",
                "https://gginne.github.io/mixionary/"
            )
        };

       
    }
}