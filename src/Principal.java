

import java.util.ArrayList;

public class Principal {

	public static void main(String[] args) {
		
		//Creamos 3 objetos Animal
		Animal perro = new Animal();
		Animal delfin = new Animal();
		Animal gorrion = new Animal();
		
		//Le damos unos valores para poder usarlos
		perro.setNombre("Laika");
		delfin.setNombre("Flipper");
		gorrion.setNombre("Manchurrón");
		
		//Creamos la lista y añadimos esos animales al arrayList
		ArrayList<Animal> listaAnimales = new ArrayList<Animal>();
		listaAnimales.add(perro);
		listaAnimales.add(delfin);
		listaAnimales.add(gorrion);
		
		System.out.println(listaAnimales);
		

	}

}
