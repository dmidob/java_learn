package lesson02.tasksresolve;
/*

Task 8 (MultiplicationTablePrinter)
Вывести на экран таблицу умножения размера size. На пересечении строки x и столбца y (нумерация с 1) находится число x * y.
Ограничения: size > 0.
void printMultiplicationTable(int size)
Входные аргументы: int size
Тип результата: Вывод в консоль
 */

public class MultiplicationTablePrinter {
    public static void main (String[] args) {
        printMultiplicationTable(6);
    }

    static void printMultiplicationTable (int size){
        for (int i = 1; i < size + 1; i++) {
            for (int j = 1; j < size + 1; j++) {
                System.out.print(i * j  + " ");
            }
            System.out.println();
        }
    }
}
