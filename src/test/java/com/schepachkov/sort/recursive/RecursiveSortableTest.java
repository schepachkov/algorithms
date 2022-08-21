package com.schepachkov.sort.recursive;

import java.util.Arrays;

public class RecursiveSortableTest {

    protected Integer[] nativeSort(Integer[] numbers) {
        return Arrays.stream(numbers)
                .sorted((o1, o2) -> Integer.compare(o1, o2))
                .toArray(Integer[]::new);
    }

}
