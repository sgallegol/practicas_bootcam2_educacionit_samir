package clase10;

public class Buscador {

	private String claveBusqueda;
	private Articulo[] articulo;
	private Integer cantidad;
	public Buscador() {
		
		this.claveBusqueda = "";
		this.articulo =new Articulo[0];
		this.cantidad = 0;
	}
	
	public Buscador(String claveBusqueda) {
		this.claveBusqueda=claveBusqueda;
		
	}
	//metodos
	public void buscar() {
		//alguien me da los aticulos
		Articulo[] resultados=new Articulo[3];
		
		resultados[0]=new Libro(1l, "es un mu�eco", "dc comics", 123d, "http://www.ironman.mercado","isbn123");
		resultados[1]=new Pelicula(2l, "es un mu�eco feo", "marvel", 142d, "http://www.mu�ecofeo.mercado","paramount network");
		String[] temas={"tema1","tema2"};
		resultados[2]=new Musica(3l, "es batman", "marvel", 234d, "http://www.batman.mercado",temas);
		
		this.articulo=resultados;
		
		cantidad=resultados.length;
		
		
	}
	
	
	
	

}
