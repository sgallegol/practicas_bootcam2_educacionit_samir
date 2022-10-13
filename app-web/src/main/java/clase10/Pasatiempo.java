package clase10;

public class Pasatiempo extends Articulo {
	private String  marca;

	public Pasatiempo(Long id, String nombre, String autor, Double precio, String urlImagen) {
		super(id, nombre, autor, precio, urlImagen);
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}
	

}
