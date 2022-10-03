package FactoryMethod;

import java.util.ArrayList;

public class CategoriaBase extends  CategoriaUsuario{
    String  nombre = "Categoria Default" ;
    ArrayList<Artefacto> artefactos = new ArrayList<Artefacto>();


    public CategoriaBase(String nombre) {
        super(nombre);
        ArtefactoA artefacto1 = new ArtefactoA();
        artefacto1.setNombre("1 Artefacto A");

        ArtefactoB artefacto2 = new ArtefactoB();
        artefacto2.setNombre("2 Artefacto B");
        artefacto2.setId(1);

        artefactos.add(artefacto1);
        artefactos.add(artefacto2);


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

}
