package com.northland.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/hotel")
public class HotelsController {

    @GetMapping("/cheapest")
    public String cheapest(@RequestParam(value = "city") String city,
                           @RequestParam(value = "checkin") String checkin,
                           @RequestParam(value = "checkout") String checkout) {
        return String.format("You have request checkin on " + checkin + " and checkout on " + checkout + " for " + city);
    }
}
