import java.util.Scanner;

public class Grading {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the percentage
        System.out.print("Enter the percentage mark: ");
        int percentage = scanner.nextInt();

        // Determine the level and description based on the percentage
        String level = "";
        String description = "";

        if (percentage >= 80 && percentage <= 100) {
            level = "Level 7";
            description = "Outstanding Achievement";
        } else if (percentage >= 70 && percentage < 80) {
            level = "Level 6";
            description = "Meritorious Achievement";
        } else if (percentage >= 60 && percentage < 70) {
            level = "Level 5";
            description = "Substantial Achievement";
        } else if (percentage >= 50 && percentage < 60) {
            level = "Level 4";
            description = "Adequate Achievement";
        } else if (percentage >= 40 && percentage < 50) {
            level = "Level 3";
            description = "Moderate Achievement";
        } else if (percentage >= 30 && percentage < 40) {
            level = "Level 2";
            description = "Elementary Achievement";
        } else if (percentage >= 0 && percentage < 30) {
            level = "Level 1";
            description = "Not Achieved";
        } else {
            System.out.println("Invalid percentage entered.");
            scanner.close();
            return;
        }

        // Output the result
        System.out.println("Grade: " + level);
        System.out.println("Description: " + description);

        scanner.close();
    }
}
