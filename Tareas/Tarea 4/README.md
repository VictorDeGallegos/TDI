# Tarea 4 - Generación de FormStudentValidation💬

![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=java&logoColor=white) ![Postgresql](https://img.shields.io/badge/PostgreSQL-316192?style=for-the-badge&logo=postgresql&logoColor=white) 
![Status badge](https://img.shields.io/badge/status-%20terminado-green?style=for-the-badge)

## Tecnologías para Desarrollos en Internet 2023-1 Universidad Nacional Autónoma de México (UNAM)

> ---
>
> * **Juan Carlos Bautista Sandoval**  - [JuanBautistta](https://github.com/JuanBautistta)
> * **Victor Hugo Gallegos Mota**  - [VictorDeGallegos](https://github.com/VictorDeGallegos)
> * **José Demian Jiménez**  - [demian35](https://github.com/demian35)
>
>
>
> ---

<!-- START doctoc generated TOC please keep comment here to allow auto update -->
<!-- DON'T EDIT THIS SECTION, INSTEAD RE-RUN doctoc TO UPDATE -->

**Tabla de contenido**

- [Tarea 4 - Generación de FormStudentValidation💬](#tarea-4---generación-de-formstudentvalidation)
  - [Tecnologías para Desarrollos en Internet 2023-1 Universidad Nacional Autónoma de México (UNAM)](#tecnologías-para-desarrollos-en-internet-2023-1-universidad-nacional-autónoma-de-méxico-unam)
  - [**Pre-requisitos 📋**](#pre-requisitos-)
  - [**Ejecutar proyecto🚀**](#ejecutar-proyecto)
    - [Clonar el repositorio](#clonar-el-repositorio)
    - [Crear base de datos](#crear-base-de-datos)
    - [Ejecutar el programa](#ejecutar-el-programa)
  - [Consulta bases de datos](#consulta-bases-de-datos)
  - [Expresiones de Gratitud 🎁](#expresiones-de-gratitud-)

<!-- END doctoc generated TOC please keep comment here to allow auto update -->

## **Pre-requisitos 📋**

* [Java 8+](https://www.oracle.com/mx/java/technologies/javase/javase-jdk8-downloads.html)
* [Vs code](https://code.visualstudio.com/)
* [MVN](https://maven.apache.org/)

## **Ejecutar proyecto🚀**

### Clonar el repositorio

```bash
git clone  https://github.com/VictorDeGallegos/TDI.git
```

### Crear base de datos

Debemos crear una base de datos en postgresql con 2 tablas las cuales corresponden a los estudiantes y a los horarios como siguen respectivamente

**TABLA STUDENT:**

```sql
drop table if exists student;

create table student(
    id serial,
    first_name varchar(100),
    last_name varchar(100),
    sex varchar(100),
    date_of_birth varchar(100),
    email varchar(100),
    section varchar(100),
    country varchar(100),
    first_attempt varchar(100),
    subjects varchar(255),
    primary key (id)
);
```

**TABLA HORARIO:**

```sql
drop table if exists horario;

create table horario(
    id serial,
    materia varchar(100),
    semestre varchar(100),
    profesor varchar(100),
    creditos varchar(100),
    salon varchar(100),
    primary key (id)
);
```

**TABLA COUNTRY:**

```sql
drop table if exists country;

create table country(
    id serial,
    country varchar(100),
    primary key (id)
);
```

### Ejecutar el programa

Nosotros decidimos realizar nuestra implementacion en SpringBoot, se puede ejecutar el programa modificando el usuario, contraseña y nombre de la base de datos el archivo `student/src/main/resources/application.properties` de la siguiente forma (en mi caso fue asi)

```properties
server.port = 8080

spring.datasource.url=jdbc:postgresql://localhost:5432/estudiantes
spring.datasource.username=postgres
spring.datasource.password=1234
spring.datasource.driver-class-name=org.postgresql.Driver
```

Posteriormente podemos ejecutar el programa con el siguiente comando

`mvn spring-boot:run`

o con las extensiones de springboot

![run](https://user-images.githubusercontent.com/41756950/208224164-efaeca6e-27f2-4385-84af-9531223f27b8.png)

si todo esta bien nuestra app estara disponible en el puerto 8080 y rellenando algunos campos de la siguiente forma

![Formulario](https://user-images.githubusercontent.com/41756950/208224820-e92a4b0b-1da3-4bf0-ba90-cb7e8b0f0125.png)

## Consulta bases de datos

Al realizar algun registro podremos consultar las bases de datos de la siguiente manera en nuestro pgAdmin4

**Consulta tabla student:**

![Consulta estudiantes](https://user-images.githubusercontent.com/41756950/208224868-a759117c-648a-4270-bf3a-2bdda21c6de2.png)

**Consulta tabla horario:**

![consultahorario](https://user-images.githubusercontent.com/41756950/208224672-10713d74-3969-4df7-872c-b6f40177b248.png)

## Expresiones de Gratitud 🎁

* Comenta a otros sobre este proyecto 📢
* Invita una cerveza 🍺 o un café ☕ a alguien del equipo.
* 10/10 en la tarea 4🤓

---
⌨️ con ❤️ por  [VictorDeGallegos](https://github.com/VictorDeGallegos), [Juan Carlos Bautista Sandoval](https://github.com/JuanBautistta) y [demian35](https://github.com/demian35)
