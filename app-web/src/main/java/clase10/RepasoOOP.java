package clase10;

import java.util.Scanner;

public class RepasoOOP {
	//punto de inicio de la aplicación
	public static void main(String[] args) {
		//crear un   clase: molde para crear objetos
		
		//instanciar un objeto de esa clase: objeto vivo
		Animal perro=new  Animal("azul");//invocar el contructor de la clase animal
		
		
		//ejecutar un metodo de ese objeto: accion/comportamiento del objeto vivo
		
		perro.hablar();
		
		System.out.println(perro.getColor());
		
		//voy a cambiar el color del perro
		perro.setColor("negro");
		System.out.println(perro.getColor());
		
		//le pedimos al usuario que ingerse la edad  del animal
		Scanner tc=new Scanner(System.in);
		Integer edad;
		do {
			System.out.println("ingrese la edad del animal");
			//debo de controlar el error
			edad=tc.nextInt();
			
		}while(edad==null);
		//invoco el metodo setEdad() del objeto perro
		perro.setEdad(edad);
		System.out.println(perro.getEdad());
		
	}

}
