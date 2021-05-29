package com.sortingvisualizer.sorting.algorithms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SelectionSort implements ISortingAlgorithm {

    public List<Integer> sort(List<Integer> inputList) {

        int n = inputList.size();
        int smallest = 0;
        List<Integer> sortedList = new ArrayList<>();

        for(int i = 0; i < n-1; i++) {
            smallest = i;
            for(int j = i+1; j < n; j++) {

                if(inputList.get(j) < inputList.get(smallest)) {
                    smallest = j;
                }

            }

            if(smallest !=  i) {

                Collections.swap(inputList, smallest, i);

            }

        }

        return sortedList;

    }

}
