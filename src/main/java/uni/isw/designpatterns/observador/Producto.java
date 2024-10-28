package uni.isw.designpatterns.observador;

import java.util.ArrayList;
import java.util.List;

public class Producto implements SujetoObservable {
    private String nombre;
    private double precio;
    private List<Observador> observadores;

    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
        this.observadores=new ArrayList<>();
    }

    public void setPrecio(double precio) {
        this.precio = precio;
        notificar();
    }

    public double getPrecio() {
        return precio;
    }

    public String getNombre() {
        return nombre;
    }    
    
    @Override
    public void agregarObservador(Observador observador) {
        observadores.add(observador);
    }

    @Override
    public void eliminarObservador(Observador observador) {
        observadores.remove(observador);
    }

    @Override
    public void notificar() {
        for(Observador observador:observadores)
            observador.actualizar(this);
    }

    @Override
    public String toString() {
        return "Producto{" + "nombre=" + nombre + ", precio=" + precio + '}';
    }
}
