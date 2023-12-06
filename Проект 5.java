import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        // Generating random correct kilometer marks
        int[] correctMarks = generateRandomMarks(); 
        int[] userMarks;
        // Generating random correct kilometer marks
        System.out.println("Martians, welcome to Earth! You have 5 attempts to find your cargo boxes.");

        for (int i = 0; i < 5; i++) {
            System.out.println("\ni " + i + ": Enter 3 kilometer marks separated by spaces:");
            userMarks = readUserInput();

            int correctCount = countCorrectMarks(correctMarks, userMarks);

            if (correctCount == 3) {
                System.out.println("Congratulations! You've found all the boxes. Cargo secured!");
                return; 
                // End the program if all boxes are found
            } 
            else {
                System.out.println("Number of correct kilometer marks: " + correctCount);
            }
        }

        System.out.println("\nSorry, Martians, you've run out of attempts. Better luck next time!");
    }

    private static int[] generateRandomMarks() {
        Random random = new Random();
        int[] marks = new int[3];

        for (int i = 0; i < 3; i++) {
            marks[i] = random.nextInt(7) + 1;
        }

        return marks;
    }

    private static int[] readUserInput() {
        Scanner scanner = new Scanner(System.in);
        int[] userMarks = new int[3];
        for (int i = 0; i < 3; i++) {
            userMarks[i] = scanner.nextInt();
        }
        return userMarks;
    }

    private static int countCorrectMarks(int[] correctMarks, int[] userMarks) {
        int correctCount = 0;

        for (int i = 0; i < 3; i++) {
            if (correctMarks[i] == userMarks[i]) {
                correctCount++;
            }
        }

        return correctCount;
    }
}
