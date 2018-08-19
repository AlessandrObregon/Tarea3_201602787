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
public class MayorMenor {
  
    //Declaro el vector y los int necesarios
    public int VectorContador [] = new int [3];
    public int n1, n2, n3; //Declaro 3 variables de tipo entero para ordenarlos de mayor a menor
    
    public void TresNumeros(){
        try{
        Menu menu = new Menu();
        Scanner lector = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("\033[36m1. Ingresar numeros");
            System.out.println("\033[36m2. Mostrar ordenados");
            System.out.println("\033[36m3. Menu principal");
            System.out.print("\033[32m-Seleccione una Opcion: ");
            opcion = lector.nextInt();
            switch (opcion) {                
                case 1:
                    
                    
                    break;
                case 2:
                    
                    
                    break;
                case 3:
                    
                    menu.MenuPrincipal();
                    break;
                default:
                    
                    System.out.println("OPCION NO VALIDA");      
            }
        } while (opcion!=3);
        }catch(Exception e){
            
            System.out.println("\033[31mSolo se permite el ingreso de numeros");
            TresNumeros();
        }
    }
    
}


