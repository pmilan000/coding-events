package org.launchcode.codingevents.controllers;

import org.launchcode.codingevents.data.EventData;
import org.launchcode.codingevents.models.Event;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("events")
public class EventController {

    @GetMapping
        public String displayEvents(Model model){
            model.addAttribute("title", "All Events");
            model.addAttribute("events", EventData.getAll());
            return "events/index";

    }
    @GetMapping("create")
    public String renderCreateEventForm(Model model) {
        model.addAttribute("title", "Create Event");
        return "events/create";
    }

    @PostMapping("create")
    public String createEvent(@RequestParam String eventName, @RequestParam String eventDescription,
                              @RequestParam String eventLocation) {
        EventData.add(new Event(eventName, eventDescription, eventLocation));
        return "redirect:";
    }
    @GetMapping("remove")
    public String renderRemoveEventForm(Model model) {
        model.addAttribute("title", "Remove Event");
        return "events/remove";
    }
}