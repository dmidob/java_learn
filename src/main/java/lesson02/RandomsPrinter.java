package lesson02;
/*
Task 6 (RandomsPrinter)
Напечатать в консоль count псевдослучайных чисел в диапазоне от min до max включительно. Можно использовать класс
java.util.Random.
Ограничения: count > 0, min <= max.
void printRandoms(int count, int min, int max)
Входные аргументы: int count, int min, int max
Тип результата: boolean
 */

public class RandomsPrinter {
    public static  void main (String[] args) {
        printRandomNumbers(3, 0, 20 );
    }

    static boolean printRandomNumbers (int countOfRandomNumbers, int minNumber, int maxNumber){
        boolean isError = false;
        if (countOfRandomNumbers > 0 & minNumber <= maxNumber){
            while (countOfRandomNumbers > 0 ){
                System.out.println(Randomize.generateRandomNumberInRange(10, 20));
                countOfRandomNumbers--;
            }
        }else {
            isError = true;
        }
        return isError;
    }
}
