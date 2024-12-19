# Catálogo de Libros - Aplicación de Consulta

## Descripción

Esta es una aplicación diseñada para consultar un catálogo de libros en línea. La aplicación utiliza la API pública de **Gutendex**, que proporciona acceso a una vasta colección de libros electrónicos de dominio público. 
A través de esta aplicación, los usuarios pueden buscar libros, consultar información detallada sobre ellos, y explorar una amplia gama de literatura clásica disponible de manera gratuita.

## Características

- **Búsqueda por título**: Permite realizar búsquedas de libros por título.
- **Detalles del libro**: Muestra información detallada sobre cada libro, incluyendo título, autor, fecha de publicación, y el número de descargas del libro.
- **Exploración por autores**: Los usuarios pueden explorar libros por autores.
- **Exploración por idioma del libro**: Los usuarios pueden explorar libros por idioma (en, es, fr).

## API de Gutendex

La aplicación consume la API pública de **Gutendex** para obtener información sobre los libros. **Gutendex** es una API que permite acceder a una amplia base de datos de libros de dominio público, proporcionada por el Proyecto Gutenberg.

La API permite realizar diversas consultas como:
- Buscar libros por palabra clave en el título, autor o descripción.
- Obtener detalles específicos sobre un libro.
- Filtrar libros por idioma, autor, temas, y más.

## Requisitos

Para ejecutar esta aplicación localmente, necesitas tener instalado lo siguiente:

- [Java 17 o superior](https://adoptopenjdk.net/)
- [MySQL](https://www.mysql.com/)
- [Maven](https://maven.apache.org/) para gestionar dependencias
- [Spring Boot](https://spring.io/projects/spring-boot) como framework principal

## Instalación

1. Clona el repositorio:

   ```bash
   git clone https://github.com/tuusuario/catalogo-libros.git
