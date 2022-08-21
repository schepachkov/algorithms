package com.schepachkov.sort.simple;

import java.util.List;

/**
 * Worst time O(n^2),
 * Average time O(n^2),
 * Best time O(n),
 * Memory - O(1),
 */
public class ShakeSort implements SimpleSortable {


    @Override
    public void sortDouble(List<Double> numbers) {
        if (numbers != null) {
            int leftIndex = 0;
            int rightIndex = numbers.size() - 1;
            while (leftIndex <= rightIndex) {
                for (int i = leftIndex; i < rightIndex; i++) {
                    if (numbers.get(i + 1) < numbers.get(i)) {
                        double minVal = numbers.get(i + 1);
                        numbers.set(i + 1, numbers.get(i));
                        numbers.set(i, minVal);
                    }
                }
                rightIndex--;

                for (int i = rightIndex; i > leftIndex; i--) {
                    if (numbers.get(i) < numbers.get(i - 1)) {
                        double minVal = numbers.get(i);
                        numbers.set(i, numbers.get(i - 1));
                        numbers.set(i - 1, minVal);
                    }
                }
                leftIndex++;
            }
        }
    }
}
