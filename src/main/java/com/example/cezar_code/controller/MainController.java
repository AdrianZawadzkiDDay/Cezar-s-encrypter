package com.example.cezar_code.controller;

import com.example.cezar_code.models.FormEncoder;
import com.example.cezar_code.service.EncoderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


@Controller
@RequestMapping("/")
public class MainController {

    @Autowired
    EncoderService encoderService;

    @GetMapping
    public String mainPage(Model model){
        model.addAttribute("formEncoder", new FormEncoder());
        return "home";
    }

    @PostMapping("/encode")
    public String encode(@ModelAttribute FormEncoder formEncoder, Model model){
        encoderService.encodeText(formEncoder.getRawPassword());
        formEncoder.setEncodedPassword(encoderService.encodeText(formEncoder.getRawPassword()));
        model.addAttribute("formEncoder", formEncoder);

        return "matches";
    }


}
