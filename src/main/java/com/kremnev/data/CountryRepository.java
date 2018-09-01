package com.kremnev.data;

import com.kremnev.model.Country;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
public class CountryRepository {

    private static final List<Country> ALL_COUNTRIES = Arrays.asList(
            new Country("India", 1_324_171_354, "New Delhi", Arrays.asList("Hindi", "English")),
            new Country("Kenya", 49_125_325, "Nairobi", Arrays.asList("English", "Swahili")),
            new Country("Ecuador", 16_385_068, "Quito", Arrays.asList("Spanish")),
            new Country("France", 67_186_638, "Paris", Arrays.asList("French")),
            new Country("Italy", 60_483_973, "Rome", Arrays.asList("Italian"))
    );

    public List<Country> getAllCountries(){
        return ALL_COUNTRIES;
    }


}
