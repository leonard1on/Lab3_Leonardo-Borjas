/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3_leonardo.borjas;

import java.util.ArrayList;

/**
 *
 * @author Leonardo Borjas
 */
public class Equipo {
    private String nombre;
    private int palmares;
    private String ciudad;
    private double presupuesto;
    private ArrayList<Jugador> jugadores=new ArrayList();

    public Equipo() {
    }

    public Equipo(String nombre, int palmares, String ciudad, double presupuesto) {
        this.nombre = nombre;
        this.palmares = palmares;
        this.ciudad = ciudad;
        this.presupuesto = presupuesto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPalmares() {
        return palmares;
    }

    public void setPalmares(int palmares) {
        this.palmares = palmares;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public double getPresupuesto() {
        return presupuesto;
    }

    public void setPresupuesto(double presupuesto) {
        this.presupuesto = presupuesto;
    }

    public ArrayList<Jugador> getJugadores() {
        return jugadores;
    }

    public void setJugadores(ArrayList<Jugador> jugadores) {
        this.jugadores = jugadores;
    }

    @Override
    public String toString() {
        return "Equipo{" + "nombre=" + nombre + ", palmares=" + palmares + ", ciudad=" + ciudad + ", presupuesto=" + presupuesto + ", jugadores=" + jugadores + '}';
    }
    
}
