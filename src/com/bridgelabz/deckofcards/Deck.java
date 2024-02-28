package com.bridgelabz.deckofcards;

import java.util.Random;

class Deck {
    protected Card[] cards;
    private int currentCardIndex;

    public Deck() {
        cards = new Card[52];
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
                cards[index++] = new Card(suit, rank);
            }
        }
    }

    private void shuffleDeck() {
        Random random = new Random();
        for (int i = cards.length - 1; i > 0; i--) {
            int j = random.nextInt(i + 1);
            // Swap cards[i] and cards[j]
            Card temp = cards[i];
            cards[i] = cards[j];
            cards[j] = temp;
        }
    }

    public Card dealCard() {
        if (currentCardIndex < cards.length) {
            return cards[currentCardIndex++];
        } else {
            return null; // No more cards in the deck
        }
    }
}

