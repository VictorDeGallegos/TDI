CREATE DATABASE db_tarea_3;

USE db_tarea_3;

create table
    mensajes (
        id int(3) NOT NULL AUTO_INCREMENT,
        destinatario varchar(120) NOT NULL,
        copia varchar(120) NOT NULL,
        remitente varchar(120) NOT NULL,
        mensaje varchar(220) NOT NULL,
        fecha varchar(10),
        PRIMARY KEY (id)
    );
