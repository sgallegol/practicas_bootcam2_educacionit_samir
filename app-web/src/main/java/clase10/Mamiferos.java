package clase10;
//tiene lo mismo que un animal, en cuanto a atributos
//nacen de una amnera particular
//sus propias métodos

public class Mamiferos extends Animal {
	
	private Integer tiempoGestacion;

	public Mamiferos(String color, Integer tiempoGestacion) {
		super(color);
		this.tiempoGestacion = tiempoGestacion;
		
		super.getEdad();
	}

	

}
