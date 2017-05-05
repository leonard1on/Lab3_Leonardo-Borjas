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
public class Delantero extends Jugador{
    private double nivel_definicion;
    private double altura;
    private double velocidad;
    private double promedio_goles;

    public Delantero() {
        super();
    }

    public Delantero(double nivel_definicion, double altura, double velocidad, double promedio_goles, String nombre, String apellido, int edad, String pais, String pie_prefe, double precio) {
        super(nombre, apellido, edad, pais, pie_prefe, precio);
        this.nivel_definicion = nivel_definicion;
        this.altura = altura;
        this.velocidad = velocidad;
        this.promedio_goles = promedio_goles;
    }

    public double getNivel_definicion() {
        return nivel_definicion;
    }

    public void setNivel_definicion(double nivel_definicion) {
        this.nivel_definicion = nivel_definicion;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(double velocidad) {
        this.velocidad = velocidad;
    }

    public double getPromedio_goles() {
        return promedio_goles;
    }

    public void setPromedio_goles(double promedio_goles) {
        this.promedio_goles = promedio_goles;
    }

    @Override
    public String toString() {
        return super.toString()+"\nPosicion= Delantero" + "\nnivel_definicion=" + nivel_definicion + "\naltura=" + altura + "\nvelocidad=" + velocidad + "\npromedio_goles=" + promedio_goles+"\n";
    }
    
    
    
}
