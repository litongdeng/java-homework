import java.util.Scanner;

public class Lesson5ProjectRPS {
    public static void main(String argv []) {
        System.out.println("Welcome to Rock Paper Scissors!");
        Scanner userInput = new Scanner(System.in);
        int userScore = 0, compScore = 0, computerNumber = 0;
        boolean peekedBool = false, needNewChoice = true;
        char computerChoice = ' ';
    wrap: while (true) {
        for (int i = 1; i <= 10; i++) {
            System.out.println("Your Score: " + userScore + ", Computer Score: " + compScore);

            System.out.println("Round " + i + " - Please select R, P, or S; press Q to quit, press K to peek at your opponent's choice for the cost of one point. ");
            char userChoice = userInput.next().toUpperCase().charAt(0);
            if (userChoice == 'Q') {
                break wrap;
            }
            if (userChoice != 'R' && userChoice != 'P' && userChoice != 'S' && userChoice != 'K') {
                System.out.println("You should enter only R, P, S, K, or Q; nothing else is acceptable. ");
                i--;
                continue;
            }
            //computer's choice
            if (needNewChoice) {
                computerNumber = (int) (Math.random() * 3 + 1);
                // map it to R/P/S
                if (computerNumber == 1)
                    computerChoice = 'R';
                else if (computerNumber == 2)
                    computerChoice = 'P';
                else computerChoice = 'S';
            }

            if (userChoice == 'K') {
                if (!peekedBool) {
                    System.out.println("computer choice: " + computerChoice + " please type your choice.");
                    peekedBool = true;
                    needNewChoice = false;
                } else {
                    System.out.println("You have used your peeking power once already! ");
                }
                i--;
                continue;
            }
            if (computerChoice == userChoice) {
                System.out.println("Your opponent picked " + computerChoice + ". You tied.");
            } else {
                boolean b1 = (userChoice == 'P' && computerChoice == 'R');
                boolean b2 = (userChoice == 'S' && computerChoice == 'P');
                boolean b3 = (userChoice == 'R' && computerChoice == 'S');
                if (b1 || b2 || b3) {
                    if (needNewChoice) {
                        userScore += 2;
                    } else {
                        userScore++;
                    }
                    System.out.println("Your opponent picked " + computerChoice + ". You won!");
                } else {
                    compScore += 2;
                    System.out.println("Your opponent picked " + computerChoice + ". You lost.");
                }
            }
            needNewChoice = true;
        }
        System.out.print("Good game! ");

        if (compScore > userScore) {
            System.out.println("Your opponent won. Nice try. ");
        } else if (compScore < userScore)
            System.out.println("Congratulations! You won.");
        else
            System.out.println("You tied.");
    }
    }

}


