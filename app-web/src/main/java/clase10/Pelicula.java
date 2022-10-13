package clase10;

public class Pelicula extends Articulo {
	private String productora;

	public Pelicula(Long id, String nombre, String autor, Double precio, String urlImagen,String productora) {
		super(id, nombre, autor, precio, urlImagen);
		this.productora=productora;
		
	}

	public String getProductora() {
		return productora;
	}

	public void setProductora(String productora) {
		this.productora = productora;
	}

	

	
}
