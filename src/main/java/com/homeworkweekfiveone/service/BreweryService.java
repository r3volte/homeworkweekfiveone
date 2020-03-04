package com.homeworkweekfiveone.service;

import com.homeworkweekfiveone.model.Brewery;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class BreweryService {

  private RestTemplate restTemplate;
  private static final String URL = "https://api.openbrewerydb.org/breweries";

  public BreweryService() {
    this.restTemplate = new RestTemplate();
  }

  public Brewery[] getAllBrewers() {
    return restTemplate.getForObject(URL,
            Brewery[].class);
  }
}
