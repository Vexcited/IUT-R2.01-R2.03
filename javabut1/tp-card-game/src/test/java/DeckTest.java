import org.junit.jupiter.api.Test;
import warcardgame.model.material.Card;
import warcardgame.model.material.Rank;
import warcardgame.model.material.Suit;
import warcardgame.model.material.deck.Deck;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

class DeckTest {
    private static final Card ACE_OF_HEARTS = new Card(Rank.ACE, Suit.HEARTS);
    private static final Card KING_OF_DIAMONDS = new Card(Rank.KING, Suit.DIAMONDS);
    private static final Card QUEEN_OF_CLUBS = new Card(Rank.QUEEN, Suit.CLUBS);
    private static final Card TEN_OF_SPADES = new Card(Rank.TEN, Suit.SPADES);

    @Test
    void the_deck_is_empty_at_the_beginning() {
        Deck deck = new Deck();
        assertTrue(deck.isEmpty());
    }

    @Test
    void deck_has_one_card_when_a_card_put_in_an_empty_deck() {
        Deck deck = new Deck();
        Boolean isPut = deck.put(ACE_OF_HEARTS);
        assertTrue(isPut);
        assertFalse(deck.isEmpty());
        assertEquals(1, deck.remainingCards());
    }

    @Test
    void deck_has_2_cards_when_two_cards_put_in_an_empty_deck() {
        Deck deck = new Deck();
        Boolean isPut = deck.put(ACE_OF_HEARTS, KING_OF_DIAMONDS);
        assertTrue(isPut);
        assertFalse(deck.isEmpty());
        assertEquals(2,deck.remainingCards());
    }

    @Test
    void return_false_when_no_cards_put_in_the_deck() {
        Deck deck = new Deck();
        Boolean isPut = deck.put();
        assertFalse(isPut);
    }

    @Test
    void deck_contains_the_right_cards_put_in_an_empty_desk() {
        Deck deck = new Deck();
        deck.put(ACE_OF_HEARTS,KING_OF_DIAMONDS,QUEEN_OF_CLUBS,TEN_OF_SPADES);
        Collection<Card> cards = deck.cards();
        assertThat(cards).containsExactly(ACE_OF_HEARTS,KING_OF_DIAMONDS,QUEEN_OF_CLUBS,TEN_OF_SPADES)
                .containsSequence(ACE_OF_HEARTS,KING_OF_DIAMONDS,QUEEN_OF_CLUBS,TEN_OF_SPADES);
    }

    @Test
    void deck_is_empty_when_it_is_cleared() {
        Deck deck = new Deck();
        deck.put(ACE_OF_HEARTS, KING_OF_DIAMONDS, QUEEN_OF_CLUBS, TEN_OF_SPADES);
        deck.clear();
        assertTrue(deck.isEmpty());
        assertThat(deck.remainingCards()).isZero();
    }

    @Test
    void a_collection_of_cards_can_be_put_once_in_the_deck() {
        Deck deck = new Deck();
        Collection<Card> newCards = Arrays.asList(ACE_OF_HEARTS,KING_OF_DIAMONDS,QUEEN_OF_CLUBS);
        deck.put(newCards);
        assertThat(deck.remainingCards()).isEqualTo(3);
        assertThat(deck.cards()).containsExactly(ACE_OF_HEARTS,KING_OF_DIAMONDS,QUEEN_OF_CLUBS)
                .containsSequence(ACE_OF_HEARTS,KING_OF_DIAMONDS,QUEEN_OF_CLUBS);
    }
    @Test
    void return_false_when_cards_collection_of_deck_does_not_change_() {
        Deck deck = new Deck();
        Collection<Card> newCards = new ArrayList<>();
        Boolean isPut = deck.put(newCards);
        assertFalse(isPut);
    }

    @Test
    void the_deck_is_empty_an_card_is_out_the_desk_when_the_only_card_drawn() {
        Deck deck = new Deck();
        deck.put(ACE_OF_HEARTS);
        Card cardDrawn = deck.draw();
        assertTrue(deck.isEmpty());
        assertThat(cardDrawn).isEqualTo(ACE_OF_HEARTS);
    }

    @Test
    void first_card_of_the_deck_is_out_when_drawn() {
        Deck deck = new Deck();
        deck.put(KING_OF_DIAMONDS, ACE_OF_HEARTS, QUEEN_OF_CLUBS);
        Card cardDrawn = deck.draw();
        assertThat(cardDrawn).isEqualTo(KING_OF_DIAMONDS);
        assertThat(deck.remainingCards()).isEqualTo(2);
    }
    @Test
    void return_null_when_drawn_with_an_empty_deck() {
        Deck deck = new Deck();
        Card cardDrawn = deck.draw();
        assertThat(cardDrawn).isNull();
    }
}
