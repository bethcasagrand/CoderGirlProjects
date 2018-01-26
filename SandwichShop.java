import static java.lang.System.out;
import java.util.Scanner;

public class SandwichShop
{
    public static void main(String[] arg)
    {
        // Don't change these lines
        Scanner keyboard = new Scanner (System.in);
        int goalForVeggies = 50;
        int goalForBurgers = 250;
        int goalForSubs = 180;
        int goalForSoup = 70;

        out.println("Checking sales goals.");
        out.println("The sales goal for veggie sandwiches is 50.");
        out.println("How many veggie sandwiches were sold today?");
        goalForVeggies = keyboard.nextInt();

        if (goalForVeggies >= 50) {
            out.println("Meets goal!");
        } else {
            out.println("Fell short.");
        }

        out.println("The sales goal for hamburgers is 250.");
        out.println("How many hamburgers were sold today?");
        goalForBurgers = keyboard.nextInt();

        if (goalForBurgers >= 250) {
            out.println("Meets goal!");
        } else {
            out.println("Fell short.");
        }

        out.println("The sales goal for sub sandwiches is 180.");
        out.println("How many sub sandwiches were sold today?");
        goalForSubs = keyboard.nextInt();

        if (goalForSubs >= 180) {
            out.println("Meets goal!");
        } else {
            out.println("Fell short.");
        }

        out.println("The sames goal for soups is 70.");
        out.println("How many bowls of soup were sold today?");
        goalForSoup = keyboard.nextInt();

        if (goalForSoup >= 70) {
            out.println("Meets goal!");
        } else {
            out.println ("Fell short.");
        }

        if (goalForVeggies >= 50 && goalForBurgers >= 250 && goalForSubs >= 180 && goalForSoup >= 70) {
            out.println("Made goal for everything!"); }

        }
}
