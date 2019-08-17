package com.example.feign.client.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class TemperaturaConversorModel {

	private Double temperaturaEntrada;
	private Double temperaturaConvertida;

}
