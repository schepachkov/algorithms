package com.schepachkov.sort.simple;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

class ShakeSortTest extends SortableTest {

    @Test
    void sortDouble() {
        SimpleSortable simpleSortable = new ShakeSort();
        List<Double> emptyList = new ArrayList<>();
        List<Double> singleList = new ArrayList<>();
        List<Double> commonSmallList = new ArrayList<>();
        List<Double> commonLargeList = new ArrayList<>();

        fillList(singleList, 1);
        fillList(commonSmallList, 11);
        fillList(commonLargeList, 500);

        assertArrayEquals(nativeSort(commonSmallList).toArray(new Double[0]), customSort(simpleSortable, commonSmallList).toArray(new Double[0]));
        assertArrayEquals(nativeSort(commonLargeList).toArray(new Double[0]), customSort(simpleSortable, commonLargeList).toArray(new Double[0]));
        assertArrayEquals(nativeSort(singleList).toArray(new Double[0]), customSort(simpleSortable, singleList).toArray(new Double[0]));
        assertArrayEquals(nativeSort(emptyList).toArray(new Double[0]), customSort(simpleSortable, emptyList).toArray(new Double[0]));
        assertDoesNotThrow(() -> simpleSortable.sortDouble(null));
    }
}