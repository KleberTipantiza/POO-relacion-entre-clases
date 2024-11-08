/**
 * Class Pelicula
 */
package uni1a;
import java.util.ArrayList;  //Se importa para almacenar los nombres de los actores

// Subclase Pelicula que extiende de ContenidoAudiovisual
public class Pelicula extends ContenidoAudiovisual {
    private String estudio;
    private ArrayList<Actor> actores; // Asociacion con la clase Actor

    public Pelicula(String titulo, int duracionEnMinutos, String genero, String estudio) {
        super(titulo, duracionEnMinutos, genero);
        this.estudio = estudio;
        this.actores = new ArrayList<>(); // Inicializar la lista de actores 
    }

    public String getEstudio() {
        return estudio;
    }

    public void setEstudio(String estudio) {
        this.estudio = estudio;
    }
    
    //Metodo para agregar actores
    public void agregarActor(Actor actor) {
    	actores.add(actor);
    }
    
    //public ArrayList<Actor> getActores(){
    	//return actores;
    //}
    
    @Override
    public void mostrarDetalles() {
        System.out.println("Detalles de la película:");
        System.out.println("ID: " + getId());
        System.out.println("Título: " + getTitulo());
        System.out.println("Duración en minutos: " + getDuracionEnMinutos());
        System.out.println("Género: " + getGenero());
        System.out.println("Estudio: " + estudio);
        System.out.println("Actores: ");  // Mostrar la lista de actores
        for (Actor actor: actores) {
        	System.out.println(" - " + actor.getNombre());
        }
    }
}