package it.apuliadigital.hibernate_test.controllers;

import it.apuliadigital.hibernate_test.services.LogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/numbers")
public class LogEntityController {

    @Autowired
    LogService service;

    @RequestMapping(path = "/getRomano", method = RequestMethod.GET)
    public String getRomano(@RequestParam (value = "arabic") int arabic) {
        System.out.println(service.toRoman(arabic));
        return service.toRoman(arabic);
    }
}
