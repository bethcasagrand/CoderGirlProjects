package microblog;

import java.util.Scanner;
import java.util.ArrayList;

public class Menu {
    static Scanner keyboard = new Scanner(System.in);


    public static void main(String[] args) {

        ArrayList<User> users = new ArrayList<User>();
        ArrayList<Post> posts = new ArrayList<Post>();

        boolean finish = false;
        int currentUser = 0;
        int postNumber = 0;

        while (!finish) {
            System.out.println("Main Menu");
            System.out.println("1) Create a new user");
            System.out.println("2) Become an existing user");
            System.out.println("3) Create a post as the current user");
            System.out.println("4) Print all posts");
            System.out.println("5) Print all users");
            System.out.println("6) Exit");

            //menu options

            if (users.size() > 0)
            {
                System.out.println("You are currently user " + users.get(currentUser).getUserName() + ". What would you like to do?");
            }

            //will only print current user if users are stored


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

                //stores new user into arraylist


            } else if (menuNumber == 2) {
                System.out.println("Which of the following users are you?");
                for (int c = 0; c < users.size(); c++) {
                    System.out.println((c + 1) + ")" + users.get(c).getUserName());
                }
                    currentUser = keyboard.nextInt() - 1;
                //prints out all users, assigns current user based on number
                

            } else if (menuNumber == 3) {

                System.out.println("Please enter your posts:");
                    String post = keyboard.nextLine();
                    posts.add(new Post(users.get(currentUser).getUserName(), post, postNumber));
                    postNumber++;
                    }

                    //adds new post for current user


            else if (menuNumber == 4) {
                for (int c = posts.size()-1; c >= 0; c --){
                    posts.get(c).printPost();
                }

                //prints all the posts counting down

            } else if (menuNumber == 5) {

                for (int counter = 0; counter < users.size(); counter++) {
                    System.out.println(counter + 1 + "." + users.get(counter).getUserName());
                }
                //prints all the users


            } else if (menuNumber == 6) {
                finish = true;
                //exits process


            } else {
                System.out.print("That is not a valid option.");
            }

        }
    }
}
