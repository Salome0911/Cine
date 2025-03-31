/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.Cine.models;

/**
 *
 * @author Salo
 */
public class Usuario {
    private String tipo;
    private double descuento;

    public Usuario(String tipo, double descuento) {
        this.tipo = tipo;
        this.descuento = descuento;
    }

    public double getDescuento() {
        return descuento;
    }
}
