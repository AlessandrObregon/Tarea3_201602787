/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

//https://www.youtube.com/watch?v=P_x6l2oDm98 link de apoyo para poder entender los contadores de  digitos


package tarea3_201602787;
import java.util.Scanner; //Importación de la clase Scanner para leer datos del teclado

/**
 *
 * @author oliver Obregon
 */
public class Contador {
    
     //Declaro las variables de tipo intero que necesito
    int ContNum;
    int ContDigi = 0;
    
    //Muestra la cantidad de digitos que contiene el valor
    public void MostrarDigitos(){
        System.out.println("\033[34mEl número tiene " + ContDigi+ " digitos");
    }
    
    //Se ingresa y se hace el recuento de los digitos que contiene el valor ingresado
    public void IngresarDigito(){
        Scanner entradacontador = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        ContNum = entradacontador.nextInt();
        while (ContNum >=1){
        ContNum = ContNum/10;
        ContDigi++;
           
        }
    }
    
  
    public void InicioContador(){
        //Se genera un try para evitar errores al ingresar letras en lugar de numeros.
        //La idea o recomendacion del try fue dada en la clase 4 del laboratorio IPC1.
        try{
        Menu menu = new Menu();
        Scanner entradas = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("\033[32m1. Ingresar numero");
            System.out.println("\033[32m2. Mostrar numero de digitos");
            System.out.println("\033[32m3. Menu principal");
            System.out.print("\033[31mSeleccione una Opcion: ");
            opcion = entradas.nextInt();  //leo el numero ingresado
            switch (opcion) {                
                case 1:           
                    IngresarDigito();
                    break;
                case 2:
                    MostrarDigitos();
                    break;
                case 3:
                    //Para Que Aparezca El Menu Principal Nuevamente.
                    menu.MenuPrincipal();
                    break;
                default:
                    ;
                    System.out.println("\033[31m¡¡¡OPCION NO VALIDA!!! Intente nuevamente...");                            
            }
        } while (opcion!=3);
        }catch(Exception e){
            
            System.out.println("\033[31mDato erroneo, solo se permite el ingreso de numeros.");
            InicioContador();
        }
    }
     
    
  
}
