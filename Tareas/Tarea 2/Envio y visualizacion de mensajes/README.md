# Tarea 2 - Envío y visualización de mensajes 💬
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

- [Tarea 2 - Envío y visualización de mensajes 💬](#tarea-2---envío-y-visualización-de-mensajes-)
  - [Tecnologías para Desarrollos en Internet 2023-1 Universidad Nacional Autónoma de México (UNAM)](#tecnologías-para-desarrollos-en-internet-2023-1-universidad-nacional-autónoma-de-méxico-unam)
  - [**Pre-requisitos 📋**](#pre-requisitos-)
  - [**Ejecutar proyecto🚀**](#ejecutar-proyecto)
    - [Clonar el repositorio](#clonar-el-repositorio)
    - [Cargar el proyecto en NetBeans](#cargar-el-proyecto-en-netbeans)
    - [Resolver los problemas de dependencias](#resolver-los-problemas-de-dependencias)
    - [Seleccione el servidor GlassFish 4.1.1](#seleccione-el-servidor-glassfish-411)
    - [Ejecute el proyecto](#ejecute-el-proyecto)
    - [Ver el resultado en el navegador web](#ver-el-resultado-en-el-navegador-web)
  - [**Capturas de programa en funcionamiento 📸**](#capturas-de-programa-en-funcionamiento-)
    - [BD original](#bd-original)
    - [Envio de mensaje a 2 destinatarios con fecha actual](#envio-de-mensaje-a-2-destinatarios-con-fecha-actual)
    - [Consultar mensajes](#consultar-mensajes)
    - [BD Actualizada](#bd-actualizada)
    - [Eliminar mensajes](#eliminar-mensajes)
    - [Mensajes originales(sin fecha)](#mensajes-originalessin-fecha)
  - [Detener el servidor](#detener-el-servidor)
  - [Expresiones de Gratitud 🎁](#expresiones-de-gratitud-)

<!-- END doctoc generated TOC please keep comment here to allow auto update -->



## **Pre-requisitos 📋**

* [Java 8+](https://www.oracle.com/mx/java/technologies/javase/javase-jdk8-downloads.html)
* [GlassFish Server 4.1.1](https://javaee.github.io/glassfish/download)
* [NetBeans 8.2+](https://netbeans.apache.org/download/index.html)



## **Ejecutar proyecto🚀**

### Clonar el repositorio

```bash
git clone  https://github.com/VictorDeGallegos/TDI.git
```

### Cargar el proyecto en NetBeans

Abrir el IDE NetBeans y seleccionar la opción **Open Project**. Posteriormente navegar hasta la carpeta donde se clonó el repositorio y seleccionar la carpeta **Tarea2**.

<img width="1338" alt="Open project" src="https://user-images.githubusercontent.com/41756950/192113497-80769035-305b-495b-9cfa-c04ed745baf2.png">


<img width="1338" alt="Select project" src="https://user-images.githubusercontent.com/41756950/192113547-64d156e6-eb39-4edc-a11d-2a1e36cb9cee.png">

### Resolver los problemas de dependencias

Nos aparecerá un mensaje de error, esto es debido a que el proyecto no tiene las dependencias necesarias para ejecutarse. Para resolver esto, haga click en el botón **Fix dependencies** o vamos a properties para cargar el servidor.

<img width="1338" alt="Fix dependencies" src="https://user-images.githubusercontent.com/41756950/192113590-7148d7a1-3da3-4079-823b-ae0f2e861b50.png">

<img width="1338" alt="Fix dependencies 2" src="https://user-images.githubusercontent.com/41756950/192113642-b9fd5c36-2ff2-40df-a6cc-342b0604adb9.png">

### Seleccione el servidor GlassFish 4.1.1
Seleccionar el servidor GlassFish 4.1.1 que se descargo al princio del proyecto.

<img width="1338" alt="Fix dependencies 3" src="https://user-images.githubusercontent.com/41756950/192113669-1564a717-c0f7-4863-94c6-0cb1227feb67.png">

### Ejecute el proyecto

Si existe algun error al ejecutar el proyecto, realizar un `Clean and Build` y posteriormente `Run Project`.

<img width="1338" alt="Run project" src="https://user-images.githubusercontent.com/41756950/192113742-fdf21ff7-787b-447d-b484-467af70e11a6.png">

### Ver el resultado en el navegador web

Entre a la siguiente dirección en su navegador web:

```bash
http://localhost:8080
```

<img width="812" alt="localhost 8080" src="https://user-images.githubusercontent.com/41756950/192113793-0a0c2912-c014-4b9c-a3eb-3c9c2c983ad1.png">


## **Capturas de programa en funcionamiento 📸**

### BD original
Despues de Desplegar la aplicación en el navegador web

Podemos consultar la base de datos del programa para ver como cambia en el transcurso de su ejecucion, la tabla al principio contiene estos registros nosotros usamos la app de [MDB ACCDB VIWER](https://macdownload.informer.com/mdb-accdb-viewer/download/ ) para consultar la base de datos

![Base de datos original](https://cdn.discordapp.com/attachments/1009440948662571018/1024853868103860277/Captura_de_Pantalla_2022-09-28_a_las_8.23.18_p.m..png)

### Envio de mensaje a 2 destinatarios con fecha actual

Posteriormente nos dirigimos a la ruta `http://localhost:8080/inicio.htm` podremos ir a la opcion de *Enviar mensaje*

En este caso enviaremos el mensaje `Hola chicos vamos a codear` a dos destinatarios:
* victor
* demian
  
Y nuestro remitente sera juan con la fecha actualización

<img width="812" alt="Enviar  mensaje" src="https://user-images.githubusercontent.com/41756950/192920433-cc32ed86-2c1d-4b60-8f08-f91675d57006.png">

### Consultar mensajes

Despues enviar el mensaje corroboramos que llegue a los dos detinos con la fecha del mensaje y la opcion para eliminarlo:

* **Victor**:
  <img width="812" alt="Mensajes de Victor" src="https://user-images.githubusercontent.com/41756950/192920806-d61b3524-9696-4781-87ed-fe3492002b15.png">

* **Demian**:
  <img width="812" alt="Mensajes de Demian" src="https://user-images.githubusercontent.com/41756950/192920967-465180f0-84f0-420f-b9d8-b03ea7eeff94.png">

### BD Actualizada

En este punto podemos consultar la base de datos nuevamente para ver que los registros se guardaron exitosamente

<img width="1012" alt="Base actualizada" src="https://user-images.githubusercontent.com/41756950/192923020-1bc9509b-8706-4349-a368-d77f138a860e.png">

### Eliminar mensajes

Una vez consultados los mensajes procedemos a eliminarlos oprimiendo el icono del bote 🗑 para probar su funcionamiento, el resultado despues de consultar los mensajes es el siguiente:

* **Victor:**
<img width="812" alt="Mensajes de victtor eliminados" src="https://user-images.githubusercontent.com/41756950/192921276-c5c2eb17-6215-4625-95ec-005eac6144eb.png">

* **Demian:**
<img width="812" alt="Mensajes eliminados demian" src="https://user-images.githubusercontent.com/41756950/192921542-18ff4909-b75d-4fcb-812d-5386f321161f.png">

### Mensajes originales(sin fecha)

Y por ultimo si deseamos consultar algun mensaje de algun registro creado por el profesor, podemos visulizar que no contienen fecha pues a este punto no se habia implementado aun ese caso de uso:

<img width="812" alt="Mensajes de Daniela" src="https://user-images.githubusercontent.com/41756950/192921784-93f62e87-1387-4859-85ba-3983ff81aa6c.png">

## Detener el servidor
Vaya a la pestaña "Servicios" en el lado izquierdo de la pantalla (si no es visible, primero seleccione la ventana / Servicios del menú, o presione CTRL + 5)

<img width="812" alt="Captura de Pantalla 2022-09-24 a la(s) 1 55 24 p m" src="https://user-images.githubusercontent.com/41756950/192114228-0e032be0-f0e6-4944-a883-0e7cdc07f58e.png">

Seleccionar la pestaña "Servidores" y detener el servidor GlassFish

<img width="812" alt="Captura de Pantalla 2022-09-24 a la(s) 2 00 38 p m" src="https://user-images.githubusercontent.com/41756950/192114394-bdb0fbf5-f643-4128-8838-a3b40b34e6d8.png">

## Expresiones de Gratitud 🎁

* Comenta a otros sobre este proyecto 📢
* Invita una cerveza 🍺 o un café ☕ a alguien del equipo.
* 10/10 en la tarea 2 🤓

---
⌨️ con ❤️ por  [VictorDeGallegos](https://github.com/VictorDeGallegos), [Juan Carlos Bautista Sandoval](https://github.com/JuanBautistta) y [demian35](https://github.com/demian35) 
