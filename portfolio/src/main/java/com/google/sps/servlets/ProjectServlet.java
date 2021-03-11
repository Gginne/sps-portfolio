package com.google.sps.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;
import com.google.sps.servlets.models.Project;


/** Handles requests sent to the /hello URL. Try running a server and navigating to /hello! */
@WebServlet("/projects")
public class ProjectServlet extends HttpServlet {

    ArrayList<Project> projects = new ArrayList<Project>();

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        if(projects.isEmpty())
            populateProjects();
        
        
        Gson projectGson = new Gson();
        Object[] projectsArr = projects.toArray();
        String projectJsonString = projectGson.toJson(projectsArr);

        PrintWriter out = response.getWriter();
        response.setContentType("application/json");
        response.setCharacterEncoding("UTF-8");
        out.print(projectJsonString);
        out.flush();
    }

    private void populateProjects() {
        Project Photopress = new Project(
            "Photopress",
            "Photo-saving app built on mern stack",
            "https://github.com/Gginne/photopress",
            "http://photopress.herokuapp.com/"
        );
        projects.add(Photopress);
        
        Project WeatherMe = new Project(
            "WeatherMe",
            "Weather & forecast web app",
            "https://github.com/Gginne/weather-app",
            "https://weatherandme.netlify.app/"
        );
        projects.add(WeatherMe);

        Project Store202 = new Project(
            "Store202",
            "Online shoe store built in php",
            "https://github.com/Gginne/IT202/tree/master/project",
            "https://web.njit.edu/~gc348/IT202/project"
        );
        projects.add(Store202);

        Project ExpenseTrack = new Project(
            "Expense Tracker",
            "Expense tracking web app built in vanilla js",
            "ExpenseTrack",
            "https://github.com/Gginne/expense-tracker",
            "https://gginne.github.io/expense-tracker/"
        );
        
        projects.add(ExpenseTrack);
        
        Project Mixionary = new Project(
            "Mixionary",
            "Dictionary web app",
            "https://github.com/Gginne/mixionary",
            "https://gginne.github.io/mixionary/"
        );
        
        projects.add(Mixionary);
        
    }

    
}