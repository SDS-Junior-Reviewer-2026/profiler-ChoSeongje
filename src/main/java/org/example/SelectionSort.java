package org.example;

import java.util.ArrayList;
import java.util.Arrays;

public class SelectionSort implements SortLib {
    private int changeCnt = 0;

    // selection sort 오름차순 예시코드
    private void selectionSort(ArrayList<Integer> arr) {
        changeCnt = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) > arr.get(j)) {
                    changeCnt++;
                    int temp = arr.get(i);
                    arr.set(i, arr.get(j));
                    arr.set(j, temp);
                }
            }
        }
    }

    @Override
    public void runSort(ArrayList<Integer> arr) {
        selectionSort(arr);
    }

    @Override
    public int getChangeCnt() {
        return changeCnt;
    }

    @Override
    public String getName() {
        return "SelectionSort";
    }
}