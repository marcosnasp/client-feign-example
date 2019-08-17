package com.example.feign.client.controller;

import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.feign.client.domain.TemperaturaConversorModel;
import com.example.feign.client.interfaces.CalculadoraTemperaturaClient;

@Controller
@EnableFeignClients
public class CalculadoraTemperaturaController {

	private static final Logger LOGGER = Logger.getLogger(CalculadoraTemperaturaController.class.getName());

	@Autowired
	private CalculadoraTemperaturaClient calculadoraTemperaturaClient;

	@GetMapping("/temperaturaconversor")
	public String temperaturaConversorModelForm(Model model) {
		model.addAttribute("temperaturaConversorModel", TemperaturaConversorModel.builder().build());
		return "temperatura-converter";
	}

	@PostMapping("/temperaturaconversor")
	public String greetingSubmit(@ModelAttribute TemperaturaConversorModel temperaturaModel) {
		LOGGER.info(String
				.valueOf(calculadoraTemperaturaClient.celsiusToFarenheit(temperaturaModel.getTemperaturaEntrada())));

		temperaturaModel.setTemperaturaConvertida(
				calculadoraTemperaturaClient.celsiusToFarenheit(temperaturaModel.getTemperaturaEntrada()));

		return "temperatura-resultado";
	}

}
