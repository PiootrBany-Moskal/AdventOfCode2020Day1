package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InputReader {

    public static List<Long> readInput() {
        Scanner scanner = null;
        try {
            scanner = new Scanner(new File("input.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();

        }

        List<Long> numbers = new ArrayList<>();
        while (scanner.hasNextLong()) {
            long number = scanner.nextLong();
            numbers.add(number);
        }

        return numbers;
    }

}
