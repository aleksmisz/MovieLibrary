package org.models;

import java.util.List;

public class Movie {
    private String title;
    private Director director;
    private List<Actor> actorList;

    public Movie(String title, Director director, List<Actor> actorList) {
        this.title = title;
        this.director = director;
        this.actorList = actorList;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Director getDirector() {
        return director;
    }

    public void setDirector(Director director) {
        this.director = director;
    }

    public List<Actor> getActorList() {
        return actorList;
    }

    public void setActorList(List<Actor> actorList) {
        this.actorList = actorList;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "title='" + title + '\'' +
                ", director=" + director +
                ", actorList=" + actorList +
                '}';
    }
}
