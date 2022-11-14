package com.wildcodeschool.myProject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class DoctorController {

    @GetMapping("/doctor")
    @ResponseBody
    public String index(@RequestParam int id) {
        String doctorName = "";
        switch(id) {
            case 1: doctorName = "William Hartnell"; break;
            case 10: doctorName = "David Tennant"; break;
            case 13: doctorName = "Jodie Whittaker"; break;
        }
        return "Greetings from " + doctorName + " !";
    }
}
