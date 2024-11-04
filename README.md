Proyecto de Contenido Audiovisual 

## Objetivos y Propósito del Proyecto
El objetivo principal de este proyecto es crear un sistema de gestión de contenido audiovisual que permita almacenar y visualizar información de distintos tipos de contenido, como películas, series, documentales, anime y novelas. El proyecto está diseñado utilizando principios de la "Programación Orientada a Objetos", aplicando conceptos como herencia, encapsulamiento, agregación, y composición.
El propósito es desarrollar un sistema que permita extender fácilmente las funcionalidades agregando nuevas clases de contenido. Este proyecto incluye el uso de asociaciones, agregaciones y composiciones entre clases, demostrando un enfoque robusto en el diseño orientado a objetos.

## Clases y Funcionalidades Nuevas
En esta versión del proyecto se han añadido las siguientes clases y funcionalidades:

1. Anime (subclase)
   - Subclase de `ContenidoAudiovisual` que almacena animes.
   - Añadido un atributo `añoDeEstreno` para indicar el año de lanzamiento del anime.
   - Método `mostrarDetalles()` para imprimir los detalles del anime, incluyendo el estudio de animación y el año de estreno.

2. Novelas (subclase)
   - Subclase que representa novelas con un atributo adicional `autor` y `numeroCapitulos`.
   - Método `mostrarDetalles()` que imprime los detalles de la novela, incluyendo el nombre del autor y el número de capítulos.

3. Temporada
   - Clase que representa una temporada dentro de una serie de televisión.
   - Contiene atributos como el número de temporada y la cantidad de capítulos.
   - Relación de agregación con la clase `SerieDeTV`.

4. Actor
   - Clase que representa a los actores asociados a las películas.
   - Atributo `nombre` con constructor, getter y setter.
   - Relación de asociación con la clase `Pelicula`.

5. Investigador
   - Clase que representa un investigador asociado a un documental.
   - Atributo `nombre` que almacena el nombre del investigador.
   - Relación de **composición** con la clase `Documental`, lo que implica que un investigador está intrínsecamente ligado a un documental específico.

## Instrucciones para Clonar y Ejecutar el Proyecto

Se recomienda ejecutar el codigo en eclipse e importarlo desde la misma aplicación
Otra opcion, es mediante Git para clonar el repositorio, usando el comando "git clone"
