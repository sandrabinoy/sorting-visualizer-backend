package com.sortingvisualizer.sorting.buttoncontrols;

import com.sortingvisualizer.sorting.description.AlgoDescription;
import com.sortingvisualizer.sorting.entity.Algorithms;

import java.util.List;
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

    public Algorithms getBubbleSortInfo(Integer algoId) {

        AlgoDescription description = new AlgoDescription();

        switch (algoId)
        {
            //Bubble Sort
            case 1:
                Algorithms bubbleSort = new Algorithms("Bubble Sort", description.bubbleSortDesc());
                return bubbleSort;

                //Selection Sort
            case 2:
                Algorithms selectionSort = new Algorithms("Selection Sort", description.selectionSortDesc());
                return selectionSort;

                //Insertion Sort
            case 3:
                Algorithms insertionSort = new Algorithms("Insertion Sort", description.insertionSortDesc());
                return insertionSort;

                //Shell Sort
            case 4:
                Algorithms shellSort = new Algorithms("Shell Sort", description.shellSortDesc());
                return shellSort;

                //Merge Sort
            case 5:
                Algorithms mergeSort = new Algorithms("Merge Sort", description.mergeSortDesc());
                return mergeSort;

                //Quick Sort
            case 6:
                Algorithms quickSort = new Algorithms("Quick Sort", description.quickSortDesc());
                return quickSort;

            default:
                return null;

        }

    }

}