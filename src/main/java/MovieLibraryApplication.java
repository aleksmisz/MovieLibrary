import org.models.MovieLibrary;
import utils.MenuUtils;
import utils.UserInputUtils;

public class MovieLibraryApplication {
    public static void main(String[] args) {

        MovieLibrary movieLibrary = new MovieLibrary();
        movieLibrary.setMoviesList();
        while (true) {

            MenuUtils.print();
            switch (UserInputUtils.getMenuOptionsFromUser()) {
                case DISPLAY_INFORMATION_FOR_RANDOM_MOVIE :
                    movieLibrary.getRandomMovieInformation();
                    break;
                case DISPLAY_ACTOR_MOVIES:
                    movieLibrary.printActorFilmography();
                    break;
                case QUIT:
                    System.out.println("BYEEEEEE!!!!!!");
                    System.exit(1);
            }
        }

//        UserInputUtils userInputUtils = new UserInputUtils();

    }
}
