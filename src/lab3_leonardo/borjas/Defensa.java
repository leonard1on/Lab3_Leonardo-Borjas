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
public class Defensa extends Jugador{
    private double nivel_agresividad;
    private double altura;
    private double peso;
    private double velocidad;

    public Defensa() {
        super();
    }

    public Defensa(double nivel_agresividad, double altura, double peso, double velocidad, String nombre, String apellido, int edad, String pais, String pie_prefe, double precio) {
        super(nombre, apellido, edad, pais, pie_prefe, precio);
        this.nivel_agresividad = nivel_agresividad;
        this.altura = altura;
        this.peso = peso;
        this.velocidad = velocidad;
    }

    public double getNivel_agresividad() {
        return nivel_agresividad;
    }

    public void setNivel_agresividad(double nivel_agresividad) {
        this.nivel_agresividad = nivel_agresividad;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(double velocidad) {
        this.velocidad = velocidad;
    }

    @Override
    public String toString() {
        return super.toString()+"Defensa{" + "nivel_agresividad=" + nivel_agresividad + ", altura=" + altura + ", peso=" + peso + ", velocidad=" + velocidad + '}';
    }
    
    
}
