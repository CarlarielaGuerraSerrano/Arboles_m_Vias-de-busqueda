/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.practicosarboles;

import java.util.Scanner;

/**
 *
 * @author hp
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         MVias<Integer,String> arbol=new MVias<>(4);
        arbol.insertar(80,"a");
        arbol.insertar(120,"b");
        arbol.insertar(200,"c");
        arbol.insertar(50,"d");
        arbol.insertar(70, "e");
        arbol.insertar(75,"f");
        arbol.insertar(72,"g");
        arbol.insertar(98,"h");
        arbol.insertar(110,"i");
        arbol.insertar(130,"j");
        arbol.insertar(140,"a");
        arbol.insertar(150, "b");
        arbol.insertar(134, "c");
        arbol.insertar(160, "d");
          arbol.insertar(170, "b");
        arbol.insertar(190, "c");
        arbol.insertar(158, "d");
          arbol.insertar(400, "b");
        arbol.insertar(500, "c");
        arbol.insertar(560, "d");
          //System.out.println(arbol.recorridoPorNiveles());
        Scanner entrada=new Scanner(System.in);
        Scanner datos=new Scanner(System.in);
        System.out.println("                            SELECCION EL NUMERO DE PREGUNTA QUE DESEE");
        System.out.println("1:TODOS LOS METODOS DE LA INTERFAZ IMPLEMENTADOS");
        System.out.println("2:PREGUNTA 2");
        System.out.println("3:PREGUNTA 3");
        System.out.println("4:PREGUNTA 4");
        System.out.println("5:PREGUNTA 5");
        System.out.println("6:PREGUNTA 6");
        System.out.println("7:PREGUNTA 7");
        System.out.println("8:PREGUNTA 8");
        System.out.println("9:PREGUNTA 9");
        System.out.println("");
        System.out.println(arbol.recorridoPorNiveles());
        System.out.println(arbol.recorridoEnInOrden());
        String numeroPregunta=entrada.next();
        
        switch(numeroPregunta){

            case "2":                 
                 break;     
             case "3":
                 System.out.print("INGRESE EL NIVEL A BUSCAR : ");
                 int x=datos.nextInt();
                 System.out.print(arbol.contarDatosNoVaciosEnNivel(x));
                 break;
             case "4":
                 System.out.print("INGRESE EL NIVEL A BUSCAR : ");
                 int niv=datos.nextInt();
                 System.out.print(arbol. cantidadDeHojasEnUnNivel(niv));
                 break;
             case "5":
                 System.out.print("INGRESE EL HASTA DONDE SE BUSCARA : ");
                 int n=datos.nextInt();
                 System.out.print(arbol.cantidadDeVaciosYNoVaciosAntesDeN(n));
                 break;
             case "6":
                 System.out.print("LA CNATIDAD DE HOJAS EN EL FINAL ES : ");
                 System.out.print(arbol. HaySoloHojasAlFinal());
                 break;
             case "7":
                 
                 break;
             case "8":
                 System.out.println("BUSCAR EL SUCESOR EN INORDEN DE :  ");
                 int claveABuscar=datos.nextInt();
                 System.out.print(arbol.sucesorInOrden(claveABuscar));
                 break;
                
             case "9":
                 System.out.print("TODOS LOS NODOS HOJAS NO TIENEN DATOS VACIOS:  ");
                 System.out.print(arbol.todosLosNosHojasNoTieneVacios());
                 break;
             default :
                 System.out.println("ingrese una opcion valida");
        }
                


        
        
        
      
       
     
    }
    
}
