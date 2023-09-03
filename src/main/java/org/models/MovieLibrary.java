package org.models;

import utils.RandomDataProvider;
import utils.UserInputUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class MovieLibrary {
    private static List<Movie> moviesList;
    public void setMoviesList(){
//        moviesList = new ArrayList<>();
//        Director director = new Director("Janusz", "Brajanowy");
//        Actor actor1 = new Actor("Russel", "Crow");
//        Actor actor2 = new Actor("Russel", "COW");
//
//        List<Actor> actorList = new ArrayList<>();
//        actorList.add(actor1);
//        actorList.add(actor2);
//
//        Movie movie = new Movie("Gladiator", director, actorList);

        moviesList = new ArrayList<>();

        Director r_Scott = new Director("Ridley","Scott");
        Director g_Verbinski = new Director("Gore","Verbinski");
        Director q_Tarantino = new Director("Quentin","Tarantino");
        Director p_Jackson = new Director("Peter","Jackson");

        Actor r_Crowe = new Actor("Russel", "Crowe");
        Actor o_Reed = new Actor("Oliver", "Reed");
        Actor d_Jacob = new Actor("Derek", "Jacob");
        Actor j_Deep = new Actor("Johnny", "Deep");
        Actor o_Bloom = new Actor("Orlando", "Bloom");
        Actor k_Knightley = new Actor("Keira", "Knightley");
        Actor j_Travolta = new Actor("John", "Travolta");
        Actor u_Thurman = new Actor("Uma", "Thurman");
        Actor h_Keitel = new Actor("Harvey", "Keitel");
        Actor t_Cruze = new Actor("Tom", "Cruise");

        moviesList.add(new Movie("Gladiator",r_Scott, List.of(r_Crowe, j_Deep)));
        moviesList.add(new Movie("Pirates of the Caribbean",g_Verbinski, List.of(o_Reed, j_Deep)));
        moviesList.add(new Movie("Pulp Fiction",q_Tarantino, List.of(j_Travolta, u_Thurman)));
        moviesList.add(new Movie("Hobbit - An Unexpected Jorney",r_Scott, List.of(k_Knightley, d_Jacob)));
        moviesList.add(new Movie("Poranek Kojota",p_Jackson, List.of(r_Crowe, o_Bloom)));
        moviesList.add(new Movie("Transformers",q_Tarantino, List.of(r_Crowe, d_Jacob)));
        moviesList.add(new Movie("Top Gun",r_Scott, List.of(r_Crowe, t_Cruze)));
        moviesList.add(new Movie("Desperado",r_Scott, List.of(r_Crowe, o_Bloom)));
        moviesList.add(new Movie("Mission Impossible",p_Jackson, List.of(r_Crowe, t_Cruze)));
        moviesList.add(new Movie("Forest Gump",g_Verbinski, List.of(o_Reed, h_Keitel)));
    }

    public static List<Movie> getMoviesList() {
        return moviesList;
    }

    public static void setMoviesList(List<Movie> moviesList) {
        MovieLibrary.moviesList = moviesList;
    }

    public void printActorFilmography() {
        Actor actor = UserInputUtils.getActorFromUser();
        List<String> actorFilmographyList = getActorFilmographyList(actor);
        if (actorFilmographyList.isEmpty()) {
            System.out.println(actor + " didn't play in any movie from library.");
        } else {
            System.out.println("Actor " + actor + " have played in movies:");
            String separator = "";

            for (String movie : actorFilmographyList) {
                System.out.print(separator + movie);
                separator = ", ";
            }
        }
    }

    private List<String> getActorFilmographyList(Actor actorToFind) {
        Predicate<Movie> movieCheck = movie -> movie.getListOfActors().stream()
                .anyMatch(actor -> actor.getFirstName().equals(actorToFind.getFirstName()) &&
                        actor.getLastName().equals(actorToFind.getLastName()));

        return moviesList.stream()
                .filter(movieCheck)
                .map(Movie::getTitle)
                .collect(Collectors.toList());
    }

    public void getRandomMovieInformation() {
            System.out.println(moviesList.get(RandomDataProvider.getRandomMovieIndex()));
        }
    }
