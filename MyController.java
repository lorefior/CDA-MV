package com.calculo.neto.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.calculo.neto.AppNeto;

@Controller
public class MyController {

	@GetMapping("/sueldoNeto")
	public String sueldoNetoForm(Model model) {
		model.addAttribute("sueldoNeto", new AppNeto());
		return "sueldoNeto";
	}

	@PostMapping("/sueldoNeto")
	public String sueldoNetoSubmit(@ModelAttribute AppNeto sueldoNeto, double sueldo, double jubilacion, double pami, double obraSocial) {
		sueldoNeto.pamiCal(sueldo);
		sueldoNeto.jubCal(sueldo);
		sueldoNeto.netoCal(sueldo, jubilacion, pami, obraSocial);
		sueldoNeto.obraCal(sueldo);

		return "sueldoNeto";
	}

}