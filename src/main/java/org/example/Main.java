package org.example;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Profiler profiler = new Profiler();

        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(5,5,5,5,1));
        profiler.setData(input);
        profiler.setLib(new InsertionSort());
        profiler.runLib();
        profiler.showResult();
    }
}