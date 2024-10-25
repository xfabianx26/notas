Proyecto Spring Boot y Angular con MongoDB

Este proyecto utiliza las siguientes tecnologías:

Spring Boot para el desarrollo del backend.

Angular para la implementación del frontend.

MongoDB como base de datos NoSQL.

Tecnologías

Spring Boot: Framework para el desarrollo de aplicaciones backend en Java, proporcionando una arquitectura robusta y fácil de implementar.

Angular: Framework basado en TypeScript para construir interfaces de usuario dinámicas y responsivas.

MongoDB: Base de datos NoSQL utilizada para almacenar y gestionar la información de manera flexible.

Requisitos

Tener instalados Java y Maven para el backend.

Tener Node.js y npm (o yarn) para el frontend.

MongoDB debe estar instalado localmente para ejecutar la base de datos.

Instrucciones para Iniciar MongoDB

La base de datos MongoDB se ejecuta en local. Para inicializar la base de datos, sigue estos pasos:

Abre una terminal.

Ejecuta el siguiente comando para iniciar el servicio de MongoDB:

mongod

Este comando iniciará MongoDB y permitirá que la aplicación pueda conectarse a la base de datos local.

Cómo Ejecutar el Proyecto

Backend (Spring Boot):

Navega al directorio del backend.

Ejecuta mvn spring-boot:run para iniciar el servidor backend.

Frontend (Angular):

Navega al directorio del frontend.

Ejecuta ng serve para iniciar el servidor frontend.

Sistema de Notas - Gestión de Tareas

Este proyecto incluye un sistema de notas que permite a los usuarios crear tareas y marcar cuáles ya han sido realizadas y cuáles no. Las funcionalidades principales son:

Crear Tareas: Los usuarios pueden añadir nuevas tareas con una descripción.

Chuliar Tareas: Las tareas pueden ser marcadas como completadas para llevar un registro del progreso.

Ver Estado de Tareas: El sistema permite ver claramente cuáles tareas están pendientes y cuáles ya han sido completadas.

Estas funcionalidades están implementadas en el frontend con Angular, mientras que el backend, utilizando Spring Boot, se encarga de gestionar las operaciones con la base de datos MongoDB.

Notas

Asegúrate de que el servicio de MongoDB esté corriendo antes de ejecutar el backend, ya que la aplicación necesita conectarse a la base de datos para funcionar correctamente.