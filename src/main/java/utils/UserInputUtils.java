package utils;

import org.models.MenuOptions;

import java.util.Scanner;

public class UserInputUtils{
    static private Scanner scanner = new Scanner(System.in);

    public static MenuOptions getMenuOptionsFromUser() {
        return MenuOptions.values()[gesSelectedOptionFromUser() -1];
    }

    private static int getIntigerFromUser() {

        while (!scanner.hasNext()){
            scanner.nextLine();
            System.out.println("THIS IS NOT AN INTIGER!!!!!! TRY AGAIN!!!!!!!");
        }
        return scanner.nextInt();
    }
    private static int gesSelectedOptionFromUser(){

        int result = getIntigerFromUser();
        scanner.nextLine();
        if(result>0 && result< MenuOptions.values().length + 1) {
            return result;
        }
        else {
            System.out.println("WRONG OPTION SELECTED! TRY AGAIN");
            return gesSelectedOptionFromUser();
        }
    }
}
