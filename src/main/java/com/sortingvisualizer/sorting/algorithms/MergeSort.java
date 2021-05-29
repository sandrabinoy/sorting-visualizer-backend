package com.sortingvisualizer.sorting.algorithms;

import java.util.List;

public class MergeSort {

    public List<Integer> sort(List<Integer> inputList, int start, int end) {

        if(end - start < 2) {
            return null;
        }
        int mid = (start+end) / 2;
        //Left
        sort(inputList, start, mid);
        sort(inputList, mid, end);
        return merge(inputList, start, mid, end);
    }

    public List<Integer> merge(List<Integer> inputList, int start, int mid, int end) {

        if(inputList.get(mid-1) <= inputList.get(mid)) {
            return null;
        }

        int i = start;
        int j = mid;
        int tempIndex = 0;

        int[] temp = new int[end-start];

        while(i<mid && j < end) {

            temp[tempIndex++] = inputList.get(i) <= inputList.get(j) ? inputList.get(i++) : inputList.get(j++);

        }

        System.arraycopy(inputList, i, inputList, start + tempIndex, mid - i);
        System.arraycopy(temp, 0, inputList, start, tempIndex);

        return inputList;

    }

}
