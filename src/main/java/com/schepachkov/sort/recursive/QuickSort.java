package com.schepachkov.sort.recursive;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Worst time O(n^2),
 * Average time O(n * log n),
 * Best time O(n * log n),
 * Memory - O(n),
 */
public class QuickSort implements RecursiveSortable {


    @Override
    public Integer[] sortInt(Integer[] numbers) {
        if (numbers != null) {
            return quickSort(numbers);
        }
        return null;
    }

    private Integer[] quickSort(Integer[] numbers) {
        if (numbers.length > 1) {
            int pivot = numbers[numbers.length - 1];
            List<Integer> left = new ArrayList<>();
            List<Integer> right = new ArrayList<>();
            for (int i = 0; i < numbers.length - 1; i++) {
                if (numbers[i] < pivot) {
                    left.add(numbers[i]);
                } else {
                    right.add(numbers[i]);
                }
            }
            Integer[] sortedLeft = sortPartArray(left);
            Integer[] sortedRight = sortPartArray(right);
            return mergeParts(sortedLeft, pivot, sortedRight);
        }
        return numbers;
    }

    private Integer[] sortPartArray(List<Integer> part) {
        Integer[] sortedPart = part.toArray(new Integer[0]);
        if (sortedPart.length > 1) {
            sortedPart = quickSort(sortedPart);
        }
        return sortedPart;
    }

    private Integer[] mergeParts(Integer[] sortedLeft, int pivot, Integer[] right) {
        List<Integer> list = new ArrayList<>(Arrays.asList(sortedLeft));
        list.add(pivot);
        list.addAll(Arrays.asList(right));
        return list.toArray(new Integer[0]);
    }

}
