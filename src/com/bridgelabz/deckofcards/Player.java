package com.bridgelabz.deckofcards;
class Player {
    protected Card[] hand;
    private int currentCardIndex;

    public Player() {
        hand = new Card[9];
        currentCardIndex = 0;
    }

    public void receiveCard(Card card) {
        if (currentCardIndex < hand.length) {
            hand[currentCardIndex++] = card;
        }
    }

    public Card[] getHand() {
        return hand;
    }
}
