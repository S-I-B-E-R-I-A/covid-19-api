package com.example.scrap;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Country {
    @JsonProperty("Country,_Other")
    public String countryName;
    @JsonProperty("New_Cases")
    public String newCases;
    @JsonProperty("New_Deaths")
    public String newDeaths;
    @JsonProperty("Total_Cases")
    public String totalCases;
    @JsonProperty("Total_Deaths")
    public String totalDeaths;
    @JsonProperty("Total_Recovered")
    public String totalRecovered;
    @JsonProperty("Active_Cases")
    public String activeCases;
    @JsonProperty("Serious,_Critical")
    public String criticalCases;
    @JsonProperty("Tot_Cases/_1M_pop")
    public String totalCasesPerMillion;
    @JsonProperty("Deaths/_1M_pop")
    public String deathPerMillion;
    @JsonProperty("Reported_1st_case")
    public String firstCase;

}
