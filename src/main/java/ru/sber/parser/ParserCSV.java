package ru.sber.parser;

import ru.sber.model.City;

import java.util.Scanner;

public class ParserCSV {
    private static int count;
    private static String name;
    private static String region;
    private static String district;
    private static long population;
    private static String foundation;

    public static Generic<Integer, City> parseCSVLine(String line) {
        try (Scanner scanner = new Scanner(line)) {
            scanner.useDelimiter(";");

            int index = 0;

            while (scanner.hasNext()) {
                String data = scanner.next();
                if (index == 0) count = Integer.parseInt(data);
                else if (index == 1) name = data;
                else if (index == 2) region = data;
                else if (index == 3) district = data;
                else if (index == 4) population = Long.parseLong(data);
                else if (index == 5) foundation = data;
                index++;
            }
        }
        return new Generic<>(count, new City(name, region, district, population, foundation));
    }
}
