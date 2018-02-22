import static java.lang.System.out;
        import java.util.Scanner;
public class ThankYouMerge
{
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String personName;
        String donation;
        boolean printLetters = true;

        System.out.println("Thank You Letters");

        while (printLetters == true)
        {

            System.out.println("First and last name?");
            personName = keyboard.nextLine();

            if (personName.equals("quit"))
            {printLetters = false;}

            else {
                System.out.println("Donation amount? $");
                donation = keyboard.nextLine();

                System.out.println("Dear " + personName + ",\n");
                System.out.println("Thank you for your donation! We rely on donors like you to keep our organization effective, and you came through for us. Your donation of $" + donation + " will help our efforts to make a difference in the world.\n");
                System.out.println("As you may know, we are a registered non-profit organization, so your donation is tax deductible. You may use this letter as a receipt for tax purposes.\n");
                System.out.println("Thank you again for your support!\n");
                System.out.println("Sincerely,\n");
                System.out.println("Paula Jones\n");
                System.out.println("YourCharity.org");
            }
        }
    }
}
