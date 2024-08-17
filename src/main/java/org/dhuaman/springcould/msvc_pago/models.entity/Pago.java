package org.dhuaman.springcould.msvc_pago.models.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import org.springframework.data.annotation.Id;

@Entity
public class Pago {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int ID_Pago;

    @Column(unique = true)
    private int ID_Matricula;
    private String NombrePagador;
    private String NombreAlumno;
    private String Estado_Pago;
    private String Monto;
    private String Metodo_Pago;
    private String Fecha_Pago;


    //@ManyToOne
    //@JsonBackReference
    //private Matricula
}
