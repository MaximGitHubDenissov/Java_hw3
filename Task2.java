package Java_hw_3;
// Задан целочисленный список ArrayList. 
// Найти минимальное, максимальное и среднее ариф. из этого списка.
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Iterator;


public class Task2 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        Random rnd = new Random();
        for (int i = 0; i < 10; i++) {
            numbers.add(rnd.nextInt(20));

        }
        Iterator<Integer> itr = numbers.iterator();
        double Average = 0;
        double Total = 0;
        while (itr.hasNext()) {
            Total += itr.next();
            }
        Average = Total/numbers.size();
        System.out.println(numbers);
        int minValue = Collections.min(numbers);
        int maxValue = Collections.max(numbers);
        System.out.println(minValue);
        System.out.println(maxValue);
        System.out.println(Average);
        
    }
}
