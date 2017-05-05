/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3_leonardo.borjas;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Leonardo Borjas
 */
public class Lab3_LeonardoBorjas {

    static Scanner sc = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int menu = 0;
        int menu2 = 0;
        int salida = 0;
        ArrayList desempleados = new ArrayList();
        do {
            System.out.println("*****MENU*****\n"
                    + "1. Menu de Jugadores\n"
                    + "2. Menu de Equipos\n"
                    + "3. Hacer Compras\n"
                    + "4. Salir");
            menu = sc.nextInt();
            switch (menu) {
                case 1:
                    do {
                        System.out.println("Que desea hacer?\n"
                                + "1. Crear Jugador\n"
                                + "2. Modificar Jugador\n"
                                + "3. Eliminar Jugador\n"
                                + "4. Listar Jugadores desempleados\n"
                                + "5. Volver al menu principal");
                        menu2 = sc.nextInt();
                        switch (menu2) {
                            case 1:
                                String pie = "";
                                System.out.println("Cual es el nombre del Jugador");
                                String nombre = sc.next();
                                System.out.println("Cual es el apellido del Jugador");
                                String apellido = sc.next();
                                System.out.println("Cual es la edad del Jugador");
                                int edad=sc.nextInt();
                                System.out.println("Cual es el pais de nacimiento");
                                String pais = sc.next();
                                do {
                                    salida = 0;
                                    System.out.println("Cual es el pie preferido");
                                    pie = sc.next();
                                    if (!"derecho".equals(pie)) {
                                        if (!"izquierdo".equals(pie)) {
                                            System.out.println("Eliga derecho o izquierdo");
                                            salida=1;
                                        }
                                    }
                                } while (salida != 0);
                                System.out.println("Cual es el precio del Jugador");
                                double precio = sc.nextDouble();
                                int menu3=0;
                                do {
                                    System.out.println("Que posicion juega el Jugador?\n"
                                            + "1. Delantero\n"
                                            + "2. Medio\n"
                                            + "3. Defensa\n"
                                            + "4. Portero\n");
                                    menu3=sc.nextInt();
                                    switch(menu3){
                                        case 1:
                                            System.out.println("Cual es el nivel de definicion del jugador?");
                                            
                                            break;
                                        case 2:
                                            break;
                                        case 3:
                                            break;
                                        case 4:
                                            break;
                                    }
                                } while (menu3!=1 );
                                
                                
                                desempleados.add(new Jugador(nombre, apellido, edad, pais, pie, precio));
                                break;
                            case 2:
                                break;
                            case 3:
                                break;
                            case 4:
                                break;
                            default:
                                break;

                        }
                    } while (menu2 != 5);
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                default:
                    break;
            }
        } while (menu != 4);

    }

}
