package kalletta.appian.cards.standard;

import kalletta.appian.cards.Card;

public class StandardCard implements Card {
	private Suit suit;
	private CardFace face;

	public StandardCard(Suit suit, CardFace face) {
		this.suit = suit;
		this.face = face;
	}

	public CardFace getCardFace() {
		return face;
	}

	public Suit getSuit() {
		return suit;
	}

	@Override
	public boolean equals(Object card) {
		if (card == null) {
			return false;
		}
		if (!(card instanceof StandardCard)) {
			return false;
		}
		StandardCard sCard = (StandardCard) card;
		return this.getSuit().equals(sCard.getSuit())
				&& this.getCardFace().equals(sCard.getCardFace());
	}

	@Override
	public int hashCode() {
		int hash = 9;
		return 71 * (hash + this.getCardFace().getRank());
	}

}
