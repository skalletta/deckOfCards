package kalletta.appian.cards;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import kalletta.appian.cards.exception.OutOfCardsException;

public abstract class DeckOfCards<T extends Card> {
	protected List<T> cards;

	public DeckOfCards() {
		cards = new ArrayList<>();
		initialize();
	}

	public void shuffle() {
		Random r = new Random();
		for(int i = cards.size()-1; i >0; i--){
			int randomIndex = r.nextInt(i);
			T permanentMove = cards.get(randomIndex);
			T swapped = cards.get(i);
			
			cards.set(randomIndex, swapped);
			cards.set(i, permanentMove);
		}
	}

	public T dealOneCard() throws OutOfCardsException {
		if (cards.size() > 0) {
			return cards.remove(cards.size() - 1);
		} else {
			throw new OutOfCardsException();
		}
	}

	public List<T> getRemainingCards() {
		return cards;
	}

	public abstract void initialize();
}
