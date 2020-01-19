package lesson03.conditions;
/*
Вычислить BMI (индекс массы тела) человека по показателям веса (в килограммах) и роста (в метрах).
В результате вернуть текстовое описание BMI.
bmi = weight / height ^ 2, где ^ - возведение в степень.

Текстовое описание:
bmi <= 18.5                -> "Underweight"
18.5 < bmi <= 25.0     -> "Normal"
25.0 < bmi                  -> "Overweight"

Использовать конструкцию if-else-if.
Ограничения: weight > 0, height > 0.
String bmiInfo(double weight, double height)
Входные аргументы double weight, double height
Тип результата String
*/

public class BmiInfo {
    public static final String BMI_UNDERWEIGHT = "Underweight";
    public static final String BMI_NORMAL = "Normal";
    public static final String BMI_OVERWEIGHT = "Overweight";
    public static final String ERROR_MESSAGE_WRONG_BIO_PARAMETERS_INPUT = "BIO parameters should be > 0";

    public static void main (String[] args) {
        System.out.println(bmiInfo(81.4, 1.80));
    }

    public static String bmiInfo(double weight, double height){
        String bmiResultDescription = "";
        double bmiCalculated = bmiCalculate(weight, height);
        if (bmiCalculated <= 18.5){
                bmiResultDescription = BMI_NORMAL;
        } else {
            if (18.5 < bmiCalculated && bmiCalculated <= 25.0) {
                bmiResultDescription = BMI_UNDERWEIGHT;
            } else bmiResultDescription = BMI_OVERWEIGHT;
        }
        return bmiResultDescription;
    }

    public static double bmiCalculate (double weight, double height){
        if (weight <= 0 && height <= 0){
            throw new IllegalArgumentException(ERROR_MESSAGE_WRONG_BIO_PARAMETERS_INPUT);
        }
        return weight / Math.pow(height, 2);
    }
}

