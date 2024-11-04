/**
 * Class SerieDeTV
 */
package uni1a;
import java.util.ArrayList;

// Subclase SerieDeTV que extiende de ContenidoAudiovisual
public class SerieDeTV extends ContenidoAudiovisual {
    private int temporadas; // Total de temporadas
    private ArrayList<Temporada> temp; // Agregacion: una serie puede tener varias temporadas

    public SerieDeTV(String titulo, int duracionEnMinutos, String genero, int temporadas) {
        super(titulo, duracionEnMinutos, genero);
        this.temporadas = temporadas;
        this.temp = new ArrayList<>(); // Iniciamos la lista de temporadas
    }

    public void agregarTemporada(Temporada temporada) {
        temp.add(temporada);
    }
    
    @Override
    public void mostrarDetalles() {
        System.out.println("Detalles de la película:");
        System.out.println("ID: " + getId());
        System.out.println("Título: " + getTitulo());
        System.out.println("Duración en minutos: " + getDuracionEnMinutos());
        System.out.println("Género: " + getGenero());
        System.out.println("Temporadas: " + this.temporadas); // Numero total de temporadas
        System.out.println("Detalles por temporada ");
        for (Temporada temporada : temp) {
        	temporada.mostrarDetalles(); // Mostrar detalles de cada temporada
        }
    }
}