import java.util.Scanner;

public class MultiplicationTable
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        int size;
        System.out.println("Welcome to Multiplication Tables!");
        System.out.println("How large would you like to see them?");
        size = keyboard.nextInt();

        if (size <= 20)
        {
            for (int firstNo = 1; firstNo <= size; firstNo++) {
                for (int secondNo = 1; secondNo <= size; secondNo++) {
                    System.out.print(firstNo + "x" + secondNo + "=" + (firstNo * secondNo + "\n"));
                }
                System.out.println();
            }
        }
        else
        {
            System.out.print("Sorry, the number needs to be 20 or smaller.");
        }
    }
}
