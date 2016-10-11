package com.epam.wma_exercise.homepage.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.epam.wma_exercise.homepage.model.HomepageModel;
import com.epam.wma_exercise.service.PersonLookupService;

@Controller
public class HomepageController {

    private static final String REQUEST_MAPPING = "/";

    private PersonLookupService personLookupService;

    @Autowired
    public HomepageController(PersonLookupService personLookupService) {
        this.personLookupService = personLookupService;
    }

    @ModelAttribute("homepageModel")
    public HomepageModel homepageModel() {
        HomepageModel result = new HomepageModel();
        result.setApplicationName("wma exercise web app");
        result.setPeople(personLookupService.findAll());

        return result;
    }

    @RequestMapping(REQUEST_MAPPING)
    public String homepage() {
        return "homepage";
    }

}
