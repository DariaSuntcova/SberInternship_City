package ru.sber;

import ru.sber.model.City;
import ru.sber.parser.Generic;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import static ru.sber.parser.ParserCSV.parseCSVLine;

public class Main {
    private static final String FILE_NAME = "src/main/resources/data.csv";
    private static final Map<Integer, City> CITY_MAP = new HashMap<>();

    public static void main(String[] args) throws IOException {
        try (Scanner scanner = new Scanner(new File(FILE_NAME))) {
            while (scanner.hasNext()) {
                Generic<Integer, City> generic = parseCSVLine(scanner.nextLine());
                CITY_MAP.put(generic.integer(), generic.city());
            }
        }

        for (City city : CITY_MAP.values()) {
            System.out.println(city);
        }
    }
}