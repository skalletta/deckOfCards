package kalletta.appian.cards.standard;

import static org.junit.Assert.assertEquals;
import kalletta.appian.cards.exception.OutOfCardsException;
import kalletta.appian.cards.standard.CardFace;
import kalletta.appian.cards.standard.DeckOfStandardCards;
import kalletta.appian.cards.standard.Suit;

import org.junit.Before;
import org.junit.Test;

public class DeckOfStandardCardsTest {

	DeckOfStandardCards sut;
	final int STANDARD_DECK_SIZE = 52;
	final int NUMBER_OF_SUITS = 4;
	final int NUMBER_OF_FACES = 13;

	@Before
	public void setUp() {
		sut = new DeckOfStandardCards();
	}

	@Test
	public void suitSizeTest() {
		assertEquals(NUMBER_OF_SUITS, Suit.values().length);
	}

	@Test
	public void faceSizeTest() {
		assertEquals(NUMBER_OF_FACES, CardFace.values().length);
	}

	@Test
	public void initalizeDeckOfCardsTest() {
		assertEquals(STANDARD_DECK_SIZE, sut.getRemainingCards().size());
	}

	@Test
	public void dealOneCardTest() throws OutOfCardsException {
		int startingSize = sut.getRemainingCards().size();
		sut.dealOneCard();
		assertEquals(startingSize - 1, sut.getRemainingCards().size());
	}

	@Test
	public void dealAllCardsTest() throws OutOfCardsException {
		int deckSize = sut.getRemainingCards().size();
		for (int i = 0; i < deckSize; i++) {
			sut.dealOneCard();
		}
		assertEquals(0, sut.getRemainingCards().size());
	}

	@Test(expected = OutOfCardsException.class)
	public void dealAllCardsPlusOneTest() throws OutOfCardsException {
		int deckSize = sut.getRemainingCards().size();
		for (int i = 0; i < deckSize; i++) {
			sut.dealOneCard();
		}
		sut.dealOneCard();
	}

	@Test
	public void shuffleTest() {
		sut.shuffle();
		assertEquals(STANDARD_DECK_SIZE, sut.getRemainingCards().size());
		//TODO: Test for randomness?
	}
	
	

}
