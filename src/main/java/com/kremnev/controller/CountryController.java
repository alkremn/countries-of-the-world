package com.kremnev.controller;

import com.kremnev.data.CountryRepository;
import com.kremnev.model.Country;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;


@Controller
public class CountryController {

    @Autowired
    private CountryRepository countryRepository;

    @RequestMapping("/")
    public String listCountries(ModelMap modelMap) {
        modelMap.put("countries", countryRepository.getAllCountries());
        return "index";
    }

    @RequestMapping("/countries/{name}")
    public String listCountryInfo(@PathVariable String name, ModelMap modelMap) {
        modelMap.put("country", countryRepository.findCountryByName(name));
        return "country";
    }

    @RequestMapping("index.html")
    public String showMainPage() {
        return "redirect:/";
    }

    @RequestMapping("/sortby/{type}")
    public String sortBy(@PathVariable String type, ModelMap modelMap) {
        List<Country> countries = countryRepository.getAllCountries();
        if (type.equals("name")) {
            countries.sort(Comparator.comparing(Country::getName));
        } else if (type.equals("population")) {
            countries.sort(Comparator.comparing(Country::getPopulationInt));
            Collections.reverse(countries);
        }
        modelMap.put("countries", countries);
        return "index";
    }

}
