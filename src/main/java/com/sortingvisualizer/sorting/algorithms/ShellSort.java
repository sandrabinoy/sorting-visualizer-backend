package com.sortingvisualizer.sorting.algorithms;

import java.util.List;

public class ShellSort implements ISortingAlgorithm {

    public List<Integer> sort(List<Integer> inputList) {

        int n = inputList.size();

        for(int gap = n/2; gap > 0; gap/=2) {

            for(int i = gap; i < n; i++) {

                int temp = inputList.get(i);
                int j = i;

                while(j >= gap && inputList.get(j - gap) > temp) {

                    inputList.add(inputList.get(j-gap), j);
                    j -= gap;

                }

                inputList.add(temp, j);

            }

        }

        return inputList;

    }

}
