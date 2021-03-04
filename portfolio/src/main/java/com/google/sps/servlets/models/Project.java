package com.google.sps.servlets.models;

public class Project{

    private String title;
    private String description;
    private String image;
    private String host;
    private String github;

    public Project(String title, String desc, String img, String host, String git){
        this.title = title;
        this.description = desc;
        this.image = img;
        this.host = host;
        this.github = git;
    }
    
}