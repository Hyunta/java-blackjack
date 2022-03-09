package blackjack.domain;

import java.util.List;

public class HoldingCard {
    private static final int BLACK_JACK_SCORE = 21;
    private List<Card> holdingCard;

    public HoldingCard(List<Card> holdingCard) {
        this.holdingCard = holdingCard;
    }

    public void add(Card card) {
        holdingCard.add(card);
    }

    public boolean isBust() {
        return sum() > BLACK_JACK_SCORE;
    }

    private int sum() {
        return holdingCard.stream()
                .mapToInt(Card::getCardNumberValue)
                .sum();
    }
}
