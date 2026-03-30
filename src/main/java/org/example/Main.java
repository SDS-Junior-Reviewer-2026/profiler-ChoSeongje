package org.example;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Profiler profiler = new Profiler();

        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(5,2,1,3,1,2,6,9));
        profiler.setData(input);
        profiler.setLib(new SelectionSort());
        profiler.runLib();
        profiler.showResult();
    }
}