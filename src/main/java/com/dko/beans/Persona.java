package com.dko.beans;

public class Persona {
	private int id;
	private String nombre;
	private String apodo;
	
	public Persona(int id, String nombre, String apodo){
		
		this.id = id;
		this.nombre = nombre;
		this.apodo = apodo;
		
	}
	
	/*Spring relaciona de manera casi automatica al tipo de dato que se le debe asociar a cada 
	 * propeiddad, pero  Si tenemos más de un constructor con un solo parametro donde spring pueda
	 * confundirlos, como en e caso de abajo se debe de  declarar el tipo de valor del atributo rn
	 * el archvio xml beans
	 *  
	 * */
	public Persona (int id){
		this.id = id;
	}
	
	public Persona (String apodo){
		
		this.apodo = apodo;
	}
	
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApodo() {
		return apodo;
	}

	public void setApodo(String apodo) {
		this.apodo = apodo;
	}
	
	
}
