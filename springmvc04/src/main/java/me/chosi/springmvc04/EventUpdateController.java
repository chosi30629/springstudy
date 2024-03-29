package me.chosi.springmvc04;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(
        produces = MediaType.APPLICATION_JSON_UTF8_VALUE,
        consumes = MediaType.APPLICATION_JSON_UTF8_VALUE
)
public class EventUpdateController {


    @PostMapping("/events")
    @ResponseBody
    public String createEvent() {
        return "event";
    }

    @PutMapping("/events")
    @ResponseBody
    public String updateEvent() {
        return "event";
    }

}
