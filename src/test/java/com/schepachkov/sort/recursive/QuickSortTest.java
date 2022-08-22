package com.schepachkov.sort.recursive;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QuickSortTest extends RecursiveSortableTest {

    @Test
    void sortInt() {
        RecursiveSortable recursiveSortable = new QuickSort();
        Integer[] emptyArr = new Integer[0];
        Integer[] singleArr = new Integer[1];
        Integer[] commonSmallArr = new Integer[11];
        Integer[] commonLargeArr = new Integer[500_000];

        fillArr(singleArr);
        fillArr(commonSmallArr);
        fillArr(commonLargeArr);

        assertArrayEquals(nativeSort(commonSmallArr), recursiveSortable.sortInt(commonSmallArr));
        assertArrayEquals(nativeSort(commonLargeArr), recursiveSortable.sortInt(commonLargeArr));
        assertArrayEquals(nativeSort(singleArr), recursiveSortable.sortInt(singleArr));
        assertArrayEquals(nativeSort(emptyArr), recursiveSortable.sortInt(emptyArr));
        assertDoesNotThrow(() -> recursiveSortable.sortInt(null));
        assertNull(recursiveSortable.sortInt(null));
    }
}