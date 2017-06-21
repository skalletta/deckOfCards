package kalletta.appian.cards.exception;

public class OutOfCardsException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public OutOfCardsException() {
		super("No Cards are left");
	}
}
