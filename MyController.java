package com.calculo.neto.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.calculo.neto.Greeting;

@Controller
public class MyController{

    @GetMapping("/greeting")
    public String greetingForm(Model model) {
        model.addAttribute("greeting", new Greeting());
        return "greeting";
    }

    @PostMapping("/greeting")
    public String greetingSubmit(@ModelAttribute Greeting greeting, float sueldo) {
    	greeting.juilacion(sueldo);
    	greeting.obraSocial(sueldo);
    	greeting.pamiley(sueldo);
    	greeting.sueldoneto(sueldo);
        return "greeting";
    }

}
