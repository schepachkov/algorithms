package com.schepachkov.sort.simple;

import java.util.List;

/**
 * Worst time O(n^2),
 * Average time O(n^2),
 * Best time O(n),
 * Memory - O(1),
 */
public class BubbleSort implements SimpleSortable {


    public void sortDouble(List<Double> numbers) {
        if (numbers != null) {
            boolean hasChanged = true;
            while (hasChanged) {
                hasChanged = false;
                for (int i = 1; i < numbers.size(); i++) {
                    if (numbers.get(i) < numbers.get(i - 1)) {
                        hasChanged = true;
                        double lowerVal = numbers.get(i);
                        numbers.set(i, numbers.get(i - 1));
                        numbers.set(i - 1, lowerVal);
                    }
                }
            }
        }
    }
}
