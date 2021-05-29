package com.sortingvisualizer.sorting.description;

public class AlgoDescription {

    public String bubbleSortDesc () {

        String description = "Bubble Sort is a simple sorting algorithm. It simply checks if the adjacent elements are in order (ascending or descending) and swaps otherwise. So, this way, the values keep bubbling to one end of the list/array of integers, depending on the order (the largest elements keep bubbling up the right-side of the list/array if ascending and left-side if descending)." +
                "The time complexity of Bubble sort is O(n*n) (Two for loops to sort the array). This is an in-place sorting algorithm, which means that it does not require extra set of arrays or lists for the sorting to happen, which in turns increases the space complexity. So, the space complexity is O(1), wherein the space required is not going to change with the execution of the algorithm. Bubble sort is also a stable algorithm, which means that it keeps the order of similar objects in tact. If there are two integers, for instance, of the same value, then the algorithm is going to hold that order in place and the first element is going to come first and the second is going to come after, once the sort is finished. " +
                "However, because of the time it takes to sort an algorithm, it can take a whole lot of time if the input value is large. For instance: A list with 10 elements is going to generate a time complexity of O(10*10) = O(100). When the value of n is increased exponentially to be 10000 or more, the time it would take is O(10000*10000) = O(100000000), which is quite a long time, making it comparatively slow.";

        return description;

    }

    public String selectionSortDesc() {

        String description = "Selection sort works by selecting elements and placing it in order in the list. The array would be considered to be divided into a sorted and an unsorted segment. The algorithm is then designed to pick the next smallest/largest element, depending on the order, and add them to the sorted segment of the list. This process is repeated until the size of the sorted segment is equal to the size of the input." +
                "The time complexity of Selection Sort is O(n*n) (Two loops to sort the array). This is an in-place sorting algorithm, which means that it does not require extra set of arrays or lists for the sorting to happen, which in turns increases the space complexity. So, the space complexity is O(1), wherein the space required is not going to change with the execution of the algorithm. Selection sort is an unstable algorithm, which means that it does not preserve the order of similar items. If there are two integers, for instance, of the same value, then the algorithm is not going to hold that order in place and the elements can be in any order, once the sort is finished." +
                "However, because of the time it takes to sort an algorithm, it can take a whole lot of time if the input value is large. For instance: A list with 10 elements is going to generate a time complexity of O(10*10) = O(100). When the value of n is increased exponentially to be 10000 or more, the time it would take is O(10000*10000) = O(100000000), which is quite a long time, making it comparatively slow.";

        return description;

    }

    public String insertionSortDesc() {

        String description = "Insertion sort is a simple sorting algorithm that works by comparing adjacent elements and inserting the smaller/larger element before the other element, depending on the order. The values are not swapped, rather they are directly assigned as the temporary variable holds the value of the old element, because of which, that value is never lost. This is essentially how swapping works with a temporary variable in the picture, but since we hold on to that value in the temporary before assigning it to whatever is at position j, swapping won't work. This process continues until the whole list/array is sorted." +
                "The time complexity of Insertion Sort is O(n*n) (Two loops to sort the array). This is an in-place sorting algorithm, which means that it does not require extra set of arrays or lists for the sorting to happen, which in turns increases the space complexity. So, the space complexity is O(1), wherein the space required is not going to change with the execution of the algorithm. Insertion sort is also a stable algorithm, which means that it keeps the order of similar objects in tact. If there are two integers, for instance, of the same value, then the algorithm is going to hold that order in place and the first element is going to come first and the second is going to come after, once the sort is finished. " +
                "However, because of the time it takes to sort an algorithm, it can take a whole lot of time if the input value is large. For instance: A list with 10 elements is going to generate a time complexity of O(10*10) = O(100). When the value of n is increased exponentially to be 10000 or more, the time it would take is O(10000*10000) = O(100000000), which is quite a long time, making it comparatively slow.";

        return description;

    }

    public String shellSortDesc() {

        String description = "Shell sort is a variation of Insertion sort ";

        return description;

    }

    public String mergeSortDesc() {

        String description = "Merge sort makes use of the divide and conquer algorithm. The divide and conquer algorithm divides the array/list into halves, then calls itself for halves all the way until the array cannot be divided anymore. The halves are then sorted to be combined, which calls itself to sort and merge the next set of halves until the entire list is sorted and merged. The implementation of this algorithm uses recursion." +
                "The time complexity of Merge sort is O(n log n). This is not an in-place algorithm, for the most part. The space required is dynamic and depends on how big the size of the input is. That is because the recursive calls run until there are only single elements in each of the halves. How many of those halves would be generated is entirely dependent on how big the input is. And it would take the same steps to merge the halves to form the entire array back again,  but sorted. So, the space complexity is O(n). Merge sort is a stable algorithm, which means that it keeps the order of similar objects in tact. If there are two integers, for instance, of the same value, then the algorithm is going to hold that order in place and the first element is going to come first and the second is going to come after, once the sort is finished. " +
                "Merge sort can be considered inefficient for smaller tasks and for arrays that are sorted, for the most part as it will go through the whole process even if the array is sorted.";

        return description;

    }

    public String quickSortDesc() {

        String description = "";

        return description;

    }

    public String radixSortDesc() {

        String description = "";

        return description;

    }

}
