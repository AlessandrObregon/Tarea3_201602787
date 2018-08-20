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
public class MayorMenor {
  
    //Declaro el vector y los int necesarios que en este caso son tres.
    public int VectorContador [] = new int [3];
    public int n1, n2, n3; //Declaro 3 variables de tipo entero para ordenarlos de mayor a menor
    
    public void MaMe(){
        //Se genera un try para evitar errores al ingresar letras en lugar de numeros.
        //La idea o recomendacion del try fue dada en la clase 4 del laboratorio IPC1.
        try{
        Menu menu = new Menu();
        Scanner entrada = new Scanner(System.in); //el Scanner es el que me va a leer los valores de entrada que le de
         int respuesta = 0;
        do {
            System.out.println("\033[32m1. Ingresar números");
            System.out.println("\033[32m2. Mostrar Números ordenados");
            System.out.println("\033[32m3. Menú principal");
            System.out.print("\033[31mSeleccione una Opcion: ");
            respuesta=entrada.nextInt();
            switch (respuesta) {                
                case 1:
                 System.out.println("Ingrese el primer número:");
                n1=entrada.nextInt();                               //me guarda el dato ingresado
                System.out.println("Ingrese el segundo número:");
                n2=entrada.nextInt();
                System.out.println("Ingrese el tercer número:");
                n3=entrada.nextInt();
                    
                    break;
                case 2:
                    
                    // Este es mi metodo de ordenar los numeros de mayor a menor
                      if (n1>n2 && n2>n3){
                   
                   System.out.println("\033[34mLos Números Ordenados de Mayor a Menor son: "+n1+","+n2+","+n3);  
               } 
               else if(n1>n3 && n3>n2){
                    System.out.println("\033[34mLos Números Ordenados de Mayor a Menor son: "+n1+","+n3+","+n2);  
                }
               else if(n2>n1 && n1>n3){
                    System.out.println("\033[34mLos Números Ordenados de Mayor a Menor son: "+n2+","+n1+","+n3);  
                }
               else if(n2>n3 && n3>n1){
                    System.out.println("\033[34mLos Números Ordenados de Mayor a Menor son: "+n2+","+n3+","+n1);  
                }
               else if(n3>n1 && n1>n2){
                    System.out.println("\033[34mLos Números Ordenados de Mayor a Menor son: "+n3+","+n1+","+n2);  
                }
               else if(n3>n2 && n2>n1){
                    System.out.println("\033[34mLos Números Ordenados de Mayor a Menor son: "+n3+","+n2+","+n1);  
                }
                    
                    break;
                case 3:
                    //Para Que Aparezca El Menu Principal Nuevamente.
                    menu.MenuPrincipal();
                    break;
                default:
                    
                    System.out.println("¡¡¡OPCION NO VALIDA!!! Intente nuevamente...");      
            }
        } while (respuesta!=3);
        }catch(Exception e){
            
            System.out.println("\033[31mDato erroneo, solo se permite el ingreso de numeros.");
            MaMe();
        }
    }
    
}


