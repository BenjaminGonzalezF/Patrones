/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bridge;

import java.util.ArrayList;


/**
 *
 * @author 20376205
 */
public class ListadoCategoriasUsuario {
    
    
    static private ListadoCategoriasUsuario categoriasUsuario = null;
    public ArrayList<FactoryMethod.CategoriaUsuario> categoriasU = new ArrayList<FactoryMethod.CategoriaUsuario>();

    
 
     public ListadoCategoriasUsuario() { }
 
     static public ListadoCategoriasUsuario obtenerListadoCategoriasU() {
         if (categoriasUsuario == null) {
             categoriasUsuario = new ListadoCategoriasUsuario();
         }
         return categoriasUsuario;
     }
     
     
     
     
     
     
     
     
 
}
