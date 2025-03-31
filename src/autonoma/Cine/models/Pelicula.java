/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.Cine.models;


public class Pelicula {
        private String titulo;
    private double costoBase;

    public Pelicula(String titulo, double costoBase) {
        this.titulo = titulo;
        this.costoBase = costoBase;
    }

    public double getCostoBase() {
        return costoBase;
    }
    
}
