package com.epam.wma_exercise.test;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.epam.wma_exercise.homepage.controller.HomepageController;
import com.epam.wma_exercise.service.PersonLookupService;

public class HomepageControllerTest {

    private HomepageController controller;

    private PersonLookupService personLookupService;

    @BeforeMethod
    public void setUp() {
        controller = new HomepageController(personLookupService);
    }

    @Test
    public void testHomepageControllerShouldReturnHomepageLogicalViewName() {
        // GIVEN

        // WHEN
        String result = controller.homepage();

        // THEN
        Assert.assertEquals(result, "homepage");
    }

}
