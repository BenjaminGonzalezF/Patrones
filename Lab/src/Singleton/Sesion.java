/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Singleton;

import Bridge.Control;
import java.util.Scanner;

/**
 *
 * @author 20376205
 */
public class Sesion {
    
    static private Sesion sesionActiva = null;
 
     public Sesion() { }
 
     static public Sesion obtenerSesion() {
 
         if (sesionActiva == null) {
             sesionActiva = new Sesion();
         }
         return sesionActiva;
     }
 
     
     public static void formulario() {
        Scanner sc;
        boolean sesion = true;
        String nombreUsuario = "", pass = "";

        while (!(nombreUsuario.equals("admin") && pass.equals("admin"))) {
            System.out.println("Ingrese su nombre de usuario (la correcta es admin)");
            sc = new Scanner(System.in);
            nombreUsuario = sc.nextLine();
            System.out.println("Ingrese su contraseña (la correcta es admin)");
            pass = sc.nextLine();
        }
        Control control = new Control();
        control.menu();
        
    }
     
     
  
     
}
