package kalletta.appian.cards.standard;

public enum CardFace {

	ACE("A", 14), KING("K", 13), QUEEN("Q", 12), JACK("J", 11), TEN("10", 10), NINE(
			"9", 9), EIGHT("8", 8), SEVEN("7", 7), SIX("6", 6), FIVE("5", 5), FOUR(
			"4", 4), THREE("3", 3), TWO("2", 2);

	private String value;
	private int rank;

	private CardFace(String value, int rank) {
		this.value = value;
		this.rank = rank;
	}
	
	public String getValue(){
		return value;
	}
	
	public int getRank(){
		return rank;
	}
}
