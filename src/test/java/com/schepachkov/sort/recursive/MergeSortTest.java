package com.schepachkov.sort.recursive;

import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

class MergeSortTest extends RecursiveSortableTest {

    @Test
    void sortDouble() {
        RecursiveSortable recursiveSortable = new MergeSort();
        Integer[] emptyArr = new Integer[0];
        Integer[] singleArr = new Integer[1];
        Integer[] commonSmallArr = new Integer[11];
        Integer[] commonLargeArr = new Integer[500];

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

    private void fillArr(Integer[] arr) {
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt();
        }
    }
}