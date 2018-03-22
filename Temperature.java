import java.util.Scanner;

public class Temperature {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Temperature Calculator\n");
        System.out.println("The data provided are:");

        int grid[][] = new int[4][7];

        String[] times = {"7 AM: ", "3 PM: ", "7 PM: ", "3 AM: "};
        String[] daysOfWeek= {"Sun: ", "Mon: ", "Tues: ", "Wed: ", "Thurs: ", "Fri: ", "Sat: "};
        float totalWeekly = 0;
        float weeklyAve = 0;

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


        //This prints the table.  Note the times nestled in before each row
        for (int row = 0; row < grid.length; row++) {
            System.out.print(times[row]);
            for (int column = 0; column < grid[0].length; column++) {
                System.out.print(grid[row][column] + " ");
            }
            System.out.println();
        }


        System.out.println("\nBased on that data, the following are the average temperatures for the week.");

        //calculates and prints daily average temperature
        for(int column = 0; column < grid[0].length; column++) {
            int sum = 0;
            int dailyAve = 0;
            for (int row = 0; row < grid.length; row++) {
                sum += grid[row][column];
            }
            dailyAve = sum / grid.length;
            System.out.println(daysOfWeek[column] + dailyAve);
        }
        System.out.println();

        //calculates weekly average temp
        for (int row = 0; row < grid.length; row++) {
            for (int column = 0; column < grid[0].length; column++) {
                totalWeekly += grid[row][column];
            }
        }
        weeklyAve = totalWeekly / (grid.length * grid[0].length);
        System.out.println("The final average temperature for the week was:");
        System.out.println("Overall: " + weeklyAve);

    }
}
