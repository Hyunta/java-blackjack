package blackjack.domain;

public class Card {
    private final Symbol symbol;
    private final CardNumber cardNumber;

    public Card(Symbol symbol, CardNumber cardNumber) {
        this.symbol = symbol;
        this.cardNumber = cardNumber;
    }

    public int getCardNumberValue() {
        return cardNumber.getCardNumberValue();
    }
}
