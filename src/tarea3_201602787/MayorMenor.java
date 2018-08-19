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
        Scanner entrada = new Scanner(System.in);
         int respuesta = 0;
        do {
            System.out.println("\033[36m1. Ingresar números");
            System.out.println("\033[36m2. Mostrar Números ordenados");
            System.out.println("\033[36m3. Menú principal");
            System.out.print("\033[31m-Seleccione una Opcion: ");
            respuesta=entrada.nextInt();
            switch (respuesta) {                
                case 1:
                    System.out.println("Ingrese el primer número:");
                n1=entrada.nextInt();
                System.out.println("Ingrese el segundo número:");
                n2=entrada.nextInt();
                System.out.println("Ingrese el tercer número:");
                n3=entrada.nextInt();
                    
                    break;
                case 2:
                      if (n1>n2 && n2>n3){
                   
                   System.out.println("Los Números Ordenados de Mayor a Menor son: "+n1+","+n2+","+n3);  
               } 
               else if(n1>n3 && n3>n2){
                    System.out.println("Los Números Ordenados de Mayor a Menor son: "+n1+","+n3+","+n2);  
                }
               else if(n2>n1 && n1>n3){
                    System.out.println("Los Números Ordenados de Mayor a Menor son: "+n2+","+n1+","+n3);  
                }
               else if(n2>n3 && n3>n1){
                    System.out.println("Los Números Ordenados de Mayor a Menor son: "+n2+","+n3+","+n1);  
                }
               else if(n3>n1 && n1>n2){
                    System.out.println("Los Números Ordenados de Mayor a Menor son: "+n3+","+n1+","+n2);  
                }
               else if(n3>n2 && n2>n1){
                    System.out.println("Los Números Ordenados de Mayor a Menor son: "+n3+","+n2+","+n1);  
                }
                    
                    break;
                case 3:
                    
                    menu.MenuPrincipal();
                    break;
                default:
                    
                    System.out.println("OPCION NO VALIDA");      
            }
        } while (respuesta!=3);
        }catch(Exception e){
            
            System.out.println("\033[31mSolo se permite el ingreso de numeros");
            TresNumeros();
        }
    }
    
}


