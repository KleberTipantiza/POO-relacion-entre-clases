package poo;
import uni1a.*;

public class PruebaAudioVisual {
	public static void main(String[] args) {
        System.out.println("Prueba Audio Visual");

        // Crear instancias de las subclases
        ContenidoAudiovisual[] contenidos = new ContenidoAudiovisual[5];
        contenidos[0] = new Pelicula("A Bronx Tale", 120, "Drama", "Savoy Picture");
        contenidos[1] = new SerieDeTV("Breaking Bad", 47, "Crimen", 5);
        contenidos[2] = new Documental("Our Planet", 45, "Science", "World");
        contenidos[3] = new Anime("Naruto", 25, "Action", "Studio Pierrot", 2002);
        contenidos[4] = new Novelas("Cien años de soledad", 463, "Drama", "Gabriel García Márquez", 20);
        
        // Crear actores
        Actor actor1 = new Actor("Robert de Niro");
        Actor actor2 = new Actor("Chazz Palminteri");
        Actor actor3 = new Actor("Lillo Brancato");
        
        // Asociar actores con la pelicula "A Bronx Tale"
        Pelicula pelicula = (Pelicula) contenidos [0];
        pelicula.agregarActor(actor1);
        pelicula.agregarActor(actor2);
        pelicula.agregarActor(actor3);
        
        // Crear temporadas y capitulos por temporada
        Temporada temporada1 = new Temporada(1, 17);
        Temporada temporada2 = new Temporada(2, 13);
        Temporada temporda3 = new Temporada(3, 13);
        Temporada temporada4 = new Temporada(4, 13);
        Temporada temporada5 = new Temporada(5, 16);
        
        //Asociar temporadas a la serie "Breaking Bad"
        SerieDeTV serie = (SerieDeTV) contenidos[1];
        serie.agregarTemporada(temporada1);
        serie.agregarTemporada(temporada2);
        serie.agregarTemporada(temporda3);
        serie.agregarTemporada(temporada4);
        serie.agregarTemporada(temporada5);
        
        //Agregar investigadores al documental
        Investigador investigador1 = new Investigador("David Attenborough");
        Investigador investigador2 = new Investigador("Silverback Films");
        Investigador investigador3 = new Investigador("World Wildlife Fund");
        
        // Agregar los investigadores al documental
        Documental documental = (Documental) contenidos[2];
        documental.agregarInvestigador(investigador1);
        documental.agregarInvestigador(investigador2);
        documental.agregarInvestigador(investigador3);
        
        // Mostrar los detalles de cada contenido audiovisual
        for (ContenidoAudiovisual contenido : contenidos) {
           contenido.mostrarDetalles();
        }

        
    }
}