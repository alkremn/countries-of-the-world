package com.kremnev.model;

import java.util.ArrayList;
import java.util.List;

public class Country {

    private String name;
    private String population;
    private String capitalCity;
    private List<String> officialLangList;

    public Country(String name, String population, String capitalCity, List<String> officialLang) {
        this.name = name;
        this.population = population;
        this.capitalCity = capitalCity;
        this.officialLangList = officialLang;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPopulation() {
        return population;
    }

    public void setPopulation(String population) {
        this.population = population;
    }

    public String getCapitalCity() {
        return capitalCity;
    }

    public void setCapitalCity(String capitalCity) {
        this.capitalCity = capitalCity;
    }

    public List<String> getOfficialLangList() {
        return new ArrayList<>(this.officialLangList);
    }

    public void setOfficialLang(List<String> officialLangList) {
        this.officialLangList = officialLangList;
    }
}