package dmidob.lesson03.conditions;
/*
Task 1 (BlackJack)
Посчитать, сколько очков получает игрок в Блэкджек, если он имеет карты номиналом cardA и cardB.
Количество очков равняется номиналу большей карты, но не больше чем 21. Если обе карты по номиналу больше 21, то количество очков 0.
Ограничения: cardA > 0, cardB > 0.
int blackjackScore(int cardA, int cardB)
Входные аргументы int cardA, int cardB
Тип результата int
 */

public class BlackJack {
    public static final String ERROR_MESSAGE_WRONG_CARDS_INPUT = "Cards input should be > 0";
    public static void main (String[] args) {
        System.out.println(blackjackScore(-1,20));
    }

    public static int blackjackScore(int cardA, int cardB){
        int winningScoreResult = 0;
        if (cardA > 21 && cardB > 21) {
            return winningScoreResult;
        }
        if (!isCardsAreCorrect(cardA, cardB)){
            if (cardA <= 21 && cardB <= 21) {
                winningScoreResult = (Math.max(cardA, cardB));
            } else {
                winningScoreResult = (Math.min(cardA, cardB));
            }
        } else {
            throw new IllegalArgumentException(ERROR_MESSAGE_WRONG_CARDS_INPUT);
        }
        return winningScoreResult;
    }

    public static boolean isCardsAreCorrect (int cardA, int cardB){
        return (cardA <= 0 || cardB <= 0);
    }

}
