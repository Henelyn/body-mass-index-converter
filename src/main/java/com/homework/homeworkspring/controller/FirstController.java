package com.homework.homeworkspring.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
    /*The @Controller annotation indicates that a particular class serves the role of a controller.
    Spring Controller annotation is typically used in combination with annotated handler methods
    based on the @RequestMapping annotation. It can be applied to class only.
    It's used to mark a class as a web request handler. (On the bean you can choose these classes
    CONTROLLER IS THE PART OF APPLICATION THAT IS RESPONSIBLE FOR
    HANDLING THE REQUEST AND PROVIDING THE REVIEW  */
@Slf4j
    /* @Slf4j causes lombok to generate a logger field.
    Complete documentation is found at the project lombok features page for lombok log annotations
    WILL GENERATE A SINGLETON WITH ONE INSTANCE FOR LOG */
public class FirstController {

    @GetMapping("/first-page-with-parameters") // /text is called ENDPOINT
    /*The @GetMapping annotated methods in the @Controller annotated classes handle the
     HTTP GET requests matched with given URI expression.
     BASED ON THAT URL WE GAVE TO @GetMapping ADDRESS THAT/THIS METHOD WILL BE FIRED */


    public String parameters() { //That String is the name of template
        log.info("parameters() method is called "); //that's just an information for log so ill see the method is called
        return "home-page";
    }

    @GetMapping("/second-page-converted")
    public String converted(@RequestParam("firstName") String firstName,
                            @RequestParam("height") double heightInCm,
                            @RequestParam("weight") double weightInKg,
                            Model pageParameters)
    {
        log.info("converted() method is called");
        double convertedHeightInInches = heightInCm * 0.39;
        double convertedWeightInPounds = weightInKg * 2.2;

        pageParameters.addAttribute("name", firstName)
                .addAttribute("height", heightInCm)
                .addAttribute("weight", weightInKg)
                .addAttribute("heightInInches", convertedHeightInInches)
                .addAttribute("weightInPounds", convertedWeightInPounds);
        return "converted-page";
    }
}