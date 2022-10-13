package clase10;

public class Libro extends Articulo {
	//atributos propios 
	private String isbn;
	

	public Libro(Long id, String nombre, String autor, Double precio, String urlImagen,String isbn) {
		super(id, nombre, autor, precio, urlImagen);
		this.isbn=isbn;
	}


	public String getIsbn() {
		return isbn;
	}


	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}


	
	
	
	
	
	

}
