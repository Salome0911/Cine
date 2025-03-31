
package autonoma.Cine.models;

public class Funcion {
     private Pelicula pelicula;
    private double descuento;

    public Funcion(Pelicula pelicula, double descuento) {
        this.pelicula = pelicula;
        this.descuento = descuento;
    }

    public double getPrecio() {
        return pelicula.getCostoBase() * (1 - descuento);
    }
}
