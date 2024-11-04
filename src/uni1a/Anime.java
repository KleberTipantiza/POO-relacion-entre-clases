package uni1a;

public class Anime extends ContenidoAudiovisual {
	private String estudioAnimacion;
	private int añoDeEstreno;
	
	public Anime(String titulo, int duracionEnMinutos, String genero, String estudioAnimacion, int añoDeEstreno) {
		super(titulo, duracionEnMinutos,genero);
		this.estudioAnimacion = estudioAnimacion;
		this.añoDeEstreno = añoDeEstreno;
	}
	
	public String getEstudioAnimacion() {
		return estudioAnimacion;
	}
	
	public void setEstudioAnimacion(String estudioAnimacion) {
	this.estudioAnimacion = estudioAnimacion;
	}
	
	public int getAñoDeEstreno() {
		return añoDeEstreno;
	}
	
	public void setAñoDeEstreno(int añoDeEstreno) {
		this.añoDeEstreno = añoDeEstreno;
	}
	
	@Override
	public void mostrarDetalles() {
		System.out.println("Detalles del Anime:");
        System.out.println("ID: " + getId());
        System.out.println("Título: " + getTitulo());
        System.out.println("Duración en minutos: " + getDuracionEnMinutos());
        System.out.println("Género: " + getGenero());
        System.out.println("Estudio de Animacion: " + getEstudioAnimacion());
        System.out.println("Año de estreno: " + getAñoDeEstreno());
        }
}
