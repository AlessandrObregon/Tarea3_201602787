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
public class Promedios {
    
    //Declaro la matriz de 6x6 que me solicitan
    public int MatrizContador [][] = new int [6][6];
    
    public void InicioPromedio(){
        //Se genera un try para evitar errores al ingresar letras en lugar de numeros.
        //La idea o recomendacion del try fue dada en la clase 4 del laboratorio IPC1.
        try{
        Menu menu = new Menu();
        Scanner lector = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("\033[32m1. Ingresar Notas");
            System.out.println("\033[32m2. Calcular Promedio");
            System.out.println("\033[32m3. Menu principal");
            System.out.print("\033[31mSeleccione una Opcion: ");
            opcion = lector.nextInt();
            switch (opcion) {                
                case 1:
                    SaltoLinea();
                    IngresarDatos();
                    break;
                case 2:
                    SaltoLinea();
                    Promedio();
                    break;
                case 3:
                    SaltoLinea();
                    //Para Que Aparezca El Menu Principal Nuevamente.
                    menu.MenuPrincipal();
                    break;
                default:
                    SaltoLinea();
                    System.out.println("¡¡¡OPCION NO VALIDA!!! Intente nuevamente...");                            
            }
        } while (opcion!=3);
        }catch(Exception e){
            SaltoLinea();
            System.out.println("\033[31mDato erroneo, solo se permite el ingreso de numeros.");
            InicioPromedio();
        }
    }
    
    //Genera saltos de linea para limpiar la consola y que se vea un poco mas ordenado...
    public void SaltoLinea(){
        for (int i = 0; i < 20; i++) {
            System.out.println("");
        }
    }
    
    //Se genera la matriz con valores predeterminados para el ID por entrar y llena con datos al azar como el usuario desee.
    //En este caso son limitados los espacios de 6x6 y le doy las coordenadas especificas en las cuales quiero que guarde ese dato ingresado
    public void IngresarDatos(){
        Scanner Entrada = new Scanner(System.in);
        for (int i=0; i < MatrizContador.length; i++) {
            for (int j=1; j < 5; j++) {
                System.out.println("Introduzca la nota [" + j + "," + i + "]");
                MatrizContador[j][i] = Entrada.nextInt();
                MatrizContador[0][0] = 1;
                MatrizContador[0][1] = 2;
                MatrizContador[0][2] = 3;
                MatrizContador[0][3] = 4;
                MatrizContador[0][4] = 5;
                MatrizContador[0][5] = 6;
            }
        }
    }
    
    //Hace los calculos de promedio y muestra la matriz con todos los datos ingresados...
    public void Promedio(){
        //Se calculan los promedios de las notas que el usuario ingreso.
        int Prom1, Prom2, Prom3, Prom4, Prom5, Prom6;
        int Tot1, Tot2, Tot3, Tot4, Tot5, Tot6;
        //sumo cada coordenada especificada y el resultado lo guardo en la variable designada en cada una de las filas.
        Prom1 = MatrizContador[1][0]+ MatrizContador[2][0]+MatrizContador[3][0]+MatrizContador[4][0];
        Tot1 = Prom1/4; 
        MatrizContador[5][0] = Tot1;
        Prom2 = MatrizContador[1][1]+ MatrizContador[2][1]+MatrizContador[3][1]+MatrizContador[4][1];
        Tot2 = Prom2/4;
        MatrizContador[5][1] = Tot2;
        Prom3 = MatrizContador[1][2]+ MatrizContador[2][2]+MatrizContador[3][2]+MatrizContador[4][2];
        Tot3 = Prom3/4;
        MatrizContador[5][2] = Tot3;
        Prom4 = MatrizContador[1][3]+ MatrizContador[2][3]+MatrizContador[3][3]+MatrizContador[4][3];
        Tot4 = Prom4/4;
        MatrizContador[5][3] = Tot4;
        Prom5 = MatrizContador[1][4]+ MatrizContador[2][4]+MatrizContador[3][4]+MatrizContador[4][4];
        Tot5 = Prom5/4;
        MatrizContador[5][4] = Tot5;
        Prom6 = MatrizContador[1][5]+ MatrizContador[2][5]+MatrizContador[3][5]+MatrizContador[4][5];
        Tot6 = Prom6/4;
        MatrizContador[5][5] = Tot6;
        //Para mostrar los datos:
        for (int j = 0; j < 6; j++) {
            //Muestra la matriz de forma ordenada
            //imprimiendo el valor ingresado en la primera celda hasta la cinco y en la celda del contaador se muestra el promedio que se calculo en cada una de las filas
            System.out.print(MatrizContador[0][j]+"\t");
            System.out.print(MatrizContador[1][j]+"\t");
            System.out.print(MatrizContador[2][j]+"\t");  //el "/t"  Es una secuencia de escape ,te deja un espacio horizontalmente (Tab)
            System.out.print(MatrizContador[3][j]+"\t");
            System.out.print(MatrizContador[4][j]+"\t");
            System.out.print(MatrizContador[5][j]+"\t");
            System.out.print("\n");   //el "/n" es un salto de linea 
        }
        
    }
}