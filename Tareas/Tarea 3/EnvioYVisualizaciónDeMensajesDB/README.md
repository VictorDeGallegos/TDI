# Tarea 3 - Envío y visualización de mensajes en spring framework 💬
![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=java&logoColor=white)
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

- [Tarea 3 - Envío y visualización de mensajes en spring framework 💬](#tarea-3---envío-y-visualización-de-mensajes-en-spring-framework-)
  - [Tecnologías para Desarrollos en Internet 2023-1 Universidad Nacional Autónoma de México (UNAM)](#tecnologías-para-desarrollos-en-internet-2023-1-universidad-nacional-autónoma-de-méxico-unam)
  - [**Pre-requisitos 📋**](#pre-requisitos-)
  - [**Ejecutar proyecto🚀**](#ejecutar-proyecto)
    - [Clonar el repositorio](#clonar-el-repositorio)
    - [Cargar el proyecto en Eclipse](#cargar-el-proyecto-en-eclipse)
    - [Resolver los problemas de dependencias](#resolver-los-problemas-de-dependencias)
    - [Creamos la base de datos](#creamos-la-base-de-datos)
    - [Corremos el servidor](#corremos-el-servidor)
    - [Capturas en ejecucion](#capturas-en-ejecucion)
  - [Expresiones de Gratitud 🎁](#expresiones-de-gratitud-)

<!-- END doctoc generated TOC please keep comment here to allow auto update -->



## **Pre-requisitos 📋**

* [Java 8+](https://www.oracle.com/mx/java/technologies/javase/javase-jdk8-downloads.html)
* [Eclipse IDE](https://www.eclipse.org/downloads/)


## **Ejecutar proyecto🚀**

### Clonar el repositorio

```bash
git clone  https://github.com/VictorDeGallegos/TDI.git
```

### Cargar el proyecto en Eclipse

Abrir el IDE Eclipse y seleccionar la opción **Import project from git**.

<img width="483" alt="Importar de git" src="https://user-images.githubusercontent.com/41756950/202840595-7bece1cd-955e-4841-8c26-f6ad5ffe9378.png">

Elegir repo local

<img width="583" alt="elegir repo local" src="https://user-images.githubusercontent.com/41756950/202840690-5dece537-81e8-4b1a-ab69-fd5a0d4088d2.png">

<img width="583" alt="Captura de pantalla 2022-11-19 a la(s) 1 49 17 a m" src="https://user-images.githubusercontent.com/41756950/202840769-45eeca3b-e82b-41d7-abcd-0f718b3fbdb7.png">

Importamos el proyecto

<img width="583" alt="Importamos el proyecto" src="https://user-images.githubusercontent.com/41756950/202840804-1a320eec-8d7f-499f-b163-a386bc4f1dba.png">

### Resolver los problemas de dependencias

Deberemos reparar los problemas de dependencias para poder ejecutar el proyecto editando cada archivo

<img width="973" alt="resolver dependencias" src="https://user-images.githubusercontent.com/41756950/202840887-f40a6b82-2d78-4f82-aefe-dce961b1caf6.png">

Despues de reparar los problemas de dependencias quedaran algo asi y aplicamos los cambios

<img width="973" alt="Properties reparadas" src="https://user-images.githubusercontent.com/41756950/202841126-05fcc90d-10e9-40e1-8e69-641446c753ee.png">

### Creamos la base de datos

Creamos la base de datos en mysql con el siguiente script

```sql
CREATE DATABASE db_tarea_3;
USE db_tarea_3;

create table mensajes (
 id  int(3) NOT NULL AUTO_INCREMENT,
 destinatario varchar(120) NOT NULL,
 copia varchar(120) NOT NULL,
 remitente varchar(120) NOT NULL,
 mensaje varchar(220) NOT NULL,
 fecha varchar(10),
 PRIMARY KEY (id)
);
```

### Corremos el servidor

Ejecutamos el servidor para obtner lasiguiente imagen en pantalla

### Capturas en ejecucion

## Expresiones de Gratitud 🎁

* Comenta a otros sobre este proyecto 📢
* Invita una cerveza 🍺 o un café ☕ a alguien del equipo.
* 10/10 en la tarea 3 🤓

---
⌨️ con ❤️ por  [VictorDeGallegos](https://github.com/VictorDeGallegos), [Juan Carlos Bautista Sandoval](https://github.com/JuanBautistta) y [demian35](https://github.com/demian35) 