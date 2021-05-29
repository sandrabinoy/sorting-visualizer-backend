package com.sortingvisualizer.sorting.algorithms;

import java.util.List;

public class InsertionSort implements ISortingAlgorithm {

    public List<Integer> sort(List<Integer> inputList) {

        int n = inputList.size();
        int temp = 0;

        for (int i = 1; i < n; i++) {

            temp = inputList.get(i);
            int j = 0;

            for (j = i; j > 0 && temp < inputList.get(j-1); j--) {

                inputList.set(j, inputList.get(j-1));

            }
            inputList.set(j, temp);

        }

        return inputList;

    }

}
