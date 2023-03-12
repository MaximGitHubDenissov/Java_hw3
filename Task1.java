package Java_hw_3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

// Пусть дан произвольный список целых чисел, удалить из него чётные числа

public class Task1 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        Random rnd = new Random();
        for (int i = 0; i < 10; i++) {
            numbers.add(rnd.nextInt(20));

        }
        System.out.println(numbers);
        Iterator<Integer> itr = numbers.iterator();
        while (itr.hasNext()) {
            if (itr.next() % 2 == 0) {
                itr.remove();
            }
        }
        System.out.println(numbers);
    }
}
