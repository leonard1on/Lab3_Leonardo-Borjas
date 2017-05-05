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
public class Medio extends Jugador{
    private double nivel_creatividad;
    private double nivel_dominio;
    private double promedio_asist;

    public Medio() {
        super();
    }

    public Medio(double nivel_creatividad, double nivel_dominio, double promedio_asist, String nombre, String apellido, int edad, String pais, String pie_prefe, double precio) {
        super(nombre, apellido, edad, pais, pie_prefe, precio);
        this.nivel_creatividad = nivel_creatividad;
        this.nivel_dominio = nivel_dominio;
       
        this.promedio_asist = promedio_asist;
    }

    public double getNivel_creatividad() {
        return nivel_creatividad;
    }

    public void setNivel_creatividad(double nivel_creatividad) {
        this.nivel_creatividad = nivel_creatividad;
    }

    public double getNivel_dominio() {
        return nivel_dominio;
    }

    public void setNivel_dominio(double nivel_dominio) {
        this.nivel_dominio = nivel_dominio;
    }

   

    public double getPromedio_asist() {
        return promedio_asist;
    }

    public void setPromedio_asist(double promedio_asist) {
        this.promedio_asist = promedio_asist;
    }

    @Override
    public String toString() {
        return super.toString()+"Medio{" + "nivel_creatividad=" + nivel_creatividad + ", nivel_dominio=" + nivel_dominio + ", promedio_asist=" + promedio_asist + '}';
    }
    
    
    
}
