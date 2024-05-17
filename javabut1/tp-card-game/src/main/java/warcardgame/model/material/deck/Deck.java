package warcardgame.model.material.deck;

import warcardgame.model.material.Card;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Objects;

public class Deck {
    private final ArrayList<Card> cards;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Deck deck = (Deck) o;
        return Objects.equals(cards, deck.cards);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(cards);
    }

    public Deck () {
        this.cards = new ArrayList<>();
    }

    public boolean isEmpty() {
        return this.cards.isEmpty();
    }

    public Boolean put (Collection<Card> otherCards) {
        if (otherCards.isEmpty())
            return false;
        return this.cards.addAll(otherCards);
    }

    public Boolean put(Card...otherCards) {
        if (otherCards.length == 0)
            return false;
        for (Card card : otherCards) {
            if (card != null)
                this.cards.add(card);
        }
        return true;
    }
    public int remainingCards() {
        return this.cards.size();
    }

    public Collection<Card> cards() {
        return this.cards;
    }

    public void clear() {
        this.cards.clear();
    }

    public Card draw() {
        if (this.cards.isEmpty())
            return null;
        return this.cards.remove(0);
    }
}
