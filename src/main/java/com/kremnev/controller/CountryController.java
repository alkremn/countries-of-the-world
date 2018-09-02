package com.kremnev.controller;

import com.kremnev.data.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class CountryController {

    @Autowired
    private CountryRepository countryRepository;

    @RequestMapping("/")
    public String listCountries(ModelMap modelMap){
        modelMap.put("countries", countryRepository.getAllCountries());
        return "index";
    }

    @RequestMapping("/countries/{name}")
    public String listCountryInfo(@PathVariable String name, ModelMap modelMap){
        modelMap.put("country", countryRepository.findCountryByName(name));
        return "country";
    }

    @RequestMapping("index.html")
    public String showMainPage(){
        return "redirect:/";
    }


}
