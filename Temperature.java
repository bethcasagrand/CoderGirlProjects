import java.util.Scanner;

public class Temperature {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Temperature Calculator\n");
        System.out.println("The data provided are:");

        int grid[][] = new int[4][7];

        int tempAve= 0;

        grid[0][0] = 68;
        grid[0][1] = 70;
        grid[0][2] = 76;
        grid[0][3] = 70;
        grid[0][4] = 68;
        grid[0][5] = 71;
        grid[0][6] = 75;

        grid[1][0] = 76;
        grid[1][1] = 76;
        grid[1][2] = 87;
        grid[1][3] = 84;
        grid[1][4] = 82;
        grid[1][5] = 75;
        grid[1][6] = 83;

        grid[2][0] = 73;
        grid[2][1] = 72;
        grid[2][2] = 81;
        grid[2][3] = 78;
        grid[2][4] = 76;
        grid[2][5] = 73;
        grid[2][6] = 77;

        grid[3][0] = 64;
        grid[3][1] = 65;
        grid[3][2] = 69;
        grid[3][3] = 68;
        grid[3][4] = 70;
        grid[3][5] = 74;
        grid[3][6] = 72;


        System.out.print("7 AM: ");


        //prints row in 0 place or first row
        for (int j = 0; j < grid[0].length; j++)
            System.out.print(grid[0][j] + ", ");

        System.out.print("\n");
        System.out.print("3 PM: ");


        //prints row in 1 place or second row
        for (int j = 0; j < grid[1].length; j++)
            System.out.print(grid[1][j] + ", ");

        System.out.print("\n");
        System.out.print("7 PM: ");


        //prints row in 2 place or third row
        for (int j = 0; j < grid[2].length; j++)
            System.out.print(grid[2][j] + ", ");

        System.out.print("\n");
        System.out.print("3 AM: ");


        //prints row in 3 place or fourth row
        for (int j = 0; j < grid[3].length; j++)
            System.out.print(grid[3][j] + ", ");

        System.out.println("\n \nBased on that data, the following are the average temperatures for the week.");


        //this is the initialize the values of sums of each row and column
        float sumCol1 = 0;
        float sumCol2 = 0;
        float sumCol3 = 0;
        float sumCol4 = 0;
        float sumCol5 = 0;
        float sumCol6 = 0;
        float sumCol7 = 0;

        float sumRow1 = 0;
        float sumRow2 = 0;
        float sumRow3 = 0;
        float sumRow4 = 0;

        //this is the sum of the first row in 0 place
        for (int j = 0; j < grid[0].length; j++)
            {sumRow1 += grid[0][j];}
        //this is to calculate the average for the row
        float Average = (sumRow1 / 7);
        System.out.println("7 AM: " + Average);

        for (int j = 0; j < grid[1].length; j++)
        {sumRow2 += grid[1][j];}
        float Average2 = (sumRow2 / 7);
        System.out.println("3 PM: " + Average2);

        for (int j = 0; j < grid[2].length; j++)
        {sumRow3 += grid[2][j];}
        float Average3 = (sumRow3 / 7);
        System.out.println("7 AM: " + Average3);

        for (int j = 0; j < grid[3].length; j++)
        {sumRow4 += grid[3][j];}
        float Average4 = (sumRow4 / 7);
        System.out.println("3 AM: " + Average4);


        //now for the columns.  Hmmm, couldn't get this to work with the grid length, not sure how to put in automatic width
        for (int j = 0; j < 4; j++)
        {sumCol1 += grid[j][0];}
        float Average5 = (sumCol1 / 4);
        System.out.println("\nSun: " + Average5);

        for (int j = 0; j < 4; j++)
        {sumCol2 += grid[j][1];}
        float Average6 = (sumCol2 / 4);
        System.out.println("Mon: " + Average6);

        for (int j = 0; j < 4; j++)
        {sumCol3 += grid[j][2];}
        float Average7 = (sumCol3 / 4);
        System.out.println("Tues: " + Average7);

        for (int j = 0; j < 4; j++)
        {sumCol4 += grid[j][3];}
        float Average8 = (sumCol4 / 4);
        System.out.println("Wed: " + Average8);

        for (int j = 0; j < 4; j++)
        {sumCol5 += grid[j][4];}
        float Average9 = (sumCol5 / 4);
        System.out.println("Thu: " + Average9);

        for (int j = 0; j < 4; j++)
        {sumCol6 += grid[j][5];}
        float Average10 = (sumCol6 / 4);
        System.out.println("Fri: " + Average10);

        for (int j = 0; j < 4; j++)
        {sumCol7 += grid[j][6];}
        float Average11 = (sumCol7 / 4);
        System.out.println("Sat: " + Average11);

        System.out.println("\nThe final average temperature for the week was:");

        float totalAve = ((sumRow1 + sumRow2 + sumRow3 +sumRow4)/28);
        System.out.println("Overall: " + totalAve);

    }
}
