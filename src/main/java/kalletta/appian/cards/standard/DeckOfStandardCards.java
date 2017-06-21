package kalletta.appian.cards.standard;

import kalletta.appian.cards.DeckOfCards;

public class DeckOfStandardCards extends DeckOfCards<StandardCard> {

	@Override
	public void initialize() {

		for (Suit suit : Suit.values()) {
			for (CardFace face : CardFace.values()) {
				cards.add(new StandardCard(suit, face));
			}
		}

	}

}
