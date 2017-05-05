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
public class Jugador {
    private String nombre;
    private String apellido;
    private int edad;
    private Boolean estado;
    private String pais;
    private String pie_prefe;
    private int numero;
    private double precio;
    private Equipo e;

    public Jugador() {
    }

    public Jugador(String nombre, String apellido, int edad, String pais, String pie_prefe, double precio) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.pais = pais;
        this.pie_prefe = pie_prefe;
        this.precio = precio;
        this.numero=0;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Boolean getEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getPie_prefe() {
        return pie_prefe;
    }

    public void setPie_prefe(String pie_prefe) {
        this.pie_prefe = pie_prefe;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public Equipo getE() {
        return e;
    }

    public void setE(Equipo e) {
        this.e = e;
    }

    @Override
    public String toString() {
        return "Jugador{" + "nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + ", estado=" + estado + ", pais=" + pais + ", pie_prefe=" + pie_prefe + ", numero=" + numero + ", precio=" + precio + ", e=" + e + '}';
    }
    
    
}
