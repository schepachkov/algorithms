package com.schepachkov.sort.recursive;

import java.util.Arrays;

/**
 * Worst time O(n * log n),
 * Average time O(n * log n),
 * Best time O(n * log n),
 * Memory - O(n),
 */
public class MergeSort implements RecursiveSortable {


    @Override
    public Integer[] sortInt(Integer[] numbers) {
        if (numbers != null) {
            return sort(numbers);
        }
        return null;
    }


    private Integer[] sort(Integer[] array) {
        if (array.length < 2) return array;

        Integer[] leftSide = sort(Arrays.copyOfRange(array, 0, array.length / 2));
        Integer[] rightSide = sort(Arrays.copyOfRange(array, array.length / 2, array.length));
        return merge(leftSide, rightSide);

    }

    private static Integer[] merge(Integer[] leftSide, Integer[] rightSide) {
        Integer[] result = new Integer[leftSide.length + rightSide.length];
        int li = 0;
        int ri = 0;
        while (true) {
            if (leftSide[li] < rightSide[ri]) {
                result[li + ri] = leftSide[li];
                li++;
            } else {
                result[li + ri] = rightSide[ri];
                ri++;
            }
            if (leftSide.length == li) {
                while (ri != rightSide.length) {
                    result[li + ri] = rightSide[ri];
                    ri++;
                }
            }
            if (rightSide.length == ri) {
                while (li != leftSide.length) {
                    result[li + ri] = leftSide[li];
                    li++;
                }
            }
            if (li + ri == result.length) break;
        }
        return result;
    }
}