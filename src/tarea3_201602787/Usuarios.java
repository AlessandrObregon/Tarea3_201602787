/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea3_201602787;

import java.util.Scanner; //Importación de la clase Scanner para leer datos del teclado
/**
 *
 * @author oliver Obregon
 */
public class Usuarios {
    
    
    //Se declara el vector
    public String VectorUsuarios [] = new String [5];
    
    
    
    public void SaltoLineaPequeño(){
        for (int i = 0; i < 5; i++) {
            System.out.println("");
        }
    }
    
   
    public void InicioUsuarios(){
        //Se genera un try para evitar errores al ingresar letras en lugar de numeros.
        //La idea o recomendacion del try fue dada en la clase 4 del laboratorio IPC1.
    try{
        Menu menu = new Menu();
        Scanner lector = new Scanner(System.in);
        int opcion;
        // ejemplo de referencia y guia de como regresar al menu principal con un DO WHILE
        //https://www.youtube.com/watch?v=mzAHMVctGtA&t=281s
        do {
            System.out.println("\033[32m1. Ingresar Los Usuarios");
            System.out.println("\033[32m2. Mostrar Los Usuarios Ascendente");
            System.out.println("\033[32m3. Mostrar Los Usuarios Descendente");
             //Para Que Aparezca El Menu Principal Nuevamente.
            System.out.println("\033[32m4. Menu principal");
            System.out.print("\033[31mSeleccione una Opcion: ");
            opcion = lector.nextInt();
            switch (opcion) {
                case 1:
                    
                    IngresoUsuarios();
                    break;
                case 2:
                    
                    UsuariosAscendente();
                    break;
                case 3:
                    
                    UsuariosDescendentes();
                    break;
                case 4:
                    //Para Que Aparezca El Menu Principal Nuevamente.
                    menu.MenuPrincipal();
                    break;
                default:
                    
                    System.out.println("¡¡¡OPCION NO VALIDA!!! Intente nuevamente...");                            
            }
        } while (opcion!=4);
        //Excepcion que muestra un mensaje de error al ingresar letras
        }catch(Exception e){
            
            System.out.println("\033[31mDato erroneo, solo se permite el ingreso de numeros.");
            InicioUsuarios();
        }
    }
    
    //Se genera el llenado del vector usando Scanner que recorre el vector
    public void IngresoUsuarios(){
        Scanner Ingreso = new Scanner(System.in);
        String nombre;
        for (int i = 0; i < VectorUsuarios.length; i++) {
            System.out.println("Ingrese el nombre: " + (i+1));
            nombre = Ingreso.nextLine();
            VectorUsuarios[i] = nombre;
        }
        
    }
    
    //Muestra el vector en orden Ascendente
    public void UsuariosAscendente(){
        System.out.println("Los usuarios en orden ascendente son:");
        System.out.println(VectorUsuarios[4]);
        System.out.println(VectorUsuarios[3]);
        System.out.println(VectorUsuarios[2]);
        System.out.println(VectorUsuarios[1]);
        System.out.println(VectorUsuarios[0]);
        SaltoLineaPequeño();
    }
    
    
    //Se muestra el vector en el orden que se ingreso
    public void UsuariosDescendentes(){
        System.out.println("Los usuarios en orden descendente son:");
        for (String i: VectorUsuarios) {
            System.out.println(i);
        }
        SaltoLineaPequeño();
    }
    
}

