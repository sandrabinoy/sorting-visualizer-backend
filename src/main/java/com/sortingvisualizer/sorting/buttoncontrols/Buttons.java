package com.sortingvisualizer.sorting.buttoncontrols;

import com.sortingvisualizer.sorting.description.AlgoDescription;
import com.sortingvisualizer.sorting.entity.Algorithm;

import java.util.Random;

public class Buttons {

    /**
     * Generate a new Array of given size
     * @param size
     * @return
     */
    public int[] newArray(int size) {

        Random random = new Random();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt();
        }

        return array;

    }

    /**
     * Increase/Decrease the size of the array
     * @param increaseSize
     * @param size
     * @return
     */
    public int changeSize(boolean increaseSize, int size) {

        if(increaseSize) {
            //Increase the size by 25
            size += 25;
        }
        else {
            //Else decrease the size by 25
            size -= 25;
        }

        return size;

    }

    /**
     * Increase/Decrease the speed of sorting
     * @param increaseSpeed
     * @param speed
     * @return
     */
    public int changeSpeed(boolean increaseSpeed, int speed) {

        if(increaseSpeed) {
            speed += 25;
        }
        else {
            speed -= 25;
        }

        return speed;

    }

    public Algorithm getBubbleSortInfo(Integer algoId) {

        AlgoDescription description = new AlgoDescription();

        switch (algoId)
        {
            //Bubble Sort
            case 1:
                Algorithm bubbleSort = new Algorithm("Bubble Sort", description.bubbleSortDesc());
                return bubbleSort;

                //Selection Sort
            case 2:
                Algorithm selectionSort = new Algorithm("Selection Sort", description.selectionSortDesc());
                return selectionSort;

                //Insertion Sort
            case 3:
                Algorithm insertionSort = new Algorithm("Insertion Sort", description.insertionSortDesc());
                return insertionSort;

                //Shell Sort
            case 4:
                Algorithm shellSort = new Algorithm("Shell Sort", description.shellSortDesc());
                return shellSort;

                //Merge Sort
            case 5:
                Algorithm mergeSort = new Algorithm("Merge Sort", description.mergeSortDesc());
                return mergeSort;

                //Quick Sort
            case 6:
                Algorithm quickSort = new Algorithm("Quick Sort", description.quickSortDesc());
                return quickSort;

            default:
                return null;

        }

    }

}