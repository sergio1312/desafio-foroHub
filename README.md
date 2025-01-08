# desafio-foroHub
# API REST para Gestión de Tópicos

Este proyecto es una API REST que permite realizar operaciones CRUD (Crear, Leer, Actualizar, Eliminar) sobre tópicos. Además, incluye configuraciones de seguridad para la autenticación de usuarios utilizando JSON Web Tokens (JWT).

## Características

- **CRUD de Tópicos**: Permite crear, leer, actualizar y eliminar tópicos.
- **Seguridad**: Implementación de Spring Security para proteger los endpoints.
- **Autenticación con JWT**: Servicio de autenticación que permite a los usuarios iniciar sesión y recibir un token JWT para acceder a los recursos protegidos.
- **Migraciones de Base de Datos**: Uso de migraciones para gestionar cambios en la estructura de la base de datos.
- **Manejo de Errores**: Respuestas adecuadas para errores comunes.

## Tecnologías Utilizadas

- **Java**: Lenguaje de programación principal.
- **Spring Boot**: Framework para construir aplicaciones Java.
- **Spring Data JPA**: Para la interacción con la base de datos.
- **Spring Security**: Para la gestión de la seguridad y autenticación.
- **JSON Web Token (JWT)**: Para la autenticación basada en tokens.
- **MySQL**: Base de datos relacional para producción.
- **Flyway**: Para la gestión de migraciones de base de datos.
- **Lombok**: Para reducir el boilerplate de código.

## Requisitos Previos

- JDK 17 o superior
- MySQL Server
- Maven
  
