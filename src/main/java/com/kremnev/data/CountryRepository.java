package com.kremnev.data;

import com.kremnev.model.Country;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
public class CountryRepository {

    private static final List<Country> ALL_COUNTRIES = Arrays.asList(
            new Country("India", "1,324,171,354", "New Delhi", Arrays.asList("Hindi", "English")),
            new Country("Kenya", "49,125,325", "Nairobi", Arrays.asList("English", "Swahili")),
            new Country("Ecuador", "16,385,068", "Quito", Arrays.asList("Spanish")),
            new Country("France", "67,186,638", "Paris", Arrays.asList("French")),
            new Country("Italy", "60,483,973", "Rome", Arrays.asList("Italian"))
    );

    public List<Country> getAllCountries(){
        return new ArrayList<>(ALL_COUNTRIES);
    }

    public Country findCountryByName(final String name){
        return ALL_COUNTRIES.stream()
                .filter(country -> country.getName().toLowerCase().equals(name.toLowerCase()))
                .findFirst()
                .orElse(null);
    }

}
