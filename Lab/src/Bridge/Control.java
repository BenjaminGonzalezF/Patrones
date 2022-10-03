/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bridge;


import FactoryMethod.*;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author 20376205
 */
public class Control implements InterfaceControl {


    ListadoCategoriasUsuario listadoCategoriasU = new ListadoCategoriasUsuario();
    Fabrica fabrica = new Fabrica();

    public Control() {
        CategoriaBase categoriaBase = new CategoriaBase("Categoria por defecto");
        listadoCategoriasU.categoriasU.add(categoriaBase);
        ArtefactoA artefacto1 = new ArtefactoA();
        artefacto1.setNombre("1 Artefacto A");

        ArtefactoB artefacto2 = new ArtefactoB();
        artefacto2.setNombre("2 Artefacto B");
        artefacto2.setId(1);


        fabrica.artefactos.add(artefacto1);
        fabrica.artefactos.add(artefacto2);


    }

    public void menu(){
        Scanner sc;
        int opcion = 0;


        while (opcion!=8) {
            System.out.println("Ingrese el numero de la accion a realizar\n");
            System.out.println(
                      "         1: Agregar categoria de usuario\n"
                    + "         2: Editar categoria de usuario \n"
                    + "         3: Eliminar categoria de usuario\n"
                    + "         4: Crear artefacto \n"
                    + "         5: Eliminar Artefacto\n"
                    + "         6: Agregar Artefacto a categoria de usuario\n"
                    + "         7: Ver Categorias\n"
                    + "         8: Salir\n");
            sc = new Scanner(System.in);
            opcion = sc.nextInt();

            switch (opcion){
                case 1:{
                    agregar();
                    break;
                }
                case 2:{
                    editar();
                    break;
                }
                case 3:{
                    eliminar();
                    break;
                }
                case 4:{
                    crearArtefacto();
                    break;
                }
                case 5: {
                    eliminarArtefacto();
                    break;
                }
                case 6: {
                    agregarArtefacto();
                    break;
                }
                case 7: {
                    verCategoriasUsuario();
                    break;
                }
                case 8: {
                    System.exit(0);
                    break;
                }
                default: {
                    System.out.println("Opcion incorrecta");
                }

            }
        }
    }

    @Override
    public void agregar() {
        Scanner sc;
        String nombreCategoria = "";
        System.out.println("Ingrese su nombre de categoria de usuario");
        sc = new Scanner(System.in);
        nombreCategoria = sc.nextLine();

        CategoriaUsuario catU=  new CategoriaUsuario(nombreCategoria);
        catU.setId(listadoCategoriasU.categoriasU.size());
        listadoCategoriasU.categoriasU.add(catU);


    }

    @Override
    public void editar() {

    }

    @Override
    public void eliminar() {


    }

    @Override
    public void verCategoriasUsuario() {
        for(int i = 0; i < this.listaCategoriasU().size(); i++) {
            System.out.println("----------------------------------------------------------------------------------------");
            System.out.println("Id Categoria: " + this.listaCategoriasU().get(i).getId() +
                             "\nNombre : " + this.listaCategoriasU().get(i).getNombre() +
                             "\nArticulos : " );
            verArticulos(i);
        }

    }
    private void verArticulos(int n){
        int size = this.listaCategoriasU().get(n).getArtefactos().size();
        for (int i = 0; i < size; i++) {
            System.out.println(
                    "\n Id Artefacto: " + this.listaCategoriasU().get(n).getArtefactos().get(i).getId() + "\n" +
                      " Nombre artefacto: " + this.listaCategoriasU().get(n).getArtefactos().get(i).getNombre() + "\n" +
                    "       Estados : \n" +
                            "       - " + "Activado: " +  this.listaCategoriasU().get(n).getArtefactos().get(i).isActivado() +
                            "       - " + "Desactivado: " +  this.listaCategoriasU().get(n).getArtefactos().get(i).isDesactivado() +
                            "       - " + "Bloqueado: " +  this.listaCategoriasU().get(n).getArtefactos().get(i).isBloqueado() + "\n");
        }
        System.out.println("----------------------------------------------------------------------------------------");

    }

    @Override
    public void crearArtefacto() {
        Scanner sc;
        String tipo = "";
        System.out.println("Ingrese el tipo de artefacto A o B");
        sc = new Scanner(System.in);
        tipo = sc.nextLine();


        if(tipo.equals("a") || tipo.equals("A")){
            fabrica.crearArteactoA();
            fabrica.getArtefactos().get(fabrica.getArtefactos().size()-1).setId(fabrica.getArtefactos().size());
            return;
        }
        if(tipo.equals("b") || tipo.equals("B")){
            fabrica.crearArteactoB();
            fabrica.getArtefactos().get(fabrica.getArtefactos().size()-1).setId(fabrica.getArtefactos().size());
            return;
        }
        System.out.println("Tipo de artefacto invalido");

    }

    @Override
    public void agregarArtefacto() {
        Scanner sc = new Scanner( System.in );

        System.out.println("Categorias de usuario: \n");
        verCategoriasUsuario();

        System.out.println("Ingrese el ID de la categoria para agregar artefacto\n");
        Integer m = sc.nextInt();
        if(isStringInteger(m.toString()) && m> -1 && m<listaCategoriasU().size()){
            System.out.println("Ingrese el ID del artefacto para agregar en la categoria\n");
            Integer n = sc.nextInt();
            if(isStringInteger(m.toString()) && n> -1 && n<this.fabrica.getArtefactos().size() ){
                listaCategoriasU().get(m).addArtefacto(this.fabrica.getArtefactos().get(n));
                System.out.println("Artefacto agregado correctamente a la categoria de ID: " + m);
            }
            else{
                System.out.println("ID del artefacto en la lista total de artefacto invalido\n");
                return;

            }

        }
        else{
            System.out.println("Indice de la categoria invalido\n");
            return;
        }








    }

    @Override
    public void eliminarArtefacto() {

    }

    private ArrayList<CategoriaUsuario> listaCategoriasU(){
        return listadoCategoriasU.categoriasU;
    }
    public static boolean isStringInteger(String stringToCheck) {
        int radix = 10;
        Scanner sc = new Scanner(stringToCheck.trim());
        if(!sc.hasNextInt(radix)) return false;
        sc.nextInt(radix);
        return !sc.hasNext();
    }

}
