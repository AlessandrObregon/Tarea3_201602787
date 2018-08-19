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
public class Menu {
        //Hacemos varias intancias para llamar a las diferntes clases de forma ordenada,
        //y evitar equivocarnos lo menos posible al llevar un orden.
    Usuarios usuario = new Usuarios();
   MayorMenor tresnum = new MayorMenor();
    
    
    // Pagina de apoyo y guia para poder colocarle color al texto en consola...
    //http://artachone.blogspot.com/2013/05/java-texto-de-colores-en-la-consola.html
    
    public void MenuPrincipal(){
    //Se genera un try para evitar errores al ingresar letras en lugar de numeros.
    //La idea o recomendacion del try fue dada en la clase 4 del laboratorio IPC1.
        try{
        Scanner entrada = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("******MENU PRINCIPAL******\n");
            System.out.println("\033[32m1. Usuarios.");
            System.out.println("\033[32m2. Contador de digitos.");
            System.out.println("\033[32m3. Tres números de mayor a menor.");
            System.out.println("\033[321m4. Calcular promedio.");
            System.out.println("\033[321m5. Salir.");
            System.out.print("\033[36m-Seleccione una Opcion: ");
            opcion = entrada.nextInt();
            //El Switch es para el reconocimiento de la opcion ingresada por el usuario y responder a lo indicado debajo
            switch (opcion) {                
                case 1:
                    SaltoLinea();
                    usuario.InicializarUsuarios();
                    break;
                case 2:
                    
                    break;
                case 3:
                    SaltoLinea();
                    tresnum.TresNumeros();
                    break;
                case 4:
                    
                    break;
                case 5:
                    SaltoLinea();
                    System.out.println("\033[33m¡HASTA PRONTO :v !");
                    break;
                default:
                    SaltoLinea();
                    System.out.println("OPCION NO VALIDA.");
            }
        //Si el usuario ingresa el numero 5 por ser la opcion "salir" el programa se cerrara`
        
        } while (opcion != 5);
        }catch(Exception e){
            SaltoLinea();
            System.out.println("\033[31mDato erroneo, solo se permite el ingreso de numeros. ");
            MenuPrincipal();
        }
    }
    
    //Este generara unos saltos de linea para limpiar la pantalla, para que no se vea tan desordenado.
    public static void SaltoLinea(){
        for (int i = 0; i < 35; i++) {
            System.out.println("");
        }
    }
}
