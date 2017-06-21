package kalletta.appian.cards.standard;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import kalletta.appian.cards.standard.CardFace;
import kalletta.appian.cards.standard.StandardCard;
import kalletta.appian.cards.standard.Suit;

import org.junit.Before;
import org.junit.Test;

public class StandardCardTest {

	StandardCard sut;
	final Suit CORRECT_SUIT = Suit.HEARTS;
	final CardFace CORRECT_CARD_FACE = CardFace.ACE;

	@Before
	public void setUp() {
		sut = new StandardCard(CORRECT_SUIT, CORRECT_CARD_FACE);
	}

	@Test
	public void equalsTest() {
		StandardCard compare = new StandardCard(CORRECT_SUIT, CORRECT_CARD_FACE);
		assertTrue(sut.equals(compare));
	}

	@Test
	public void equalsWrongSuitTest() {
		StandardCard wrongSuit = new StandardCard(Suit.SPADES,CORRECT_CARD_FACE);
		assertFalse(sut.equals(wrongSuit));
	}

	@Test
	public void equalsWrongCardFace() {
		StandardCard wrongFace = new StandardCard(CORRECT_SUIT, CardFace.TWO);
		assertFalse(sut.equals(wrongFace));
	}

	@Test
	public void equalsWrongObjectTest() {
		String wrongObect = new String();
		assertFalse(sut.equals(wrongObect));
	}

	@Test
	public void equalsNullTest() {
		assertFalse(sut.equals(null));
	}

}
