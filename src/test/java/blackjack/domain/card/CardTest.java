package blackjack.domain.card;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class CardTest {

    @Test
    @DisplayName("심볼과 카드번호를 주면 카드를 제대로 만들 수 있는지")
    void makeCard_returnRightValue() {
        int expected = CardNumber.ACE.getCardNumberValue();
        Card aceClover = Card.valueOf(CardNumber.ACE, CardSymbol.CLUBS);
        Assertions.assertThat(aceClover.getCardNumberValue()).isEqualTo(expected);
    }
}
