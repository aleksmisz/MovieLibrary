package org.models;

public enum MenuOptions {

    DISPLAY_INFORMATION_FOR_RANDOM_MOVIE(1),
    DISPLAY_ACTOR_MOVIES(2),
    QUIT(3);

    int action;
    MenuOptions(int action) {
        this.action = action;
    }

}
