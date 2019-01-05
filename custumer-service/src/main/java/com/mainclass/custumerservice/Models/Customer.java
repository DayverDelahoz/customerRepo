package com.mainclass.custumerservice.Models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "customer")
public class Customer {

    @Id
    private String id;
    private int tipoId;
    private String nombre;
    private String direccion;

    public Customer() {
    }

    public Customer(String id) {
        this.id = id;
    }

    public Customer(String id, int tipoId, String nombre, String direccion) {
        this.id = id;
        this.tipoId = tipoId;
        this.nombre = nombre;
        this.direccion = direccion;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getTipoId() {
        return tipoId;
    }

    public void setTipoId(int tipoId) {
        this.tipoId = tipoId;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
}
