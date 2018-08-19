/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea3_201602787;

import java.util.Scanner;
/**
 *
 * @author oliver Obregon
 */
public class Usuarios {
    
    
    //Se declara el vector
    public String VectorUsuarios [] = new String [5];
    
    
    //Genera saltos de linea para limpiar la pantalla
    public void SaltoLinea(){
        for (int i = 0; i < 35; i++) {
            System.out.println("");
        }
    }
    
    public void SaltoLineaPequeño(){
        for (int i = 0; i < 10; i++) {
            System.out.println("");
        }
    }
    
    //Para Que Aparezca El Menu Principal Nuevamente.
    public void InicioUsuarios(){
    try{
        Menu menu = new Menu();
        Scanner lector = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("\033[32m1. Ingresar Los Usuarios");
            System.out.println("\033[32m2. Mostrar Los Usuarios Ascendente");
            System.out.println("\033[32m3. Mostrar Los Usuarios Descendente");
            System.out.println("\033[32m4. Menu principal");
            System.out.print("\033[36m-Seleccione una Opcion: ");
            opcion = lector.nextInt();
            switch (opcion) {
                case 1:
                    SaltoLinea();
                    IngresoUsuarios();
                    break;
                case 2:
                    SaltoLinea();
                    UsuariosAscendente();
                    break;
                case 3:
                    SaltoLinea();
                    UsuariosDescendentes();
                    break;
                case 4:
                    SaltoLinea();
                    menu.MenuPrincipal();
                    break;
                default:
                    SaltoLinea();
                    System.out.println("OPCION NO VALIDA");                            
            }
        } while (opcion!=4);
        //Excepcion que muestra un mensaje de error al ingresar letras
        }catch(Exception e){
            SaltoLinea();
            System.out.println("\033[31mSolo se permite el ingreso de numeros");
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
        SaltoLinea();
    }
    
    //Se muestra el vector en orden Ascendente
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

