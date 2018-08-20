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
public class Menu {
    
    //https://www.taringa.net/posts/hazlo-tu-mismo/15837167/Menues-y-sub-menues-iterativos-en-consola-de-Java.html
    //Guia para saber como hacer un menu con submenu
    
        //Hacemos varias intancias para llamar a las diferntes clases de forma ordenada,
        //y evitar equivocarnos lo menos posible al llevar un orden.
    
    //El Scanner es el que me va a leer los valores de entrada de cada uno de las opciones que desee ingresar
    Usuarios usuario = new Usuarios();
    MayorMenor tresnum = new MayorMenor();
    Contador contador = new Contador();
    Promedios calcularpromedio = new Promedios();
    
    // Pagina de apoyo y guia para poder colocarle color al texto en consola...
    //http://artachone.blogspot.com/2013/05/java-texto-de-colores-en-la-consola.html
    
    public void MenuPrincipal(){ //Cree este metodo para poder tener el menu principar y poder utilizarlo en cada una de las opciones disponibles sin hacerme bolas.
    //Se genera un try para evitar errores al ingresar letras en lugar de numeros.
    //La idea o recomendacion del try fue dada en la clase 4 del laboratorio IPC1.
        try{
        Scanner entrada = new Scanner(System.in);
        int opciones;
        do {
            System.out.println("\033[34m******MENU PRINCIPAL******\n");
            System.out.println("\033[32m1. Usuarios.");
            System.out.println("\033[32m2. Contador de digitos.");
            System.out.println("\033[32m3. Tres números de mayor a menor.");
            System.out.println("\033[321m4. Calcular promedio.");
            System.out.println("\033[321m5. Salir.");
            System.out.print("\033[31mSeleccione una Opcion: ");
            opciones = entrada.nextInt();
            //El Switch es para el reconocimiento de la opcion ingresada por el usuario y responder a lo indicado debajo
            switch (opciones) {                
                case 1:
                    usuario.InicioUsuarios();
                    break;
                case 2:
                    contador.InicioContador();
                    break;
                case 3:
                    tresnum.MaMe();
                    break;
                case 4:
                    calcularpromedio.InicioPromedio();
                    break;
                case 5:
                    System.out.println("\n\n\n\n\n\n");  //el "/n" es un salto de linea 
                    System.out.println("\033[33m¡NOS VEMOS, HASTA PRONTO :v !");
                    break;
                default:
                    System.out.println("¡¡¡OPCION NO VALIDA!!! Intente nuevamente...");
            }
        //Si el usuario ingresa el numero 5 por ser la opcion "salir" el programa se cerrara`
        
        } while (opciones != 5);
        }catch(Exception e){
            
            System.out.println("\033[31mDato erroneo, solo se permite el ingreso de numeros. ");
            MenuPrincipal();
        }
    }
   
}
