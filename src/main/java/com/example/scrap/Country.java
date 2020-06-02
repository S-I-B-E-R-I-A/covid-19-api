package com.example.scrap;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Country {
    interface Fields {
        String NUMBER = "#";
        String CONTINENT = "Continent";
        String COUNTRY = "Country,_Other";
        String POPULATION = "Population";
        String NEW_CASES = "New_Cases";
        String NEW_DEATHS = "New_Deaths";
        String NEW_RECOVERED = "New_Recovered";
        String TOTAL_CASES = "Total_Cases";
        String TOTAL_DEATHS = "Total_Deaths";
        String TOTAL_RECOVERED = "Total_Recovered";
        String ACTIVE_CASES = "Active_Cases";
        String SERIOUS_AND_CRITICAL = "Serious,_Critical";
        String CASES_PER_MILLION = "Tot_Cases/_1M_pop";
        String DEATHS_PER_MILLION = "Deaths/_1M_pop";
        String FIRST_CASE = "Reported_1st_case";
        String TOTAL_TESTS = "Total_Tests";
        String TESTS_PER_MILLION = "Tests/_1M_pop";
        String DEATH_EVERY_X_PEOPLE = "1_Death_every_X_ppl";
        String CASE_EVERY_X_PEOPLE = "1_Case_every_X_ppl";
        String TEST_EVERY_X_PEOPLE = "1_Test_every_X_ppl";
    }
    @JsonProperty(Fields.NUMBER)
    public String place;
    @JsonProperty(Fields.CONTINENT)
    public String continent;
    @JsonProperty(Fields.COUNTRY)
    public String countryName;
    @JsonProperty(Fields.POPULATION)
    public String population;
    @JsonProperty(Fields.NEW_CASES)
    public String newCases;
    @JsonProperty(Fields.NEW_DEATHS)
    public String newDeaths;
    @JsonProperty(Fields.NEW_RECOVERED)
    public String newRecovered;
    @JsonProperty(Fields.TOTAL_CASES)
    public String totalCases;
    @JsonProperty(Fields.TOTAL_DEATHS)
    public String totalDeaths;
    @JsonProperty(Fields.TOTAL_RECOVERED)
    public String totalRecovered;
    @JsonProperty(Fields.ACTIVE_CASES)
    public String activeCases;
    @JsonProperty(Fields.SERIOUS_AND_CRITICAL)
    public String criticalCases;
    @JsonProperty(Fields.CASES_PER_MILLION)
    public String totalCasesPerMillion;
    @JsonProperty(Fields.DEATHS_PER_MILLION)
    public String deathPerMillion;
    @JsonProperty(Fields.FIRST_CASE)
    public String firstCase;
    @JsonProperty(Fields.TOTAL_TESTS)
    public String totalTests;
    @JsonProperty(Fields.TESTS_PER_MILLION)
    public String testsPerMillion;
    @JsonProperty(Fields.DEATH_EVERY_X_PEOPLE)
    public String deathEveryXPeople;
    @JsonProperty(Fields.CASE_EVERY_X_PEOPLE)
    public String caseEveryXPeople;
    @JsonProperty(Fields.TEST_EVERY_X_PEOPLE)
    public String testEveryXPeople;
}
