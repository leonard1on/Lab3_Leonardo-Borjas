/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3_leonardo.borjas;

/**
 *
 * @author Leonardo Borjas
 */
public class Portero extends Jugador{
    private double nivel_juego_aereo;
    private double nivel_juego_pies;

    public Portero() {
        super();
    }

    public Portero(double nivel_juego_aereo, double nivel_juego_pies, String nombre, String apellido, int edad, String pais, String pie_prefe, double precio) {
        super(nombre, apellido, edad, pais, pie_prefe, precio);
        this.nivel_juego_aereo = nivel_juego_aereo;
        this.nivel_juego_pies = nivel_juego_pies;
    }

    public double getNivel_juego_aereo() {
        return nivel_juego_aereo;
    }

    public void setNivel_juego_aereo(double nivel_juego_aereo) {
        this.nivel_juego_aereo = nivel_juego_aereo;
    }

    public double getNivel_juego_pies() {
        return nivel_juego_pies;
    }

    public void setNivel_juego_pies(double nivel_juego_pies) {
        this.nivel_juego_pies = nivel_juego_pies;
    }

    @Override
    public String toString() {
        return super.toString()+"\nPosicion=Portero{" + "\nnivel_juego_aereo=" + nivel_juego_aereo + "\nnivel_juego_pies=" + nivel_juego_pies+"\n";
    }
    
    
}
