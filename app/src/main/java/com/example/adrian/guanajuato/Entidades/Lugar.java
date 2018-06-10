package com.example.adrian.guanajuato.Entidades;

/**
 * Created by adrian on 1/04/18.
 */
import android.net.Uri;

import java.util.UUID;

/**
 * Contrato con la estructura de la base de datos y forma de las URIs
 */
public class Lugar {
    int id_lugar;
    String lugar,descripcion,ubicacion,image,ciudad;

    public Lugar(int id_lugar, String ciudad, String lugar, String descripcion, String ubicacion, String image) {
        this.id_lugar = id_lugar;
        this.ciudad = ciudad;
        this.lugar = lugar;
        this.descripcion = descripcion;
        this.ubicacion = ubicacion;
        this.image = image;
    }

    public int getId_lugar() {
        return id_lugar;
    }

    public void setId_lugar(int id_lugar) {
        this.id_lugar = id_lugar;
    }

    public String getId_ciudad() {
        return ciudad;
    }

    public void setId_ciudad(String id_ciudad) {
        this.ciudad = id_ciudad;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}


