import static java.lang.System.out;
import java.util.Scanner;

public class Groceries
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        String groceryItem1;
        out.println("What is your first item? ");
        groceryItem1 = keyboard.nextLine ();

        String groceryItem2;
        out.println("What is your second item?");
        groceryItem2 = keyboard.nextLine ();

        String groceryItem3;
        out.println("What is your third and last item?");
        groceryItem3 = keyboard.nextLine ();

        int quantity1;
        out.println("How many " + groceryItem1 + " do you want?");
        quantity1 = keyboard.nextInt();
        keyboard.skip("\n");

        int quantity2;
        out.println("How many " + groceryItem2 + " do you want?");
        quantity2 = keyboard.nextInt();
        keyboard.skip("\n");

        int quantity3;
        out.println("How many " + groceryItem3 + " do you want?");
        quantity3 = keyboard.nextInt();
        keyboard.skip("\n");

        float price1;
        out.println("How much does " + groceryItem1 + " cost?");
        price1 = keyboard.nextFloat();
        keyboard.skip("\n");

        float price2;
        out.println("How much does " + groceryItem2 + " cost?");
        price2 = keyboard.nextFloat();
        keyboard.skip("\n");

        float price3;
        out.println("How much does " + groceryItem3 + " cost?");
        price3 = keyboard.nextFloat();
        keyboard.skip("\n");

        float totalPrice;
        totalPrice = (quantity1 * price1) + (quantity2 * price2)+ (quantity3 * price3);
        out.println("Calculating your grocery bill.");
        out.print("Your total is " + totalPrice);
    }
}