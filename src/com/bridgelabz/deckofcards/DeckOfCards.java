package com.bridgelabz.deckofcards;
import java.util.Random;
class DeckOfCards extends Deck {
    private final Card[] deck;
    private int currentCardIndex;

    public DeckOfCards() {
        deck = new Card[52];
        initializeDeck();
        shuffleDeck();
        currentCardIndex = 0;
    }

    private void initializeDeck() {
        String[] suits = {"Clubs", "Diamonds", "Hearts", "Spades"};
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};

        int index = 0;
        for (String suit : suits) {
            for (String rank : ranks) {
                deck[index++] = new Card(suit, rank);
            }
        }
    }

    private void shuffleDeck() {
        Random random = new Random();
        for (int i = deck.length - 1; i > 0; i--) {
            int j = random.nextInt(i + 1);
            // Swap deck[i] and deck[j]
            Card temp = deck[i];
            deck[i] = deck[j];
            deck[j] = temp;
        }
    }

    public Card dealCard() {
        if (currentCardIndex < deck.length) {
            return deck[currentCardIndex++];
        } else {
            return null; // No more cards in the deck
        }
    }
}
