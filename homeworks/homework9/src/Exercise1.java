/**
 * 1. Sort a list of integers in ascending order using an anonymous class for the comparator.
 */

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Exercise1 {
    public static void main(String[] args) {

        List<Integer> ints = Arrays.asList(5, 3, 8, 1, 9, 2);

        Comparator<Integer> comparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1 - o2;
            }
        };

        for (int i = 0; i < ints.size() - 1; i++) {
            for (int j = 0; j < ints.size() - 1; j++) {
                if (comparator.compare(ints.get(j), ints.get(j + 1)) > 0) {
                    int aux = ints.get(j);
                    ints.set(j, ints.get(j + 1));
                    ints.set(j + 1, aux);
                }
            }

        }

        System.out.println("List sorted in ascending order: " + ints);
    }
}

