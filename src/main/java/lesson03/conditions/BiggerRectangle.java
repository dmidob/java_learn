package lesson03.conditions;
/*
Определить, какой прямоугольник больше по площади. Если больше первый прямоугольник, то результат 1, иначе 2.
Ограничения: widht1, height1, width2, height2 > 0.
int biggerRectange(int widht1, int height1, int width2, int height2)
Входные аргументы  int widht1, int height1, int width2, int height2
Тип результата int
*/

import utils.errorhandling.ExceptionHandling;

public class BiggerRectangle {
    public static void main (String[] args) {
        System.out.println(biggerRectange(110,20,30,40));
    }

    public static int biggerRectange(int widht1, int height1, int width2, int height2){
        int numberOfBiggerRectangle = 0;
        int squareOfFirstRectangle = widht1 * height1;
        int squareOfSecondRectangle = width2 * height2;
        if (isRectangleDimensionsAreCorrect(widht1, height1, width2, height2)){
            if (squareOfFirstRectangle > squareOfSecondRectangle){
                numberOfBiggerRectangle = 1;
            }else {
                numberOfBiggerRectangle = 2;
            }
        } else {
            ExceptionHandling.IllegalArgumentException(-1);
        }
        return numberOfBiggerRectangle;
    }

    public static boolean isRectangleDimensionsAreCorrect(int widht1, int height1, int width2, int height2){
        return widht1 > 0 && height1 > 0 && width2 > 0 && height2 > 0;
    }

}
