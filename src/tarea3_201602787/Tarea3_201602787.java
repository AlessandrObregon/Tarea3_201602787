/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea3_201602787;

import java.util.Scanner;

/**
 *
 * @author oliver
 */
public class Tarea3_201602787 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        
        int respuesta;
        int n1;
        int n2;
        int n3;
                
        
        System.out.println("Menu de Operaciones");
        System.out.println("1. Usuarios");
        System.out.println("2. Contador de Números Repetidos");
        System.out.println("3. Tres números de Mayor a Menor");
        System.out.println("4. Calcular Promedio");
        System.out.println("5. Salir");
        
        respuesta=entrada.nextInt();
        
        switch(respuesta){
            case 1:
                break;
            case 2:
                break;
            case 3:
                System.out.println("Ingrese el primer número");
                n1=entrada.nextInt();
                System.out.println("Ingrese el segundo número");
                n2=entrada.nextInt();
                System.out.println("Ingrese el tercer número");
                n3=entrada.nextInt();
                
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
            case 4:
                break;
            case 5:
                break;    
        }
        
    }
    
}
