public class Libro {

	private String titulo;
	private String autor;
	private boolean prestado;
	
	// Constuctor con parámetros
	public Libro(String titulo, String autor, boolean prestado) {
		
		this.setTitulo(titulo);
		this.setAutor(autor);
		this.setPrestado(prestado);
	}
	// Getters y setters para tratamiento de atributos

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public boolean isPrestado() {
		return prestado;
	}

	public void setPrestado(boolean prestado) {
		this.prestado = prestado;
	}
	
	// Método para saber si el libro está prestado
	
	public void prestar() {
		if(!prestado) {
			prestado = true;
			System.out.println("El libro "+ titulo + " ha sido prestado.");
		}else {
			System.out.println("El libro ya está prestado");
		}
	}
	
	//Método para devolver libros
	
	public void devolver() {
		if (prestado) {
			prestado = false;
			System.out.println("El libro"+ titulo+"ha sido devuelto");
		}else {
			System.out.println("El libro no estaba prestado");
		}
	}

	
	@Override
    public String toString() {
        return (prestado ? "[Prestado] " : "[Disponible] ") + titulo + " - " + autor;
    }
}


