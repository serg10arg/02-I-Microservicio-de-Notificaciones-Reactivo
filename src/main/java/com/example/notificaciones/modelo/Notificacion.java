package com.example.notificaciones.modelo;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

/**
 * Clase de modelo que representa una notificación a ser almacenada en MongoDB.
 * Utiliza Lombok para reducir el boilerplate de getters, setters, constructores, etc.
 * @note La anotación @Document de Spring Data MongoDB es esencial para mapear esta clase a una colección de MongoDB.
 */
@Getter
@Setter
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "notificaciones")
public class Notificacion {

    @Id
    private String id;

    private String identificadorUsuarioDestino;
    private String tipo;
    private String mensaje;
    private LocalDateTime fechaCreacion;
    private boolean leida;

    public Notificacion(String identificadorUsuarioDestino, String tipo, String mensaje) {
        this.identificadorUsuarioDestino = identificadorUsuarioDestino;
        this.tipo = tipo;
        this.mensaje = mensaje;
        this.fechaCreacion = LocalDateTime.now();
        this.leida = false;
    }
}
