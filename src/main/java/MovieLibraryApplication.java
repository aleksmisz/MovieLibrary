import utils.MenuUtils;
import utils.UserInputUtils;

public class MovieLibraryApplication {
    public static void main(String[] args) {
        UserInputUtils userInputUtils = new UserInputUtils();
        MenuUtils.print();
        switch (UserInputUtils.getMenuOptionsFromUser()){
            case DISPLAY_INFORMATION_FOR_RANDOM_MOVIE :
                //todo
                break;
            case DISPLAY_ACTOR_MOVIES:
                //todo
                break;
            case QUIT:
                System.out.println("BYEEEEEE!!!!!!");
                System.exit(1);
        }
    }
}
