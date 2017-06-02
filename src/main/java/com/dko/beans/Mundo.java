package com.dko.beans;

import org.springframework.beans.factory.annotation.Value;

public class Mundo {
	@Value("Hello Word!!")
	private String saludo;

	public String getSaludo() {
		return saludo;
	}

	public void setSaludo(String saludo) {
		this.saludo = saludo;
	}
	
}
