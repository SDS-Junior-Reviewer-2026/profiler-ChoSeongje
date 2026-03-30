package org.example;

import java.util.ArrayList;

public class InsertionSort implements SortLib {
    private int changeCnt = 0;

    private void insertionSort(ArrayList<Integer> arr) {
        int n = arr.size();

        for (int i = 1; i < n; i++) {
            int key = arr.get(i); // 이번에 자리를 찾아줄 타겟 데이터
            int j = i - 1;

            // 타겟 데이터(key)보다 큰 값들을 만나면 오른쪽으로 한 칸씩 밉니다.
            while (j >= 0 && arr.get(j) > key) {
                changeCnt++; // 데이터를 밀어낼 때마다 카운트 증가
                arr.set(j + 1, arr.get(j));
                j--;
            }

            // 빈자리에 타겟 데이터를 쏙 집어넣습니다.
            arr.set(j + 1, key);
        }
    }

    @Override
    public void runSort(ArrayList<Integer> arr) {
        insertionSort(arr);
    }

    @Override
    public int getChangeCnt() {
        return changeCnt;
    }

    @Override
    public String getName() {
        return "InsertionSort";
    }
}