/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.Cine.models;

/**
 *
 * @author Estudiante
 */
public class Funcion {
    private Pelicula pelicula;
    private double descuento;

    public Funcion(Pelicula pelicula, double descuento) {
        this.pelicula = pelicula;
        this.descuento = descuento;
    }

    // Calcula el precio de la función aplicando el descuento
    public double getPrecio() {
        return pelicula.getCostoBase() * (1 - descuento);
    }
}
