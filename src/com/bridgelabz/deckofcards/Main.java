package com.bridgelabz.deckofcards;
public class Main {
    public static void main(String[] args) {
        DeckOfCards deckOfCards = new DeckOfCards();

        Player[] players = new Player[4];
        for (int i = 0; i < players.length; i++) {
            players[i] = new Player();
        }

        for (int i = 0; i < 9; i++) {
            for (Player player : players) {
                Card card = deckOfCards.dealCard();
                if (card != null) {
                    player.receiveCard(card);
                }
            }
        }

        for (int i = 0; i < players.length; i++) {
            System.out.println("Player " + (i + 1) + " hand:");
            for (Card card : players[i].getHand()) {
                if (card != null) {
                    System.out.println(card);
                }
            }
            System.out.println();
        }
    }
}
