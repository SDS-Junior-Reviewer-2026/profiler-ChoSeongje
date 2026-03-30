package org.example;

import java.util.ArrayList;
import java.util.Arrays;

public class BubbleSort implements SortLib {
    private int changeCnt = 0;

    private void bubbleSort(ArrayList<Integer> arr) {
        for (int i = 0; i < arr.size() - 1; i++) {
            for (int j = 0; j < arr.size() - 1 - i; j++) {
                if (arr.get(j) > arr.get(j + 1)) {
                    changeCnt++;
                    int temp = arr.get(j);
                    arr.set(j, arr.get(j + 1));
                    arr.set(j + 1, temp);
                }
            }
        }
    }

    @Override
    public void runSort(ArrayList<Integer> arr) {
        bubbleSort(arr);
    }

    @Override
    public int getChangeCnt() {
        return changeCnt;
    }

    @Override
    public String getName() {
        return "BubbleSort";
    }
}