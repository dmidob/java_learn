package lesson03.conditions;
/*
Task 1 (BlackJack)
Посчитать, сколько очков получает игрок в Блэкджек, если он имеет карты номиналом cardA и cardB.
Количество очков равняется номиналу большей карты, но не больше чем 21. Если обе карты по номиналу больше 21, то количество очков 0.
Ограничения: cardA > 0, cardB > 0.
int blackjackScore(int cardA, int cardB)
Входные аргументы int cardA, int cardB
Тип результата int
 */

import utils.errorhandling.ExceptionHandling;

public class BlackJack {
    public static void main (String[] args) {
        System.out.println(blackjackScore(-21,19));

    }

    public static int blackjackScore(int cardA, int cardB){
        int winningResult = 0;
        if (cardA > 21 && cardB > 21) {
            return winningResult;
        }
        if (isCardsAreCorrect(cardA, cardB)){
            if (cardA <= 21 && cardB <= 21) {
                winningResult = (Math.max(cardA, cardB));
            }
            if (cardA > 21 || cardB > 21) {
                winningResult = (Math.min(cardA, cardB));
            }
        } else {
            ExceptionHandling.IllegalArgumentException(-1);
        }
        return winningResult;
    }

    public static boolean isCardsAreCorrect (int cardA, int cardB){
        return (cardA > 0 & cardB > 0);
    }

}
