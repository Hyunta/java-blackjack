package blackjack.domain.participant;

import blackjack.domain.Game;

public class Player extends Participant {
    private final Name name;
    private final GameResult gameResult = new GameResult();

    public Player(String inputName) {
        this(new Name(inputName));
    }

    private Player(Name name) {
        this.name = name;
    }

    public boolean isBlackJack() {
        return calculateResult() == Game.BLACKJACK_NUMBER;
    }

    public void fight(Dealer dealer) {
        if (isBust()) {
            gameResult.lose();
            return;
        }
        if (isBlackJack()) {
            gameResult.win();
            return;
        }
        compareValue(dealer);
    }

    private void compareValue(Dealer dealer) {
        if (this.calculateResult() > dealer.calculateResult()) {
            gameResult.win();
            return;
        }
        if (this.calculateResult() < dealer.calculateResult()) {
            gameResult.lose();
            return;
        }
        gameResult.draw();
    }

    public GameResult getGameResult() {
        return gameResult;
    }


    @Override
    public String getName() {
        return name.toString();
    }

}