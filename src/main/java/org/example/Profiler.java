package org.example;

import java.util.ArrayList;
import java.util.Arrays;

public class Profiler {
    private ArrayList<Integer> arr;
    private SortLib sortLib;

    public void setData(ArrayList<Integer> input) {
        arr = input;
    }

    public void setLib(SortLib inputSort){
        sortLib = inputSort;
    }

    public void runLib(){
        sortLib.runSort(arr);
    }

    public void showResult(){
        System.out.println(sortLib.getName()+" 테스트");
        System.out.println("정렬결과 : " + arr);
        System.out.println("swap 횟수 : " + sortLib.getChangeCnt() + "회");
    }
}
