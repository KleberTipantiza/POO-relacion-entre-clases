package uni1a;

public class Novelas extends ContenidoAudiovisual {
    private String autor;
    private int numeroCapitulos;

    public Novelas(String titulo, int duracionEnMinutos, String genero, String autor, int numeroCapitulos) {
        super(titulo, duracionEnMinutos, genero);
        this.autor = autor;
        this.numeroCapitulos = numeroCapitulos;
    }
    
    //Getters y setters
    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
    
    public int getNumeroCapitulos() {
        return numeroCapitulos;
    }

    public void setNumeroCapitulos(int numeroCapitulos) {
        this.numeroCapitulos = numeroCapitulos;
    }

	@Override
	public void mostrarDetalles() {
		System.out.println("Detalles del Anime:");
        System.out.println("ID: " + getId());
        System.out.println("Título: " + getTitulo());
        System.out.println("Duración en paginas: " + getDuracionEnMinutos());
        System.out.println("Género: " + getGenero());
        System.out.println("Autor: " + getAutor());
        System.out.println("Numero de capitulos: " + getNumeroCapitulos());
		
	}
}
