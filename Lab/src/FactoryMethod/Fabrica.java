/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FactoryMethod;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author 20376205
 */
public class Fabrica implements InterfaceFabricaArtefactos{
    public ArrayList<Artefacto> artefactos = new ArrayList<Artefacto>();


    private String nombre(){
        System.out.println("Ingrese el nombre de artefacto");
        Scanner sc;
        sc = new Scanner(System.in);
        String nombre = sc.nextLine();
        return nombre;
    }

    @Override
    public void crearArteactoA() {
        ArtefactoA artefactoA = new ArtefactoA();
        artefactoA.setNombre(nombre());

        add(artefactoA);
        System.out.println("Artefacto A creado con exito");

    }

    @Override
    public void crearArteactoB() {
        ArtefactoB artefactoB = new ArtefactoB();
        artefactoB.setNombre(nombre());

        add(artefactoB);
        System.out.println("Artefacto B creado con exito");


    }

    private void add(Artefacto artefacto){
        this.artefactos.add(artefacto);

    }

    public ArrayList<Artefacto> getArtefactos() {
        return artefactos;
    }
}
