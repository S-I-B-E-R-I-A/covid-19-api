package com.example.scrap;

import java.util.List;

public class Hasher {

    private long timestamp = 0L;
    private List<Country> countries;

    public void saveCountries(List<Country> countries) {
        this.countries = countries;
        this.timestamp = System.currentTimeMillis();
    }

    public List<Country> getCountries() {
        return countries;
    }

    public boolean isCountriesAvailable() {
        return System.currentTimeMillis() - timestamp < 10000;
    }
}
