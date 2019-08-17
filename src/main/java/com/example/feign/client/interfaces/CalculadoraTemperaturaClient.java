package com.example.feign.client.interfaces;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(value = "temperatura-converter-service")
public interface CalculadoraTemperaturaClient {

	@RequestMapping(method = RequestMethod.GET, value = "/temperatura/converter/ctof/{tempCelsius}", produces = MediaType.APPLICATION_JSON_VALUE)
	Double celsiusToFarenheit(@PathVariable(value = "tempCelsius") Double tempCelsius);

	@RequestMapping(method = RequestMethod.GET, value = "/temperatura/converter/ctok/{tempCelsius}", produces = MediaType.APPLICATION_JSON_VALUE)
	Double celsiusToKelvin(@PathVariable(value = "tempCelsius") Double tempCelsius);

	@RequestMapping(method = RequestMethod.GET, value = "/temperatura/converter/ftoc/{tempFarenheit}", produces = MediaType.APPLICATION_JSON_VALUE)
	Double farenheitToCelsius(@PathVariable(value = "tempFarenheit") Double tempFarenheit);

	@RequestMapping(method = RequestMethod.GET, value = "/temperatura/converter/ftok/{tempFarenheit}", produces = MediaType.APPLICATION_JSON_VALUE)
	Double farenheitToKelvin(@PathVariable(value = "tempFarenheit") Double tempFarenkeit);

	@RequestMapping(method = RequestMethod.GET, value = "/temperatura/converter/ktoc/{tempKelvin}", produces = MediaType.APPLICATION_JSON_VALUE)
	Double kelvinToCelsius(@PathVariable(value = "tempKelvin") Double tempKelvin);

	@RequestMapping(method = RequestMethod.GET, value = "/temperatura/converter/ktof/{tempKelvin}", produces = MediaType.APPLICATION_JSON_VALUE)
	Double kelvinToFarenheit(@PathVariable(value = "tempKelvin") Double tempKelvin);

}
