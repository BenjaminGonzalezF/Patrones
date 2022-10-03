/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FactoryMethod;

import Composite.PropiedadesObjetos;

import java.util.ArrayList;

/**
 * @author 20376205
 */
public class CategoriaUsuario extends PropiedadesObjetos {
    String nombre;
    ArrayList<Artefacto> artefactos = new ArrayList<Artefacto>();

    public CategoriaUsuario(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Artefacto> getArtefactos() {
        return artefactos;
    }

    public void setArtefactos(ArrayList<Artefacto> articulos) {
        artefactos = articulos;
    }

    public void addArtefacto(Artefacto artefacto){
        artefactos.add(artefacto);
    }

}
