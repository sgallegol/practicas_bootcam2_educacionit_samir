package clase10;

public class Musica extends Articulo {
	//atributos propios
	private  String[] listaTemas;
	

	public Musica(Long id, String nombre, String autor, Double precio, String urlImagen,String[] listaTemas) {
		super(id, nombre, autor, precio, urlImagen);
		this.listaTemas=listaTemas;
	}


	public String[] getListaTemas() {
		return listaTemas;
	}


	public void setListaTemas(String[] listaTemas) {
		this.listaTemas = listaTemas;
	}
	
	public void agregarTema(String tema) {
		
	}
	

}
