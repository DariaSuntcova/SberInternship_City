package ru.sber.model;
//name – наименование города
//
//region – регион
//
//district – федеральный округ
//
//population – количество жителей города
//
//foundation – дата основания или первое упоминание

public class City {
    private final String name;
    private final String region;
    private final String district;
    private final long population;
    private final String foundation;

    public City(String name, String region, String district, long population, String foundation) {
        this.name = name;
        this.region = region;
        this.district = district;
        this.population = population;
        this.foundation = foundation;
    }


    @Override
    public String toString() {
        return "City{" +
                "name='" + name + '\'' +
                ", region='" + region + '\'' +
                ", district='" + district + '\'' +
                ", population=" + population +
                ", foundation='" + foundation + '\'' +
                '}';
    }
}
