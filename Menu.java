package microblog;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Iterator;

public class Menu {
    static Scanner keyboard = new Scanner(System.in);


    public static void main(String[] args) {

        ArrayList<User> users = new ArrayList<User>();

        String currentUser = null;

        while (true) {
            System.out.println("Main Menu");
            System.out.println("1) Create a new user");
            System.out.println("2) Become an existing user");
            System.out.println("3) Create a post as the current user");
            System.out.println("4) Print all posts");
            System.out.println("5) Print all users");
            System.out.println("You are currently " + currentUser + ". What would you like to do?");
            int menuNumber = keyboard.nextInt();
            keyboard.skip("\n");

            if (menuNumber == 1) {
                System.out.println("What is the user name?");
                String userName = keyboard.nextLine();
                System.out.println("What is the URL to your avatar?");
                String avatarURL = keyboard.nextLine();
                System.out.println("What is your full name?");
                String realName = keyboard.nextLine();
                System.out.println("What is your email address?");
                String email = keyboard.nextLine();

                users.add(new User(avatarURL, userName, realName, email));

            } else if (menuNumber == 2) {
                System.out.println("Which of the following users are you?");
                for (int c = 0; c < users.size(); c++) {
                    System.out.println((c + 1) + ")" + users.get(c).getUserInfo());
                }

                //pick number, set it as currentUser


            } else if (menuNumber == 3) {
                System.out.println("This should be the last post by the user");
                //print out last post by currentUser
                System.out.println("Please type your new post below.");
                String postContent = keyboard.nextLine();

            } else if (menuNumber == 4) {
                for (int c = 0; c < users.size(); c++) {
                    System.out.println((c + 1) + ")" + users.get(c).getUserInfo());
                }

            } else if (menuNumber == 5) {

                for (int counter = 0; counter < users.size(); counter++) {
                    System.out.println(counter + "." + users.get(counter).getUserInfo());
                }


            } else {
                System.out.print("That is not a valid option.");
            }

        }
    }
}
