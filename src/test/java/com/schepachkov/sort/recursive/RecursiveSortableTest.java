package com.schepachkov.sort.recursive;

import java.util.Arrays;
import java.util.Random;

public class RecursiveSortableTest {

    protected Integer[] nativeSort(Integer[] numbers) {
        return Arrays.stream(numbers)
                .sorted((o1, o2) -> Integer.compare(o1, o2))
                .toArray(Integer[]::new);
    }

    protected void fillArr(Integer[] arr) {
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(1_000_000);
        }
    }

}
