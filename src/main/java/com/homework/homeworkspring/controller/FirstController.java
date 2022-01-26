package com.homework.homeworkspring.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

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

    @GetMapping("/first-page-with-parameters")
    /*The @GetMapping annotated methods in the @Controller annotated classes handle the
     HTTP GET requests matched with given URI expression.
     BASED ON THAT URL WE GAVE TO @GetMapping ADDRESS THAT/THIS METHOD WILL BE FIRED */


    public String parameters() { //That String is the name of template
        log.info("parameters() method is called ");
        return "home-page";
    }

    @GetMapping("/second-page-converted")
    public String converted() {
        log.info("converted() method is called ");
        return "converted-page";
    }
}
