package org.launchcode.codingevents.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("events")
public class EventController {

    @GetMapping
        public String displayEvents(Model model){
        List events = new ArrayList<>();
        events.add("Tech Crunch");
        events.add("Hack the Planet");
        events.add("Activate Skynet");
        model.addAttribute("events", events);
        return "events/index";

    }
    @GetMapping("create")
    public String renderCreateEventForm() {
        return "events/create";
    }
}