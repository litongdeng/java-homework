package lesson12;

import java.util.Scanner;

public class Card {
    static final String[] SUIT_NAMES = {"♠", "♦", "♣", "♥"};
    String suit;
    int num;
    boolean hasBeenDealt;
    boolean hasBeenPlayed;

    void print() {
        System.out.print(num + suit);
    }


    public static void main(String[] argv) {
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

        System.out.println("Computer hand: ");
        printDeck(computerHand);
        System.out.println("\nYour hand: ");
        printDeck(humanHand);

        int humanScore = 0, computerScore = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("\nPick the card that you would like to play. ");
        int humanPlay = sc.nextInt();
        Card humanCard = humanHand[humanPlay - 1];
        Card computerCard;
        //TODO: write this humanCard thing inside while loop
        while (true) {
            int computerPlay = (int) (Math.random() * 10);
            computerCard = computerHand[computerPlay];
            if (!computerCard.hasBeenPlayed) {
                break;
            }
        }

        if (humanCard.num > computerCard.num) {
            humanScore++;
        } else if (humanCard.num < computerCard.num) {
            computerScore++;
        } else {
            //edrfghj
        }
        humanCard.hasBeenPlayed = true;
        computerCard.hasBeenPlayed = true;
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
//TODO: When you display each card, you have to indicate whether or not the card has been played
    static void printDeck(Card[] d) {
        for (int i = 0; i < d.length; i++) {
            System.out.print("[" + (i + 1) + "]");
            d[i].print(); // you can't just concatenate a space here b/c "print" doesn't print a String
            System.out.print(" ");
        }
    }
}
