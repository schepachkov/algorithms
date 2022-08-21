package com.schepachkov.sort.simple;

import com.schepachkov.sort.simple.SimpleSortable;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class SortableTest {


    protected void fillList(List<Double> list, int size) {
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            list.add(random.nextDouble());
        }
    }

    protected List<Double> nativeSort(List<Double> numbers) {
        ArrayList<Double> nativeResult = new ArrayList<>(numbers);
        nativeResult.sort((o1, o2) -> Double.compare(o1, o2));
        return nativeResult;
    }

    protected List<Double> customSort(SimpleSortable simpleSortable, List<Double> numbers) {
        ArrayList<Double> result = new ArrayList<>(numbers);
        simpleSortable.sortDouble(result);
        return result;
    }


}
