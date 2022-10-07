package clase10;

public class Animal {
	//atributos
	//encapsulamos: ocultar al mumdo exterior este atributo,
	//el atributo es como el pensamiento solo uno lo ve
	
	protected String color;
	private  Integer edad;
	//etc Tipo nombre;
	
	
	//constructor: forma de nacer
	//la jdk me da un constructor por defecto(vacio)
	//el constructor parametrizado anula al "por defecto"
	public Animal(String color) {
		System.out.println("nace un  animal");
	}
	
	//metodos
	public void hablar() {
		System.out.println("animal hablando");
	}
	//cuando quiero tener el valor de un atributo se llma: getters
	//firma del metodo: tipo y nombre y parametro si recibe
	public String getColor() {
		//variable local
		String color;
		if(this.color==null) {
			color="N/D";
		}else{
			color=this.color;
		}
		return color;
		
	}
	//setter: modifico el valor de un atributo
	public void setColor(String nuevoColor) {
		if(nuevoColor !=null ) {
			this.color=nuevoColor;
		}else {
			System.out.println("debe de informar un color");
		}
	}
	public void setEdad(Integer nuevaEdad) {
		if(nuevaEdad !=null) {
			this.edad=nuevaEdad;
		}
	}
	public Integer getEdad() {
		return this.edad !=null ? edad : 0;
		
	}

}
