package com.example.notificaciones.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * DTO (Data Transfer Object) para la recepción de eventos de notificación.
 * Representa la estructura de los datos que se recibirán de otros sistemas.
 * Utiliza Lombok para reducir el boilerplate y Jakarta Validation para integridad de los datos.
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class EventoNotificacionDTO {

    @NotBlank(message = "El identificador del usuario destino no puede estar vacío.")
    private String identificadorUsuarioDestino;

    @NotBlank(message = "El tipo de notificación no puede estar vacío.")
    @Size(min = 3, max = 50, message = "El tipo de notificación debe tener entre 3 y 50 caracteres.")
    private String tipo;

    @NotBlank(message = "El mensaje no puede estar vacío.")
    @Size(max = 500, message = "El mensaje debe tener como máximo 500 caracteres.")
    private String mensaje;

    @Size(max = 50, message = "El origen debe tener como máximo 50 caracteres.")
    private String origen;
}
