import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

import java.util.Collection;

import warcardgame.model.material.Card;
import warcardgame.model.material.Rank;
import warcardgame.model.material.Suit;
import warcardgame.model.material.deck.StandardDeck;

class StandardDeckTest {

    @Test
    void each_suit_is_present_in_standardDeck() {
        StandardDeck standardDeck = new StandardDeck();

        Collection<Card> standardDeckCards = standardDeck.cards();

        assertThat(standardDeckCards).extracting("suit").containsOnly(Suit.CLUBS, Suit.DIAMONDS, Suit.HEARTS,
                Suit.SPADES);
    }

    @Test
    void each_rank_is_present_in_standardDeck() {
        StandardDeck standardDeck = new StandardDeck();

        Collection<Card> standardDeckCards = standardDeck.cards();

        assertThat(standardDeckCards).extracting("rank").containsOnly(Rank.ACE, Rank.TWO, Rank.THREE, Rank.FOUR,
                Rank.FIVE, Rank.SIX, Rank.SEVEN, Rank.EIGHT, Rank.NINE, Rank.TEN, Rank.JACK, Rank.QUEEN, Rank.KING);
    }

    @Test
    void the_standardDeck_contains_52_Cards() {
        StandardDeck standardDeck = new StandardDeck();

        int numberCards = standardDeck.remainingCards();
        int numberCardsExpected = Rank.values().length * Suit.values().length;

        assertThat(numberCardsExpected).isEqualTo(52);
        assertThat(numberCards).isEqualTo(52);
    }

    @Test
    void the_standardDeck_contains_cards_without_duplicates() {

        StandardDeck standardDeck = new StandardDeck();

        Collection<Card> standardDeckCards = standardDeck.cards();

        assertThat(standardDeckCards).doesNotHaveDuplicates();
    }

    @Test
    void the_standardDeck_contains_only_once_all_the_cards_of_suit_clubs_family() {
        StandardDeck standardDeck = new StandardDeck();

        Collection<Card> standardDeckCards = standardDeck.cards();

        Card[] suitFamily = createFamilyOf(Suit.CLUBS);
        assertThat(standardDeckCards).containsOnlyOnce(suitFamily);
    }

    @Test
    void the_standardDeck_contains_only_once_all_the_cards_of_suit_diamonds_family() {
        StandardDeck standardDeck = new StandardDeck();

        Collection<Card> standardDeckCards = standardDeck.cards();

        Card[] suitFamily = createFamilyOf(Suit.DIAMONDS);
        assertThat(standardDeckCards).containsOnlyOnce(suitFamily);
    }

    @Test
    void the_standardDeck_contains_only_once_all_the_cards_of_suit_hearts_family() {
        StandardDeck standardDeck = new StandardDeck();

        Collection<Card> standardDeckCards = standardDeck.cards();

        Card[] suitFamily = createFamilyOf(Suit.HEARTS);
        assertThat(standardDeckCards).containsOnlyOnce(suitFamily);
    }

    @Test
    void the_standardDeck_contains_only_once_all_the_cards_of_suit_spades_family() {
        StandardDeck standardDeck = new StandardDeck();

        Collection<Card> standardDeckCards = standardDeck.cards();

        Card[] suitFamily = createFamilyOf(Suit.SPADES);
        assertThat(standardDeckCards).containsOnlyOnce(suitFamily);
    }

    private Card[] createFamilyOf(Suit suit) {
        Card suitFamily[] = new Card[] { new Card(Rank.ACE, suit), new Card(Rank.TWO, suit), new Card(Rank.THREE, suit),
                new Card(Rank.FOUR, suit), new Card(Rank.FIVE, suit), new Card(Rank.SIX, suit),
                new Card(Rank.SEVEN, suit), new Card(Rank.EIGHT, suit), new Card(Rank.NINE, suit),
                new Card(Rank.TEN, suit), new Card(Rank.JACK, suit), new Card(Rank.QUEEN, suit) };// new
        // Card(Rank.KING,suit)};
        return suitFamily;
    }
}