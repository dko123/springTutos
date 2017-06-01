package springTutosCode;

import com.dko.interfaces.IEquipo;

public class Messi {
	/*Aplicando inyección de dependencias 
	 * a traves de interfaz por medio de polimorfismo.
	 * */
	
	private IEquipo equipo;
	
	public Messi(){
		
	}
	
	public Messi(IEquipo equipo){
		this.equipo = equipo;
	}
	
	public void mostrarEquipo(){
		
		equipo.mostrar();
	}

	public IEquipo getEquipo() {
		return equipo;
	}

	public void setEquipo(IEquipo equipo) {
		this.equipo = equipo;
	}

}
//##########################################
/*
 * Con inyección de dependencias (simple)
 */
// public class Messi {
// private Barcelona barcelona;
//
// public Messi() {
//
// }
//
// public Messi(Barcelona bar) {
// this.barcelona = bar;
// }
// public void setBarcelona(Barcelona barcelona) {
// this.barcelona = barcelona;
// }
// public Barcelona getBarcelona() {
// return barcelona;
// }
//
//
// }
//##########################################
/*
 * Sin inyección de dependencias
 * 
 * Tenemos dependencias fuertemente acopladas entre la clase Messi y la clase
 * Barcelona
 */
// public class Messi {
// Barcelona bar = new Barcelona();
//
// public void mostrarEquipo(){
// bar.mostrar();
// }
//
// }
