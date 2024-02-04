package TestingProject.tst.controllers;

import TestingProject.tst.services.PropertiesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/properties")
public class PropertiesController {
    @Autowired
    private PropertiesService propertiesService;

    @GetMapping
    public String getString() {
        return propertiesService.getString();
    }

    @PostMapping(path = "/{value}")
    public void setValue(@PathVariable Integer value) {
        propertiesService.setFlag(value);
    }
}
