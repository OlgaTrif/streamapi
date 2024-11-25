import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;

/**
 * Напишите программу, которая использует Stream API для обработки списка чисел.
 * Программа должна вывести на экран среднее значение всех четных чисел в списке.
 */



public class Main {
    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>();
        integerList.add(1);
        integerList.add(10);
        integerList.add(15);
        integerList.add(5);
        integerList.add(16);
        integerList.add(8);

        OptionalDouble result = integerList.stream().filter(i -> i % 2 == 0).mapToDouble(num -> num).average();
        if (result.isPresent()) {
            System.out.println("среднее арифметическое чётных чисел: " + result.getAsDouble());
        }
    }
}