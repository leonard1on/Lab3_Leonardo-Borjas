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
        ArrayList<Jugador> general = new ArrayList();
        ArrayList<Equipo> equipo=new ArrayList();
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
                                + "4. Listar Jugadores\n"
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
                                            double nivel_definicion=sc.nextDouble();
                                            System.out.println("Cual es la altura del jugador?");
                                            double altura=sc.nextDouble();
                                            System.out.println("Cual es la velocidad del jugador?");
                                            double velocidad=sc.nextDouble();
                                            System.out.println("Cual es el promedio de goles del jugador?");
                                            double promedio_goles=sc.nextDouble();
                                            
                                            general.add(new Delantero(nivel_definicion, altura, velocidad, promedio_goles,nombre,apellido,edad,pais,pie,precio));
                                            break;
                                        case 2:
                                            System.out.println("Cual es el nivel de creatividad del jugador?");
                                            double nivel_creatividad=sc.nextDouble();
                                            System.out.println("Cual es el nivel de dominio del jugador?");
                                            double nivel_dominio=sc.nextDouble();
                                            System.out.println("Cual es el promedio de asistencias");
                                            double prom_asist=sc.nextDouble();
                                            
                                            general.add(new Medio(nivel_creatividad,nivel_dominio,prom_asist,nombre,apellido,edad,pais,pie,precio));
                                            break;
                                        case 3:
                                             System.out.println("Cual es el nivel de agresividad del jugador?");
                                            double nivel_agresividad=sc.nextDouble();
                                            System.out.println("Cual es la altura del jugador?");
                                            altura=sc.nextDouble();
                                            System.out.println("Cual es el peso del jugador?");
                                            double peso=sc.nextDouble();
                                            System.out.println("Cual es la velocidad del jugador?");
                                            velocidad=sc.nextDouble();
                                            
                                            general.add(new Defensa(nivel_agresividad,altura,peso,velocidad,nombre,apellido,edad,pais,pie,precio));
                                            break;
                                        case 4:
                                            System.out.println("Cual es el nivel de juego aereo del jugador?");
                                            double nivel_juego_aereo=sc.nextDouble();
                                            System.out.println("Cual es el nivel de juego con los pies jugador?");
                                            double nivel_juego_pies=sc.nextDouble();
                                            
                                            general.add(new Portero(nivel_juego_aereo,nivel_juego_pies,nombre,apellido,edad,pais,pie,precio));
                                    }
                                } while (menu3!=1 && menu3!=2 && menu3!=3 && menu3!=4);
                                break;
                            case 2:
                                break;
                            case 3:
                                System.out.println("Que numero de jugador desea eliminar\n");
                                for (Jugador t : general) {
                                    System.out.println("Jugador "+general.indexOf(t)+" "+t);
                                }
                                int espacio=sc.nextInt();
                                general.remove(espacio);
                                break;
                            case 4:
                                for (Jugador t : general) {
                                    System.out.println("Jugador "+general.indexOf(t)+" "+t);
                                }
                                break;
                            default:
                                break;

                        }
                    } while (menu2 != 5);
                    break;
                case 2:
                    int menu4=0;
                    do{
                    System.out.println("Que desea hacer?\n"
                            + "1. Crear equipo\n"
                            + "2. Organizar equipo\n"
                            + "3. listar equipos\n"
                            + "4. volver a menu principal");
                    menu4=sc.nextInt();
                    switch(menu4){
                        case 1:
                            System.out.println("Cual es el nombre del equipo?");
                            String nombre=sc.next();
                            System.out.println("Cuantos palmares tiene?");
                            int palmares=sc.nextInt();
                            System.out.println("En que ciudad esta el equipo?");
                            String ciudad=sc.next();
                            System.out.println("Cual es el presupuesto del equipo?");
                            double presupuesto=sc.nextDouble();
                            
                            equipo.add(new Equipo(nombre,palmares,ciudad,presupuesto));
                            
                            break;
                        case 2:
                            break;
                        case 3:
                            break;
                        default:
                            break;
                    }
                    }while(menu4!=4);
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
