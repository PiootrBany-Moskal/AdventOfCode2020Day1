package com.company;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Long> input = InputReader.readInput();

        Solution1.solve(input);
        Solution2.solve(input);
    }
}
