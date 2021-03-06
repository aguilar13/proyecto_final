/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.mauricio.fin;

import org.springframework.data.annotation.Id;

/**
 *
 * @author T-
 */
public class Mensaje {
    
    @Id
    private String id;
    private String titulo;

    public Mensaje() {
    }

    public Mensaje(String titulo) {
        this.titulo = titulo;
    }

    @Override
    public String toString() {
        return "Mensaje{" + "id=" + id + ", titulo=" + titulo + '}';
    }

    public Mensaje(String id, String titulo) {
        this.id = id;
        this.titulo = titulo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    
}
