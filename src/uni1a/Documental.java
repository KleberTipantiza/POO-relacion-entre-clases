/**
 * Class Documental
 */
package uni1a;
import java.util.ArrayList;

// Subclase Documental que extiende de ContenidoAudiovisual
public class Documental extends ContenidoAudiovisual {
    private String tema;
    private ArrayList<Investigador> investigadores; // Composicion: tiene investogadores para su desarrollo

    public Documental(String titulo, int duracionEnMinutos, String genero, String tema) {
        super(titulo, duracionEnMinutos, genero);
        this.tema = tema;
        this.investigadores = new ArrayList<>(); // Lista de investigadores 
    }

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }
    
    //Metodo para agregar un investigador
    public void agregarInvestigador(Investigador investigador) {
    	investigadores.add(investigador);
    } 
    
    @Override
    public void mostrarDetalles() {
        System.out.println("Detalles de la película:");
        System.out.println("ID: " + getId());
        System.out.println("Título: " + getTitulo());
        System.out.println("Duración en minutos: " + getDuracionEnMinutos());
        System.out.println("Género: " + getGenero());
        System.out.println("Tema: " + this.tema);
        System.out.println("Investigadores: ");
        for (Investigador investigador : investigadores) {
        	investigador.mostrarDetalles(); // Mostrar nombre de cada investigador
        }
    }
}