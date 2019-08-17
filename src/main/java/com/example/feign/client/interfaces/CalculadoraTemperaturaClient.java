package com.example.feign.client.interfaces;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(value = "temperatura-converter-service")
public interface CalculadoraTemperaturaClient {

	@RequestMapping(method = RequestMethod.GET, 
			value = "/temperatura/converter/ctof/{tempCelsius}", 
			produces = MediaType.APPLICATION_JSON_VALUE)
	Double celsiusToFarenheit(@PathVariable(value = "tempCelsius") Double tempCelsius);

	/*
	 * @GetMapping("/ctok/{tempCelsius}") Double celsiusToKelvin(@PathVariable
	 * Double tempCelsius);
	 * 
	 * @GetMapping("/ftoc/{tempFarenheit}") Double farenheitToCelsius(@PathVariable
	 * Double tempFarenheit);
	 * 
	 * @GetMapping("/ftok/{tempFarenheit}") Double farenheitToKelvin(@PathVariable
	 * Double tempFarenkeit);
	 * 
	 * @GetMapping("/ktoc/{tempKelvin}") Double kelvinToCelsius(@PathVariable Double
	 * tempKelvin);
	 * 
	 * @GetMapping("/ktof/{tempKelvin}") Double kelvinToFarenheit(@PathVariable
	 * Double tempKelvin);
	 */

}
