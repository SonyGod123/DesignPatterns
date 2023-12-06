package Sort;

import java.util.Arrays;

public class Selection_Sort {
        public static void selectionSort(int[] arr) {
            int n = arr.length;

            for (int i = 0; i < n - 1; i++) {
                int minIndex = i;

                // Find the index of the minimum element in the unsorted part of the array
                for (int j = i + 1; j < n; j++) {
                    if (arr[j] < arr[minIndex]) {
                        minIndex = j;
                    }
                }

                // Swap the found minimum element with the first element of the unsorted part
                int temp = arr[minIndex];
                arr[minIndex] = arr[i];
                arr[i] = temp;
            }
        }

        public static void main(String[] args) {
            int[] array = {64, 25, 12, 22, 11};

            System.out.println("Original Array: " + Arrays.toString(array));

            // Apply selection sort
            selectionSort(array);

            System.out.println("Sorted Array: " + Arrays.toString(array));
        }
    }

