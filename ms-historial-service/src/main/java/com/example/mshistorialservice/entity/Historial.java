package com.example.mshistorialservice.entity;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
public class Historial {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "usuario_id", nullable = false) // Clave foránea hacia Usuario
    private Usuario usuario;

    private Integer montoPago;

    @ManyToOne
    @JoinColumn(name = "producto_id", nullable = false) // Clave foránea hacia Producto
    private Producto producto;

    private String accion; // Ejemplo: Describir la acción realizada

    private LocalDateTime fechaAccion;
}
