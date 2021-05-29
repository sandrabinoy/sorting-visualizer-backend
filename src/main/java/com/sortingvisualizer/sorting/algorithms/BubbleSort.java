package com.sortingvisualizer.sorting.algorithms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BubbleSort implements ISortingAlgorithm {

    public List<Integer> sort(List<Integer> inputList) {

        int n = inputList.size();
        List<Integer> sortedArray = new ArrayList<>();

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (inputList.get(j) > inputList.get(j + 1)) {

                    Collections.swap(inputList, j, j+1);

                }
            }
        }

        return sortedArray;
    }

}
