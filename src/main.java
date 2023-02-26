import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean playAgain = true;

        while (playAgain) {
            // Get move choices from players A and B
            System.out.print("Player A, enter your move (R/P/S): ");
            String moveA = scanner.nextLine().toLowerCase();
            while (!isValidMove(moveA)) {
                System.out.print("Invalid move. Please enter R, P, or S: ");
                moveA = scanner.nextLine().toLowerCase();
            }

            System.out.print("Player B, enter your move (R/P/S): ");
            String moveB = scanner.nextLine().toLowerCase();
            while (!isValidMove(moveB)) {
                System.out.print("Invalid move. Please enter R, P, or S: ");
                moveB = scanner.nextLine().toLowerCase();
            }

            // Determine the winner and display the results
            if (moveA.equals("r") && moveB.equals("s")) {
                System.out.println("Rock breaks scissors. Player A wins!");
            } else if (moveA.equals("p") && moveB.equals("r")) {
                System.out.println("Paper covers rock. Player A wins!");
            } else if (moveA.equals("s") && moveB.equals("p")) {
                System.out.println("Scissors cut paper. Player A wins!");
            } else if (moveB.equals("r") && moveA.equals("s")) {
                System.out.println("Rock breaks scissors. Player B wins!");
            } else if (moveB.equals("p") && moveA.equals("r")) {
                System.out.println("Paper covers rock. Player B wins!");
            } else if (moveB.equals("s") && moveA.equals("p")) {
                System.out.println("Scissors cut paper. Player B wins!");
            } else {
                System.out.println("It's a tie!");
            }

            // Prompt the user to play again
            System.out.print("Do you want to play again? (Y/N): ");
            String answer = scanner.nextLine().toLowerCase();
            while (!answer.equals("y") && !answer.equals("n")) {
                System.out.print("Invalid answer. Please enter Y or N: ");
                answer = scanner.nextLine().toLowerCase();
            }
            playAgain = answer.equals("y");
        }
    }

    public static boolean isValidMove(String move) {
        return move.equals("r") || move.equals("p") || move.equals("s");
    }
}
