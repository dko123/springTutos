package springTutosCode;

public class Test {

	public static void main(String[] args) {
//##########################################		
		/*
		 * Inyección  de dependecias con interfaz
		 * */
		
		Messi m1 = new Messi(new Barcelona());
		m1.mostrarEquipo();
		
		
		
		Messi m2 = new Messi(new Juventus());
		m2.setEquipo(new Juventus());
		m2.mostrarEquipo();
		
		
		
		
//		//inyeccion de dependencias con constructor
//		Messi messi = new Messi(new Barcelona());
//		messi.getBarcelona().mostrar();
//		
//		//inyeccion de dependencias con metodos get y set
//		Messi messi2 = new Messi();
//		messi2.setBarcelona(new Barcelona());
//		messi2.getBarcelona().mostrar();
//		
		
		
		
		//sin inyeccion de dependecias
		//Messi messi = new Messi();
		//messi.bar.mostrar();

	}

}
