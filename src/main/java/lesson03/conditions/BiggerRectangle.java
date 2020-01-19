package lesson03.conditions;
/*
Определить, какой прямоугольник больше по площади. Если больше первый прямоугольник, то результат 1, иначе 2.
Ограничения: widht1, height1, width2, height2 > 0.
int biggerRectange(int widht1, int height1, int width2, int height2)
Входные аргументы  int widht1, int height1, int width2, int height2
Тип результата int
*/

public class BiggerRectangle {
    public static final String ERROR_MESSAGE_FOR_WRONG_DIMENSIONS_INPUT = "Rectangle dimension(s) should be > 0";

    public static void main (String[] args) {
        System.out.println(biggerRectangle(-110,-20,30,40));
    }

    public static int biggerRectangle (int width1, int height1, int width2, int height2){
        return calculaeRectangleSquare(width1, height1) > calculaeRectangleSquare(width2, height2) ? 1 : 2;
    }

    public static int calculaeRectangleSquare (int width, int height){
        if (width < 0 || height < 0) {
            throw new IllegalArgumentException(ERROR_MESSAGE_FOR_WRONG_DIMENSIONS_INPUT);
        }
        return width * height;
    }
}
