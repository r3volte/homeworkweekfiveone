package com.homeworkweekfiveone.controller;

import com.homeworkweekfiveone.service.BreweryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/brewery")
public class BreweryController {

  private static final String VALUE = "brewery";
  private static final String HTML_NAME = "breweryView";
  private BreweryService breweryService;

  @Autowired
  public BreweryController(BreweryService breweryService) {
    this.breweryService = breweryService;
  }

  @GetMapping("/all")
  public String getAllBrewery(Model model) {
    model.addAttribute(VALUE, breweryService.getAllBrewers());
    return HTML_NAME;
  }
}
