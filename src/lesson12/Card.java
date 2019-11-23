package lesson12;

import java.util.Scanner;

public class Card {
    static final String[] SUIT_NAMES = {"♠", "♦", "♣", "♥"};
    String suit;
    int num;
    boolean hasBeenDealt;
    boolean hasBeenPlayed;

    void print() {
        if (!hasBeenPlayed) {
            if (num > 1 && num < 11) {
                System.out.print(num);
            } else if (num == 11) {
                System.out.print('J');
            } else if (num == 12) {
                System.out.print('Q');
            } else if (num == 13) {
                System.out.print('K');
            } else {
                System.out.print('A');
            }
            System.out.print(suit);
        } else {
            System.out.print("   ");
        }
    }


    public static void main(String[] argv) {
        System.out.println("Welcome to the Card Game! Ace = 1, Jack = 11, Queen = 12, King = 13, and the rest of the cards are equivalent to their face value. ");

        Card c = new Card();
        c.suit = "Spades";
        c.num = 12;

        Card[] deck = new Card[52];
        for (int s = 0; s <= SUIT_NAMES.length - 1; s++) {
            for (int i = 1; i <= 13; i++) {
                Card aCard = new Card();
                aCard.suit = SUIT_NAMES[s];
                aCard.num = i;
                deck[i + s * 13 - 1] = aCard;
            }
        }
        //printDeck(deck);

        Card[] computerHand = new Card[10];
        Card[] humanHand = new Card[10];

        dealCard(computerHand, deck);
        dealCard(humanHand, deck);


        int humanScore = 0, computerScore = 0;
        Scanner sc = new Scanner(System.in);
        for (int round = 1; round <= 10; round++) {
            System.out.println("Computer hand: ");
            printDeck(computerHand);
            System.out.println("\nYour hand: ");
            printDeck(humanHand);

            System.out.println("\nPick the card that you would like to play. ");
            Card humanCard;
            while (true) {
                int humanPlay = sc.nextInt();
                if (humanPlay < 1 || humanPlay > 10) {
                    System.out.println("Please enter a valid number. Select your card by choosing the number in the brackets. \nYour hand: ");
                    printDeck(humanHand);
                    continue;
                }
                humanCard = humanHand[humanPlay - 1];
                System.out.print("You played: ");
                humanCard.print();
                System.out.println();
                if (!humanCard.hasBeenPlayed) {
                    break;
                }
            }
            Card computerCard;
            while (true) {
                int computerPlay = (int) (Math.random() * 10);
                computerCard = computerHand[computerPlay];
                System.out.print("Computer played: ");
                computerCard.print();
                System.out.println();
                if (!computerCard.hasBeenPlayed) {
                    break;
                }
            }

            if (humanCard.num > computerCard.num) {
                System.out.println("You won!");
                humanScore++;
            } else if (humanCard.num < computerCard.num) {
                System.out.println("You lost.");
                computerScore++;
            } else {
                System.out.println("You tied! ");
            }

            System.out.println("Your Score: " + humanScore);
            System.out.println("Computer Score: " + computerScore);
            System.out.println();

            humanCard.hasBeenPlayed = true;
            computerCard.hasBeenPlayed = true;
        }
    }

    static void dealCard(Card[] hand, Card[] wholeDeck) {
        for (int i = 0; i < hand.length; i++) {
            //randomly pick an un-dealt card from wholeDeck
            while (true) {
                int r = (int) (Math.random() * 52);
                if (!wholeDeck[r].hasBeenDealt) {
                    hand[i] = wholeDeck[r];
                    wholeDeck[r].hasBeenDealt = true;
                    break;
                }
            }
        }
    }

    static void printDeck(Card[] card) {
        for (int i = 0; i < card.length; i++) {
            System.out.print("[" + (i + 1) + "]");
            card[i].print(); // you can't just concatenate a space here b/c "print" doesn't print a String
            System.out.print(" ");
        }
    }
}
