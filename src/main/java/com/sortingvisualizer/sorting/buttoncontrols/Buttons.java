package com.sortingvisualizer.sorting.buttoncontrols;

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

}