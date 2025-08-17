
public class PersonalCard {
	int cardId;
	String cardName;

	public PersonalCard() {
		super();

	}

	public PersonalCard(int cardId, String cardName) {
		super();
		this.cardId = cardId;
		this.cardName = cardName;
	}

	public int getCardId() {
		return cardId;
	}

	public void setCardId(int cardId) {
		this.cardId = cardId;
	}

	public String getCardName() {
		return cardName;
	}

	public void setCardName(String cardName) {
		this.cardName = cardName;
	}

	@Override
	public String toString() {
		return "\nPersonal Card Details : \n cardId is : " + cardId + ", cardname is : " + cardName;
	}

}
